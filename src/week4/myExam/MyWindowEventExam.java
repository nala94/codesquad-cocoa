package week4.myExam;

import week4.exam.WindowEventEx;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowEventExam extends Frame implements WindowListener {
    public  MyWindowEventExam(){
        super("Test");

        Label _exit = new Label("Push the exit Button");

        add(_exit);
        setBounds(300, 300, 200, 1000);

        addWindowListener(this);
        setVisible(true);




    }

    public static void main(String[] args) {
        MyWindowEventExam eventEx = new MyWindowEventExam();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
