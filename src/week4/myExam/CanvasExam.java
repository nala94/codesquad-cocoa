package week4.myExam;

import java.awt.*;

public class CanvasExam {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("CanvasExam");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setBackground(new Color(100, 255, 255));

        Canvas c = new Canvas();
        c.setBackground(Color.WHITE);
        c.setBounds(15,100,475,380);

        f.add(c);
        f.setVisible(true);
    }
}
