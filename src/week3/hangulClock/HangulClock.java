package week3.hangulClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Formatter;

public class HangulClock {
    LocalTime now = LocalTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int minuteTotal = now.getMinute();
    int minuteTen = 0;
    int minuteOne = 0;
    String[][] background = createBackground();
    String[][] hangulForm = createHangulForm();




    private void printBackground(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private String[][] createBackground(){        // 한글시계의 배경 아치원 배열 구현 6 x 6
        String[][] background = new String[6][6];
        for (int i = 0; i < background.length; i++) {
            for (int j = 0; j < background.length; j++) {
                background[i][j] = "⭐";
            }
        }
        return background;
    }

    String[][] createHangulForm(){        // 한글시계 한글 이차원 배열 구현
        String[][] hangulForm = {
                "한 두 세 네 다 섯".split(" "),
                "여 섯 일 곱 여 덟".split(" "),
                "아 홉 열 한 두 시".split(" "),
                "자 이 삼 사 오 심".split(" "),
                "정 일 이 삼 사 육".split(" "),
                "오 오 칠 팔 구 분".split(" ")
        };
        return hangulForm;
    }

    private void run() {

        // minuteTotal을 십의 자리와 일의 자리로 분리
        if (minuteTotal < 10) {
            minuteTen = 0;
            minuteOne = minuteTotal;
        } else {
            minuteTen = minuteTotal / 10;
            minuteOne = minuteTotal % 10;
        }


        String[][] hangulClockForm = new String[6][6];  // 한글시계 출력포맷 생성
        hangulClockForm = background;

        if (hour == 0 && minute == 0) {
            // 배경에 자, 정을 출력
            hangulClockForm[3][0] = hangulForm[3][0];
            hangulClockForm[4][0] = hangulForm[4][0];
        } else if (hour == 12 && minute == 0) {
            // 배경에 정, 오를 출력
            hangulClockForm[4][0] = hangulForm[4][0];
            hangulClockForm[5][0] = hangulForm[5][0];
        } else {
            putHangulHour();
            putHangulMinuteTen();
            putHangulMinuteOne();
        }
        printHangulClock();
    }

    private void printHangulClock() {
    }

    private void putHangulHour() {
        switch (hour) {
            case 1:
            case 13:
                break;

            case 2:
            case 14:
                break;

            case 3:
            case 15:
                break;

            case 4:
            case 16:
                break;

            case 5:
            case 17:
                break;

            case 6:
            case 18:
                break;

            case 7:
            case 19:
                break;

            case 8:
            case 20:
                break;

            case 9:
            case 21:
                break;

            case 10:
            case 22:
                break;

            case 11:
            case 23:
                break;

            case 12:
            case 00:
                break;

            default:

        }
    }

    private void putHangulMinuteTen() {
    }

    private void putHangulMinuteOne() {
    }


}