package week4.myExam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OutputTest {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("OutputTest");
        f.setSize(500, 500);

        Button b = new Button("Ok");
        b.setSize(50, 100);
        b.setLocation(100, 200);

        Panel p = new Panel();
        p.setBounds(100, 100, 150, 150);
        p.setBackground(Color.blue);

        Canvas c = new Canvas();
        c.setBounds(350, 350, 100, 100);
        c.setBackground(Color.magenta);

        p.add(b);
        f.add(p);
        f.add(c);

        f.setLayout(null);
        f.addWindowListener(new EventHandler2());
        f.setVisible(true);
    }
}

class EventHandler2 extends WindowAdapter implements ActionListener {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
