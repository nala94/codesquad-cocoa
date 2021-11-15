package week3.hangulClock;

import java.time.LocalTime;
import java.util.Arrays;

public class HangulClock {

    static void printBackground(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();

        // minuteTotal을 십의 자리와 일의 자리로 분리
        int minuteTotal = now.getMinute();
        int minuteTen = 0;
        int minuteOne = 0;
        if (minuteTotal < 10) {
            minuteTen = 0;
            minuteOne = minuteTotal;
        } else {
            minuteTen = minuteTotal / 10;
            minuteOne = minuteTotal % 10;
        }


        // 한글시계의 배경 아치원 배열 구현 6 x 6
        String[][] background = new String[6][6];
        for (int i = 0; i < background.length; i++) {
            for (int j = 0; j < background.length; j++) {
                background[i][j] = "⭐";
            }
        }

        // 한글시계 한글 이차원 배열 구현
        String[][] hangulForm = {
                "한 두 세 네 다 섯".split(" "),
                "여 섯 일 곱 여 덟".split(" "),
                "아 홉 열 한 두 시".split(" "),
                "자 이 삼 사 오 심".split(" "),
                "정 일 이 삼 사 육".split(" "),
                "오 오 칠 팔 구 분".split(" ")
        };
        
        printBackground(background);
        printBackground(hangulForm);

    }

}