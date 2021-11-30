package week4.myExam;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class FrameEx01 extends Frame implements WindowListener {
    public FrameEx01(){
        super("Frame Test One");
    }
    public static void main(String[] args) {
        FrameEx01 frameEx01 = new FrameEx01();
        Frame f = new Frame();


        Label exit = new Label("push the button");

        f.add(exit);
        f.setBounds(500, 500, 500, 1000);

        f.setVisible(true);
        f.setSize(300, 300);

        f.addWindowListener(frameEx01);
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
