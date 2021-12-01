package week5.simple2DGame.entitiy;

import week5.simple2DGame.main.GamePanel;
import week5.simple2DGame.main.KeyHandler;

import javax.swing.*;
import java.awt.*;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;

    public final int screenX;
    public final int screenY;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;

        screenX = gp.screenWidth / 2;
        screenY = gp.screenHeight / 2;

        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {

        worldX = gp.tileSize * 23;    // 부모클래스에서 선언한 변수들
        worldY = gp.tileSize * 21;
        speed = 4;
        direction = "down";
    }

    public void getPlayerImage() {

        up1 = new ImageIcon("src/week5/simple2DGame/res/player/denma_up1.png").getImage();
        up2 = new ImageIcon("src/week5/simple2DGame/res/player/denma_up2.png").getImage();
        down1 = new ImageIcon("src/week5/simple2DGame/res/player/denma_down1.png").getImage();
        down2 = new ImageIcon("src/week5/simple2DGame/res/player/denma_down2.png").getImage();
        left1 = new ImageIcon("src/week5/simple2DGame/res/player/denma_left1.png").getImage();
        left2 = new ImageIcon("src/week5/simple2DGame/res/player/denma_left2.png").getImage();
        right1 = new ImageIcon("src/week5/simple2DGame/res/player/denma_right1.png").getImage();
        right2 = new ImageIcon("src/week5/simple2DGame/res/player/denma_right2.png").getImage();
    }

    public void update() {

        if (keyH.upPressed || keyH.downPressed || keyH.leftPressed || keyH.rightPressed) {
            if (keyH.upPressed) {
                direction = "up";
                worldY -= speed;
            } else if (keyH.downPressed) {
                direction = "down";
                worldY += speed;
            } else if (keyH.leftPressed) {
                direction = "left";
                worldX -= speed;
            } else if (keyH.rightPressed) {
                direction = "right";
                worldX += speed;
            }


            spriteCounter++;
            if (spriteCounter > 13) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }
    }

    public void draw(Graphics2D g2) {

        Image image = null;

        switch (direction) {
            case "up":
                if (spriteNum == 1) {
                    image = up1;
                }
                if (spriteNum == 2) {
                    image = up2;
                }
                break;
            case "down":
                if (spriteNum == 1) {
                    image = down1;

                }
                if (spriteNum == 2) {
                    image = down2;
                }
                break;
            case "left":
                if (spriteNum == 1) {
                    image = left1;
                }
                if (spriteNum == 2) {
                    image = left2;
                }

                break;
            case "right":
                if (spriteNum == 1) {
                    image = right1;
                }
                if (spriteNum == 2) {
                    image = right2;
                }
                break;
        }
        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);

    }

}
