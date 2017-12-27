package gui;

import controller.Controller;
import model.Task;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Observable;

/**
 * Created by Игорь on 23.12.2017.
 */
public class Gui extends JFrame {
  /*  JPanel jPanel;
    JTextField jTextFieldName;
    JTextField jTextFieldDescription;
    JTextField jTextFieldDate;

    JButton jButtonAdd;
    Controller controller = new Controller();


    public void draw() {

        jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jTextFieldDate = new JTextField(15);
        jTextFieldDescription = new JTextField(15);
        jTextFieldName = new JTextField(15);

        jButtonAdd = new JButton("Добавить");


        jPanel.add(jTextFieldName);
        jPanel.add(jTextFieldDescription);
        jPanel.add(jTextFieldDate);

        jPanel.add(jButtonAdd);


        jButtonAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              onAddTaskClicked(e);
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(jPanel);
        setSize(400, 130);
        setVisible(true);


    }


    private void onAddTaskClicked(MouseEvent e) {
        Task task;

        task = new Task(jTextFieldName.getText(), jTextFieldDescription.getText(), LocalDateTime.parse(jTextFieldDate.getText()));
        controller.addTask(task);
    }

*/

    public final DefaultListModel listModel = new DefaultListModel();
    public int listItemId;
    public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    public boolean isAlarmEvent=false;
    public Controller controller = new Controller();

    public Gui()
    {
        initComponents();
        //controller.listModel=listModel;
        list1.setModel(listModel);
        label5.setText("Задачи");
      //  controller.addObserver(this);
        label6.setVisible(isAlarmEvent);
        textField3.setVisible(isAlarmEvent);
        label7.setVisible(isAlarmEvent);
        textField5.setVisible(isAlarmEvent);

    }

    protected MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
        } catch (java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
            System.exit(-1);
        }
        return formatter;
    }

 /*   private void list1ValueChanged(ListSelectionEvent e) {
        listItemId = list1.getSelectedIndex();
        if (listItemId == -1) listItemId = 0;
        if(listModel.getSize()!=0) {
            Task task =controller.getTask(listItemId);
            textField1.setText(task.getName());
            textField2.setText(task.getDescription());
            formattedTextField1.setText(task.getDateTime().format(formatter));
            textField4.setText(task.getContacts());
            if(task instanceof AlarmEvent)
            {
                textField3.setText(((AlarmEvent)task).getRepeatCount()+"");
                textField5.setText(((AlarmEvent)task).getRepeatPeriod()+"");
                checkBox1.setSelected(true);
            }
        }
        else
        {
            textField1.setText("");
            textField2.setText("");
            formattedTextField1.setText("");
            textField4.setText("");
            checkBox1.setSelected(false);
        }
    }
*/
    private void onAddTaskClicked(MouseEvent e) {


       // Task task;
     //   task= new Task(textField1.getText(), textField2.getText(), LocalDateTime.parse(formattedTextField1.getText(), formatter));
      /*  if (!isAlarmEvent)
        {
            task= new Task(textField1.getText(), textField2.getText(), LocalDateTime.parse(formattedTextField1.getText(), formatter));
        }
        else
        {
            task = new AlarmEvent(textField1.getText(),
                    textField2.getText(),
                    LocalDateTime.parse(formattedTextField1.getText(), formatter),
                    Integer.parseInt(textField3.getText()),
                    Integer.parseInt(textField5.getText()));
        }*/

        controller.addTask(textField1.getText(), textField2.getText(), LocalDateTime.parse(formattedTextField1.getText(),formatter));
    }

  /*  private void onChangeTaskClicked(MouseEvent e) {
        Task task;
        if (!isAlarmEvent)
        {
            task= new Event(textField1.getText(), textField2.getText(), LocalDateTime.parse(formattedTextField1.getText(), formatter));
        }
        else
        {
            task = new AlarmEvent(textField1.getText(),
                    textField2.getText(),
                    LocalDateTime.parse(formattedTextField1.getText(), formatter),
                    Integer.parseInt(textField3.getText()),
                    Integer.parseInt(textField5.getText()));
        }
        controller.updateTask(listItemId, task);
    }

    private void onDeleteTaskClicked(MouseEvent e) {
        //  taskList.delTask(listItemId);
        controller.removeTask(listItemId);
    }*/

    private void thisWindowClosing(WindowEvent e) {
        //timer.cancelTask();
        //timer.destroyTimer();
        System.exit(0);
    }

    private void checkBox1ItemStateChanged(ItemEvent e) {
        isAlarmEvent=!isAlarmEvent;
        label6.setVisible(isAlarmEvent);
        textField3.setVisible(isAlarmEvent);
        label7.setVisible(isAlarmEvent);
        textField5.setVisible(isAlarmEvent);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - ergerg ewfef
        label5 = new JLabel();
        checkBox1 = new JCheckBox();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        label1 = new JLabel();
        textField1 = new JTextField(15);
        label2 = new JLabel();
        textField2 = new JTextField(15);
        label3 = new JLabel();
        formattedTextField1 = new JFormattedTextField(createFormatter("##.##.#### ##:##:##"));
        label4 = new JLabel();
        textField4 = new JTextField(15);
        label6 = new JLabel();
        textField3 = new JTextField(15);
        label7 = new JLabel();
        textField5 = new JTextField(15);
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("TaskManager");
        setResizable(false);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
  /*      contentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[120:120,fill]" +
                        "[110:128,fill]" +
                        "[254,fill]",
                // rows
                "[14:5]" +
                        "[35:49]" +
                        "[22:71]" +
                        "[]" +
                        "[34:n]" +
                        "[]" +
                        "[151]" +
                        "[]"));
*/
        //---- label5 ----
        label5.setText("text");
        contentPane.add(label5, "cell 0 0");

        //---- checkBox1 ----
        checkBox1.setText("\u0411\u0443\u0434\u0438\u043b\u044c\u043d\u0438\u043a");
        checkBox1.addItemListener(e -> checkBox1ItemStateChanged(e));
        contentPane.add(checkBox1, "cell 2 0");

        //======== scrollPane1 ========
    /*    {

            //---- list1 ----
            list1.addListSelectionListener(e -> list1ValueChanged(e));
            scrollPane1.setViewportView(list1);
        }*/
        contentPane.add(scrollPane1, "cell 0 1 1 6,growy");

        //---- label1 ----
        label1.setText("\u041d\u0430\u0437\u0432\u0430\u043d\u0438\u0435");
        contentPane.add(label1, "cell 1 1");
        contentPane.add(textField1, "cell 2 1");

        //---- label2 ----
        label2.setText("\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435");
        contentPane.add(label2, "cell 1 2");
        contentPane.add(textField2, "cell 2 2");

        //---- label3 ----
        label3.setText("\u0414\u0430\u0442\u0430 \u0438 \u0432\u0440\u0435\u043c\u044f");
        contentPane.add(label3, "cell 1 3");
        contentPane.add(formattedTextField1, "cell 2 3");

        //---- label4 ----
        label4.setText("\u041a\u043e\u043d\u0442\u0430\u043a\u0442\u044b");
        contentPane.add(label4, "cell 1 4");
        contentPane.add(textField4, "cell 2 4");

        //---- label6 ----
        label6.setText("\u0427\u0438\u0441\u043b\u043e \u043f\u043e\u0432\u0442\u043e\u0440\u0435\u043d\u0438\u0439");
        contentPane.add(label6, "cell 1 5");
        contentPane.add(textField3, "cell 2 5");

        //---- label7 ----
        label7.setText("\u041f\u0435\u0440\u0438\u043e\u0434 (\u043c.)");
        contentPane.add(label7, "cell 1 6");
        contentPane.add(textField5, "cell 2 6");

        //---- button1 ----
        button1.setText("\u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onAddTaskClicked(e);
            }
        });
        contentPane.add(button1, "cell 0 7");

        //---- button2 ----
        button2.setText("\u0418\u0437\u043c\u0435\u043d\u0438\u0442\u044c");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //onChangeTaskClicked(e);
            }
        });
        contentPane.add(button2, "cell 1 7");

        //---- button3 ----
        button3.setText("\u0423\u0434\u0430\u043b\u0438\u0442\u044c");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //onDeleteTaskClicked(e);
            }
        });
        contentPane.add(button3, "cell 2 7");
        setSize(425, 300);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - ergerg ewfef
    private JLabel label5;
    private JCheckBox checkBox1;
    private JScrollPane scrollPane1;
    private JList list1;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JFormattedTextField formattedTextField1;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label6;
    private JTextField textField3;
    private JLabel label7;
    private JTextField textField5;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
  /*  @Override
    public void update(Observable o, Object arg) {
        // JOptionPane.showMessageDialog(null,arg);
        Object[] args =(Object[]) arg;
        switch ((int)args[0])
        {
            case 1: //add
                listModel.addElement((String)args[2]);
                clearActivity();
                break;
            case 2: //updateTask
                listModel.set((int)args[1], (String)args[2]);
                clearActivity();
                break;
            case 3: //removeTask
                listModel.remove((int)args[1]);
                clearActivity();
                break;
            case 4: //sort
                listModel.clear();
                for (Task val:controller.taskDAO.getTaskList())
                {
                    listModel.addElement(val.getName());
                }
                break;
            case 5: //clear activity
                clearActivity();
                break;
            case 6: //launch NotificationActivity
                NotificationActivity notification = new NotificationActivity(controller);
                notification.show();
                break;
        }
    }*/
    public void clearActivity()
    {
        textField1.setText("");
        textField2.setText("");
        textField4.setText("");
        textField3.setText("");
        textField5.setText("");
        checkBox1.setSelected(false);
        formattedTextField1.setText("");
    }
}



