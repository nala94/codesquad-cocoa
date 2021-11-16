package week1.mission2.simplerpg;

import java.util.HashMap;
import java.util.Map;

public class GameMap {
    int[] player;

    //    public String[][] map;
    String[][] map = new String[5][5];
    int x;
    int y;


//    static int x =2;
//    static int y = 2;

    public GameMap() {


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map[i][j] = "O";
            }
        }
//        player = new int[]{2, 2};
        y = 2;
//        x = player[1];
        x = 2;

    }

    boolean isOutOfMap = false;

    void isOutOfMap(int y, int x) {
        if (y < 0 || x < 0 || x >= map[0].length || y >= map.length) {
            isOutOfMap = true;
        }

    }

    void moveByCommands(String cmd) {
        isOutOfMap = false;
//        if (cmd.equals("W")) {
//            moveUp(y, x);
//        } else if (cmd.equals("S")) {
//            moveDown(y, x);
//        } else if (cmd.equals("A")) {
//            moveLeft(y, x);
//        } else if (cmd.equals("D")) {
//            moveRight(y, x);
//        } else {W
//            stay();


        Map<String, Runnable> commands = new HashMap<>();
        commands.put("W", () -> moveUp(y, x));
        commands.put("S", () -> moveDown(y, x));
        commands.put("A", () -> moveLeft(y, x));
        commands.put("D", () -> moveRight(y, x));
        commands.get(cmd).run();

    }

    void stay() {
//        isOutOfMap(a, b);
//        if(!isOutOfMap) {
//            map[a][b] = "O";
//            map[a][b] = "P";
//
//        }
    }

    void moveUp(int a, int b) {
        isOutOfMap(a - 1, b);
        if (!isOutOfMap) {
            map[a][b] = "O";
            map[a - 1][b] = "P";
            y -= 1;
        }
    }

    void moveDown(int a, int b) {
        isOutOfMap(a + 1, b);
        if (!isOutOfMap) {
            map[a][b] = "O";
            map[a + 1][b] = "P";
            y += 1;
        }
    }

    void moveLeft(int a, int b) {
        isOutOfMap(a, b - 1);
        if (!isOutOfMap) {
            map[a][b] = "O";
            map[a][b - 1] = "P";
            x -= 1;
        }
    }

    void moveRight(int a, int b) {
        isOutOfMap(a, b + 1);
        if (!isOutOfMap) {
            map[a][b] = "O";
            map[a][b + 1] = "P";
            x += 1;
        }
    }

//    void MapComponents(){
//
//    }

    void printMap(String[][] map) {
        for (int i = 0; i < map.length * map[0].length; i++) {
            int row = i / map[0].length;
            int column = i % map[0].length;
            map[y][x] = "P";
            System.out.print(map[row][column] + " ");

            if (column == map[0].length - 1) {
                System.out.println();
            }
        }
    }
}