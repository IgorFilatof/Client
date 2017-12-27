package controller;


import gui.Gui;
import model.Task;

import java.io.*;
import java.net.Socket;
import java.time.LocalDateTime;


/**
 * Created by Игорь on 21.12.2017.
 */
public class Controller {
    private Socket socket;
    private ObjectOutput objectOutputStream;

    public Controller() {

        try {
            socket = new Socket("127.0.0.1", 5000);
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addTask(String name, String description, LocalDateTime date) {
        Task task = new Task(name, description, date);

        PrintWriter writer;
        int j = 0;

        try {


            writer = new PrintWriter(socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer.println("1");
            writer.flush();
            //
            objectOutputStream.writeObject(task);
            objectOutputStream.flush();
            //  writer.println(name);
            //  writer.flush();
            //  writer.println(description);
            // writer.flush();
            //  writer.println(date);
            //  writer.flush();
            //       objectOutputStream.close();
            //   socket.close();


            //int i=Integer.parseInt(s);
       /*   while (socket.getInputStream().available() == 0 && j < 100) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                j++;
                String s = reader.readLine();
                int i = Integer.parseInt(s);
                if (i == 1) {
                    new Gui();
                }
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeTask() {
    }

    public void deleteTask() {
    }
}
