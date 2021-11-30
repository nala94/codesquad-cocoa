package week4.myExam;

import java.awt.*;

public class PanelExam {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("PanelExam");
        f.setSize(500,500);
        f.setLayout(null);

        Panel p = new Panel();
        p.setBackground(Color.blue);
        p.setSize(400,400);
        p.setLocation(50, 70);
//        p.setBounds(50, 50, 200,200);

        Button ok = new Button("OK");
        ok.setSize(50,50);
        ok.setLocation(50, 50);
        p.add(ok);

        Button b = new Button("Eat");
//        Button b2 = new Button("Eat");
//        Button b3 = new Button("Eat");
//
        p.add(b);
        b.setSize(50,50);

//        p.add(b2);
//        p.add(b3);
        p.setLayout(null);

        f.add(p);
        f.setVisible(true);
    }
}
