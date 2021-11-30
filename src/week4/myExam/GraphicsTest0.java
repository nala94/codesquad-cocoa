package week4.myExam;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsTest0 extends Frame {
    public GraphicsTest0(String title) {
        super(title);

        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Frame을 (100,100)의 위치에 width 400, height 300 크기로 보이게 한다.
        setBounds(100,100, 400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GraphicsTest0("GraphicsEx1");
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(0,0, 50, 50);




        g.setColor(Color.red);
        g.drawLine(100,100, 150,150);
    }
}
