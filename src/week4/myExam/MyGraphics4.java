package week4.myExam;

import java.awt.*;
import java.awt.event.*;

public class MyGraphics4 extends Frame implements MouseMotionListener {

    int x = 0;
    int y = 0;

    private int currentX , currentY;

    Image img = null;
    Graphics gImg = null;

    public static void main(String[] args) {
        new MyGraphics4("MyGraphics4");
    }

    public MyGraphics4(String title) throws HeadlessException {
        super(title);
        addMouseMotionListener(this);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                x = e.getX();
                y = e.getY();
            }
            @Override
            public void mouseReleased(MouseEvent e){
                currentX = e.getX();
                currentY = e.getY();
                if(gImg != null){
                    gImg.drawRect(x,y, currentX,currentY);
                }
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
//        addWindowListener((WindowAdapter) windowClosing(e) ->  {System.exit(0)};
        // 메서드가 여러개인 리스너는 람다만으로 안됨

        setSize(500, 500);
        setVisible(true);


        img = createImage(500, 500);

        gImg = img.getGraphics();
        gImg.drawString("왼쪽버튼을 누른 채로 마우스를 움직여보세요." ,10, 50);
         repaint();



    }

    @Override
    public void paint(Graphics g) {
        if (img != null) {
            g.drawImage(img, 0, 0, this);
        }
    }
    // 드래그 할때 잔상이 남는 문제
    @Override
    public void mouseDragged(MouseEvent e) {
        if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
            Graphics2D g2 = (Graphics2D) gImg;
//            g2.setStroke(new BasicStroke(5));
//            g2.setPaint(Color.black);
            gImg.drawString("*", x, y);
            repaint();

            currentX = e.getX();
            currentY = e.getY();
            if(gImg != null){
                gImg.drawRect(x,y, currentX,currentY);
            }
            repaint();
            x = e.getX();
            y = e.getY();
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
