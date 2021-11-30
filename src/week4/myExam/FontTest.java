package week4.myExam;

import java.awt.*;

public class FontTest {
    public static void main(String[] args) {
        Frame f = new Frame("Font Test");
        String abc = "ABCDEFGHIJKLMN";


        Label abc1 = new Label(abc);
        Label abc2 = new Label(abc);

        Font f1 = new Font("Consolas", Font.PLAIN, 20);
        Font f2 = new Font("Consolas", Font.BOLD, 20);

        abc1.setFont(f1);
        abc2.setFont(f2);

        f.add(abc1);
        f.add(abc2);
        f.setLayout(new FlowLayout());

        f.setSize(500, 300);
        f.setVisible(true);

    }
}
