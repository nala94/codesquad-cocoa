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
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage();
        loadMap("src/week5/simple2DGame/res/maps/world01.txt");
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

            while (col < gp.maxWorldCol && row < gp.maxWorldRow) {

                String line = br.readLine();

                while (col < gp.maxWorldCol) {

                    String[] numbers = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;

                }
                if (col == gp.maxWorldCol) {
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

        int worldCol = 0;
        int worldRow = 0;

        while (worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {

            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int ScreenX = worldX - gp.player.worldX + gp.player.screenX; // 타일의 x좌표
            int ScreenY = worldY - gp.player.worldY + gp.player.screenY; // 타일의 y좌표

            if (ScreenX + gp.tileSize > 0 &&
                    ScreenY + gp.tileSize > 0 &&
                    ScreenX - gp.tileSize < gp.worldWidth - 2 * gp.player.screenX &&
                    ScreenY - gp.tileSize < gp.worldHeight - 2 * gp.player.screenY) {

                g2.drawImage(tile[tileNum].image, ScreenX, ScreenY, gp.tileSize, gp.tileSize, null);

            }

            worldCol++;
            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;
            }
        }
    }
}
