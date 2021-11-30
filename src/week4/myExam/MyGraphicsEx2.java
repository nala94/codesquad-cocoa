package week4.myExam;


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

class MyGraphicsEx2 extends Frame implements MouseMotionListener {
    int x = 0;
    int y = 0;

    //시작 추가
    int startX = 0;
    int startY = 0;

    Image img = null;
    Graphics gImg = null;

    public static void main(String[] args) {
        new MyGraphicsEx2("GraphicsEx2");
    }

    public MyGraphicsEx2(String title) {
        super(title);
        addMouseMotionListener(this);
        //시작 추가
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }
        });
        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });


        // Frame을 (100, 100)의 위치에 width 500, height 500 크기로 보이게 한다.
        setBounds(100,100, 500,500);
        setVisible(true);

        img = createImage(500, 500);
        gImg = img.getGraphics();
        repaint();
    }

    public void paint(Graphics g) {
        Graphics2D g2=(Graphics2D)g;
//        g.drawString("마우스를 움직여보세요." + " " + x + ", " + y ,10, 50);
//		g.drawString("*", x, y);
//        g2.drawOval(50,50,x,y);
        Rectangle2D rect1=new Rectangle2D.Double(startX, startY, x, y);
        g2.draw(rect1);

        if(img==null) return;
        g.drawImage(img,0,0,this); 	// 가상화면에 그려진 그림을 Frame에 복사

    }


    public void mouseMoved(MouseEvent me) {

    }

    public void mouseDragged(MouseEvent me) {
        if (me.getModifiersEx()!=MouseEvent.BUTTON1_DOWN_MASK ) return;

        x = me.getX();
        y = me.getY();
        if(gImg != null){
//            gImg.drawRect(x,y, me.getX(),me.getY());
        }
        repaint();
    }
} // class