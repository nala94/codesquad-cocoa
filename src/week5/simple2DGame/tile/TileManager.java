package week5.simple2DGame.tile;

import week5.simple2DGame.main.GamePanel;

import javax.swing.*;
import java.awt.*;

public class TileManager {

    GamePanel gp;
    Tile[] tile;

    public TileManager(GamePanel gp){
        this.gp = gp;

        tile = new Tile[10];

        getTileImage();
    }

    public void getTileImage(){

        tile[0] = new Tile();
        tile[0].image = new ImageIcon("src/week5/simple2DGame/res/tiles/grass.png").getImage();

        tile[1] = new Tile();
        tile[1].image = new ImageIcon("src/week5/simple2DGame/res/tiles/wall.png").getImage();

        tile[2] = new Tile();
        tile[2].image = new ImageIcon("src/week5/simple2DGame/res/tiles/water.png").getImage();

    }

    public void draw(Graphics2D g2){

        g2.drawImage(tile[0].image, 0, 0, gp.tileSize, gp.tileSize, null);
    }
}
