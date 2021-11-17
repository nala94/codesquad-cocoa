package week3.hangulClock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HangulClock h = new HangulClock();
        Calendar c = new Calendar();
        Scanner s = new Scanner(System.in);
        System.out.println("(clock: 시계 출력, cal: 달력 출력)");
        System.out.print(" > ");
        String cmd = s.next();
        if(cmd.equals("clock")){
            h.runTimer();
        }
        if(cmd.equals("cal")){
            c.runCalendar();
        }

    }
}
