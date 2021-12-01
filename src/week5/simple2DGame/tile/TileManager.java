package week5.simple2DGame.tile;

import week5.simple2DGame.main.GamePanel;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class TileManager {

    GamePanel gp;
    Tile[] tile;
    int[][] mapTileNum;

    public TileManager(GamePanel gp) {
        this.gp = gp;

        tile = new Tile[10];
        mapTileNum = new int[gp.maxScreenCol][gp.maxScreenRow];

        getTileImage();
        loadMap("src/week5/simple2DGame/res/maps/map01.txt");
    }

    public void getTileImage() {

        tile[0] = new Tile();
        tile[0].image = new ImageIcon("src/week5/simple2DGame/res/tiles/grass.png").getImage();

        tile[1] = new Tile();
        tile[1].image = new ImageIcon("src/week5/simple2DGame/res/tiles/wall.png").getImage();

        tile[2] = new Tile();
        tile[2].image = new ImageIcon("src/week5/simple2DGame/res/tiles/water.png").getImage();

        tile[3] = new Tile();
        tile[3].image = new ImageIcon("src/week5/simple2DGame/res/tiles/earth.png").getImage();

        tile[4] = new Tile();
        tile[4].image = new ImageIcon("src/week5/simple2DGame/res/tiles/tree.png").getImage();

        tile[5] = new Tile();
        tile[5].image = new ImageIcon("src/week5/simple2DGame/res/tiles/sand.png").getImage();

    }

    public void loadMap(String filePath) {

        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));

            int col = 0;
            int row = 0;

            while (col < gp.maxScreenCol && row < gp.maxScreenRow) {

                String line = br.readLine();

                while (col < gp.maxScreenCol) {

                    String[] numbers = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;

                }
                if (col == gp.maxScreenCol) {
                    col = 0;
                    row++;
                }

            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {

        int col = 0;
        int row = 0;
        int x = 0;
        int y = 0;

        while (col < gp.maxScreenCol && row < gp.maxScreenRow) {

            int tileNum = mapTileNum[col][row];

            g2.drawImage(tile[tileNum].image, x, y, gp.tileSize, gp.tileSize, null);
            col++;
            x += gp.tileSize;

            if (x == gp.screenWidth) {
                col = 0;
                x = 0;
                row++;
                y += gp.tileSize;
            }
        }
    }
}
