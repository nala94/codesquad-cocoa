package week3.hangulClock;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class HangulClock {
    LocalTime now;
    int hour;
    int minute;
    int minuteTotal;
    int minuteTen;
    int minuteOne;
    String[][] hangulClockForm;
    String[][] hangulForm = createHangulForm();


    private String[][] createBackground() {        // 한글시계의 배경 아치원 배열 구현 6 x 6
        String[][] background = new String[6][6];
        for (int i = 0; i < background.length; i++) {
            for (int j = 0; j < background.length; j++) {
                background[i][j] = "⭐";
            }
        }
        return background;
    }

    String[][] createHangulForm() {        // 한글시계 한글 이차원 배열 구현
        String[][] hangulForm = {
                "한 두 세 네 다 섯".split(" "),
                "여 섯 일 곱 여 덟".split(" "),
                "아 홉 열 한 두 시".split(" "),
                "자 이 삼 사 오 십".split(" "),
                "정 일 이 삼 사 육".split(" "),
                "오 오 칠 팔 구 분".split(" ")
        };
        return hangulForm;
    }

    void runClock() {
        getCurrentTime();

        if (minuteTotal < 10) {
            minuteTen = 0;
            minuteOne = minuteTotal;
        } else {
            minuteTen = minuteTotal / 10;
            minuteOne = minuteTotal % 10;
        }

        hangulClockForm = createBackground();

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
        printHangulClock(hangulClockForm);

    }

    public void runTimer() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                runClock();

            }
        };

        Timer timer = new Timer();
        long delay = 0;
        long intervalPeriod = 5000;

        timer.scheduleAtFixedRate(task, delay, intervalPeriod);

    }

    private void getCurrentTime() {
        now = LocalTime.now();
        hour = now.getHour();
        minute = now.getMinute();
        minuteTotal = now.getMinute();
        minuteTen = 0;
        minuteOne = 0;
    }

    private void printHangulClock(String[][] hangulClockForm) {
        for (int i = 0; i < hangulClockForm.length; i++) {
            for (int j = 0; j < hangulClockForm[0].length; j++) {
                System.out.print(hangulClockForm[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void putHangulHour() {
        switch (hour) {
            case 1:
            case 13:
                hangulClockForm[0][0] = hangulForm[0][0]; //한
                break;
            case 2:
            case 14:
                hangulClockForm[0][1] = hangulForm[0][1]; //두
                break;
            case 3:
            case 15:
                hangulClockForm[0][2] = hangulForm[0][2]; //세
                break;
            case 4:
            case 16:
                hangulClockForm[0][3] = hangulForm[0][3]; //네
                break;
            case 5:
            case 17:
                hangulClockForm[0][4] = hangulForm[0][4]; //다
                hangulClockForm[0][5] = hangulForm[0][5]; //섯
                break;
            case 6:
            case 18:
                hangulClockForm[1][0] = hangulForm[1][0]; //여
                hangulClockForm[1][1] = hangulForm[1][1]; //섯
                break;
            case 7:
            case 19:
                hangulClockForm[1][2] = hangulForm[1][2]; //일
                hangulClockForm[1][3] = hangulForm[1][3]; //곱
                break;
            case 8:
            case 20:
                hangulClockForm[1][4] = hangulForm[1][4]; //여
                hangulClockForm[1][5] = hangulForm[1][5]; //덟
                break;
            case 9:
            case 21:
                hangulClockForm[2][0] = hangulForm[2][0]; //아
                hangulClockForm[2][1] = hangulForm[2][1]; //홉
                break;
            case 10:
            case 22:
                hangulClockForm[2][2] = hangulForm[2][2]; //열
                break;
            case 11:
            case 23:
                hangulClockForm[2][2] = hangulForm[2][2]; //열
                hangulClockForm[2][3] = hangulForm[2][3]; //한
                break;
            case 12:
            case 0:
                hangulClockForm[2][2] = hangulForm[2][2]; //열
                hangulClockForm[2][4] = hangulForm[2][4]; //두
                break;
        }
        hangulClockForm[2][5] = hangulForm[2][5];
    }

    private void putHangulMinuteTen() {
        switch (minuteTen) {
            case 0:
                break;
            case 1:
                hangulClockForm[3][5] = hangulForm[3][5]; //십
                break;
            case 2:
                hangulClockForm[3][1] = hangulForm[3][1];
                hangulClockForm[3][5] = hangulForm[3][5];
                break;
            case 3:
                hangulClockForm[3][2] = hangulForm[3][2];
                hangulClockForm[3][5] = hangulForm[3][5];
                break;
            case 4:
                hangulClockForm[3][3] = hangulForm[3][3];
                hangulClockForm[3][5] = hangulForm[3][5];
                break;
            case 5:
                hangulClockForm[3][4] = hangulForm[3][4];
                hangulClockForm[3][5] = hangulForm[3][5];
                break;

        }
    }

    private void putHangulMinuteOne() {
        switch (minuteOne) {
            case 0:
                break;
            case 1:
                hangulClockForm[4][1] = hangulForm[4][1];
                hangulClockForm[5][5] = hangulForm[5][5]; //분
                break;
            case 2:
                hangulClockForm[4][2] = hangulForm[4][2];
                hangulClockForm[5][5] = hangulForm[5][5]; //분
                break;
            case 3:
                hangulClockForm[4][3] = hangulForm[4][3];
                hangulClockForm[5][5] = hangulForm[5][5]; //분
                break;
            case 4:
                hangulClockForm[4][4] = hangulForm[4][4];
                hangulClockForm[5][5] = hangulForm[5][5]; //분
                break;
            case 5:
                hangulClockForm[5][1] = hangulForm[5][1];
                hangulClockForm[5][5] = hangulForm[5][5]; //분
                break;
            case 6:
                hangulClockForm[4][5] = hangulForm[4][5];
                hangulClockForm[5][5] = hangulForm[5][5]; //분
                break;
            case 7:
                hangulClockForm[5][2] = hangulForm[5][2];
                hangulClockForm[5][5] = hangulForm[5][5]; //분
                break;
            case 8:
                hangulClockForm[5][3] = hangulForm[5][3];
                hangulClockForm[5][5] = hangulForm[5][5]; //분
                break;
            case 9:
                hangulClockForm[5][4] = hangulForm[5][4];
                hangulClockForm[5][5] = hangulForm[5][5]; //분
                break;
        }
    }


}