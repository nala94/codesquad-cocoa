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

    void runClock() {
        PutHangulForm p = new PutHangulForm();

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
            p.putHangulHour(hangulClockForm, hangulForm, hour);
            p.putHangulMinuteTen(hangulClockForm, hangulForm, minuteTen);
            p.putHangulMinuteOne(hangulClockForm, hangulForm, minuteOne);
        }
        printHangulClock(hangulClockForm);
        System.out.println();
        System.out.println();
        System.out.println();
    }

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




}