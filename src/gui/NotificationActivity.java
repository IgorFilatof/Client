package gui;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import javax.swing.*;


import controller.Controller;



public class NotificationActivity extends JFrame
{
 /*   Controller controller=null;
    public NotificationActivity(Controller controller)
    {
        initComponents();
        this.controller=controller;
        label1.setText(controller.getTask(0).getName());
        label4.setText(controller.getTask(0).getDescription());
        if (controller.getTask(0)instanceof AlarmEvent)
        {
            AlarmEvent task = (AlarmEvent) controller.getTask(0);
            if(task.getCurrentRepeat()<task.getRepeatCount()-1)
            {
                task.setCurrentRepeat(task.getCurrentRepeat()+1);
                LocalDateTime newDate = task.getDateTime();
                newDate =newDate.plus(task.getRepeatPeriod(), ChronoUnit.MINUTES);
                task.setDateTime(newDate);
                controller.updateTask(0,task);
            }
            else
            {
                controller.removeTask(0);
            }
        }
        else
        {
            controller.removeTask(0);
        }
    }

    private void thisWindowClosing(WindowEvent e)
    {

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - ergerg ewfef
        label1 = new JLabel();
        label3 = new JLabel();
        label2 = new JLabel();
        label4 = new JLabel();

        //======== this ========
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[95:101,fill]" +
                        "[171:126,fill]" +
                        "[187,fill]",
                // rows
                "[76]" +
                        "[44]"));

        //---- label1 ----
        label1.setText("Text");
        label1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 30));
        contentPane.add(label1, "cell 0 0 3 1,alignx center,growx 0");

        //---- label3 ----
        label3.setText("\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435");
        contentPane.add(label3, "cell 0 1");
        contentPane.add(label2, "cell 0 1");

        //---- label4 ----
        label4.setText("text");
        contentPane.add(label4, "cell 1 1 2 1");
        setSize(400, 165);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - ergerg ewfef
    private JLabel label1;
    private JLabel label3;
    private JLabel label2;
    private JLabel label4;
    */
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

