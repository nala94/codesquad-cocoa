package week3.hangulClock;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class HangulClock {
    LocalTime now;
    int hour;
    int minute;
    String[][] hangulClock;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public void runTimer() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                runClock();
            }
        };
        Timer timer = new Timer();
        long delay = 0;
        long intervalPeriod = 50000;
        timer.scheduleAtFixedRate(task, delay, intervalPeriod);
    }

    void runClock() {
        getCurrentTime();
        hangulClock = createHangulForm();
        createHangulClock();
        printHangulClock(hangulClock);
    }

    private void createHangulClock() {
        PutHangulForm p = new PutHangulForm();
        if (hour == 0 && minute == 0) {
            // 배경에 자, 정을 출력
            hangulClock[3][0] = ANSI_RED + hangulClock[3][0] + ANSI_RESET;
            hangulClock[4][0] = ANSI_RED + hangulClock[4][0] + ANSI_RESET;
        } else if (hour == 12 && minute == 0) {
            // 배경에 정, 오를
            hangulClock[4][0] = ANSI_RED + hangulClock[4][0] + ANSI_RESET;
            hangulClock[5][0] = ANSI_RED + hangulClock[5][0] + ANSI_RESET;
        } else {
            PutHangulForm.putHangulHour(hangulClock, hour);  // iv를 매개변수를 통해 사용하니까 static 메소드로 바꿈  hour:iv, hangulClock:iv
            p.putHangulMinute(hangulClock, minute);
        }
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
    }

    private void printHangulClock(String[][] hangulClock) {
        for (int i = 0; i < hangulClock.length; i++) {
            for (int j = 0; j < hangulClock[0].length; j++) {
                System.out.print(hangulClock[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

}