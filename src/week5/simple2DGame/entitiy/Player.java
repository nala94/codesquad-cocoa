package week5.simple2DGame.entitiy;

import week5.simple2DGame.GamePanel;
import week5.simple2DGame.KeyHandler;

import java.awt.*;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
    }

    public void setDefaultValues() {

        x = 100;    // 부모클래스에서 선언한 변수들
        y = 100;
        speed = 4;
    }

    public void update() {
        if (keyH.upPressed == true) {
            y -= speed;
        } else if (keyH.downPressed == true) {
            y += speed;
        } else if (keyH.leftPressed == true) {
            x -= speed;
        } else if (keyH.rightPressed == true) {
            x += speed;
        }
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.white);

        g2.fillRect(x, y, gp.tileSize, gp.tileSize);

    }

}
