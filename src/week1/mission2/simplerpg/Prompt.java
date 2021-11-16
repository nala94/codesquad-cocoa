package week1.mission2.simplerpg;

import java.util.Scanner;


public class Prompt {
    private boolean isLoop = true;

    void runPrompt() {
        GameMap m = new GameMap();
        Scanner sc = new Scanner(System.in);
        m.printMap(m.map);

        while (isLoop) {
            System.out.printf("현재 위치: (%d, %d)", m.y, m.x);
            System.out.print("\n이동 > ");
            String cmd = sc.next();
            if (cmd.equals("Q")) {
                System.out.println("게임을 종료합니다");
                break;

            }
            m.moveByCommands(cmd);
            m.printMap(m.map);
            System.out.println("==========");
        }
        System.out.println(m.x);
        System.out.println(m.y);
    }
}