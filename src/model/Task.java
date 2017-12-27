package model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by Игорь on 23.12.2017.
 */
public class Task implements Serializable{
    private long ID;
    private String name;
    private String description;
    private LocalDateTime dateTime;
    private String contacts;
 //   private IDGenerator iDgenerator;
    private long secondsTo;

    public Task(String name, String description, LocalDateTime dateTime) {
        //  iDgenerator=new IDgenerator();
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
     //   this.ID = iDgenerator.generate(dateTime);
        contacts="Нету";
      //  secondsTo=recount(LocalDateTime.now());
    }
}
