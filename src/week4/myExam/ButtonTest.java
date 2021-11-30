package week4.myExam;

import java.awt.*;

public class ButtonTest {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("Button Test");
        f.setSize(400, 400);

        Button b = new Button("Eat");
        b.setSize(100,100);
        b.setLocation(50,100);
        b.addActionListener((e) -> {
            System.out.println("WOE");
        });

        Panel p = new Panel();
        Graphics g = p.getGraphics();

//        f.add(b);
//        f.add(p);
//        f.setLayout(null);
        paint(g);

        f.setVisible(true);
    }

    public static void paint(Graphics g){
        g.drawLine(0,0, 10, 10);

    }
}
