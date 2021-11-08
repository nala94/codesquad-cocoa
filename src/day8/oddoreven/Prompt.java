package day8.oddoreven;

import java.util.Random;
import java.util.Scanner;

public class Prompt {
    void runPrompt() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("이름을 입력하세요.");
        System.out.print("Name: ");
        String name = sc.next();

        double myFund = 100;
        double computersFund = 120;
        double maxBet = Math.min(myFund, computersFund);
        double numStage = 0;
        double a = 1.2;

        boolean isLoop = true;
        while (isLoop) {
            numStage += 1;
            int number = rd.nextInt(20) + 1;
            String oddOrEven;

            if (number % 2 != 0) {
                oddOrEven = "홀";
            } else {
                oddOrEven = "짝";
            }
            System.out.println("======================");
            System.out.println("stage : " + numStage);
            System.out.println("홀 또는 짝을 입력하세요.");
            System.out.print("> ");
            String inputOddOrEven = sc.next(); //홀 짝 입력
            double myBet = 0;
            boolean isOutRange = true;
            while (isOutRange) {
                System.out.printf("베팅금액을 입력하세요. (상한 : %.1f)\n", maxBet);
                System.out.print("> ");
                myBet = sc.nextDouble();
                if (myBet < 0 || myBet > maxBet) {
                    isOutRange = true;
                    System.out.println("다시 입력하세요.");
                } else {
                    isOutRange = false;
                }
            }

            if (inputOddOrEven.equals(oddOrEven)) {
                myFund += myBet;
                computersFund -= myBet;
                System.out.println("맞췄습니다!");
                System.out.printf("내 소지금: %.1f \n상대 소지금: %.1f\n", myFund, computersFund);
            } else {
                System.out.println("틀렸습니다.");
                myFund -= myBet;
                computersFund += myBet;
                System.out.printf("내 소지금: %.1f \n상대 소지금: %.1f\n", myFund, computersFund);
            }

            if (myFund == 0) {
                isLoop = false;
                System.out.println("----GAME OVER----");
                System.out.println("졌습니다.");
                System.out.println("소지금: " + myFund);
                System.out.println("진행 턴: " + numStage);
            } else if (computersFund == 0) {
                System.out.println("============New Game===========");
                System.out.println("이겼습니다. 새로운 게임을 시작합니다.");
                computersFund = myFund * Math.pow(a, numStage);
            }
        }
    }
}
