package week3.hangulClock;

import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {
    final int[] MAXDAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final int[] MAXDAY_LEAPYEAR = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void runCalendar() {
        nowCalendar();
        inputPrintCalendar();
    }

    private void inputPrintCalendar() {
        Scanner s = new Scanner(System.in);
        System.out.print("년도를 입력하세요 > ");
        int year = s.nextInt();
        System.out.print("달을 입력하세요 > ");
        int month = s.nextInt();

        if(month > 12 || month < 1) {
            System.out.println("잘못된 입력입니다.");
        }else{
            printCalendar(year, month);
        }
    }

    private void nowCalendar() {
        LocalDate now = LocalDate.now();
        int nowYear = now.getYear();
        int nowMonth = now.getMonthValue();
        printCalendar(nowYear, nowMonth);
    }


    private void printCalendar(int year, int month) {
        int firstDay = getFirstDayOfMonth(year, month);
        int maxDay = getMaxDay(year, month);
        System.out.println("=============================");
        System.out.printf("       <<%d년 %3d월>>\n", year, month);
        System.out.println("  월   화  수   목  금  토   일");
        int newLine = 7 - firstDay;  // firstDay: 1~ 7, newLine = 0~

        for (int j = 1; j < firstDay; j++) {
            System.out.print("    ");
        }
        for (int i = 0; i < maxDay; i++) {
            System.out.printf("%4d", i + 1);
            if (i % 7 == newLine) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private int getMaxDay(int year, int month) {
        int maxDay = 0;
        for (IndexOfMonth i : IndexOfMonth.values()) {       // 월의 최대일수
            if (month == i.getMonth() && !isLeapYear(year)) {
                maxDay = MAXDAY[i.getIndex()];
            }
            if (month == i.getMonth() && isLeapYear(year)) {
                maxDay = MAXDAY_LEAPYEAR[i.getIndex()];
            }
        }
        return maxDay;
    }

    private int getFirstDayOfMonth(int year, int month) {
        int firstDayOfYear = getFirstDayOfYear(year);
        if (!isLeapYear(year)) {
            for (int i = 0; i < month - 1; i++) {
                firstDayOfYear += MAXDAY[i];
            }
        } else {
            for (int i = 0; i < month - 1; i++) {
                firstDayOfYear += MAXDAY_LEAPYEAR[i];
            }
        }
        int firstDayOfMonth = firstDayOfYear % 7;
        return firstDayOfMonth;
    }

    private int getFirstDayOfYear(int year) {
        int firstDay = 4;
        for (int i = 1970; i < year; i++) {
            if (isLeapYear(i)) {
                firstDay += 2;
            } else {
                firstDay += 1;
            }
        }
        firstDay %= 7;
        return firstDay;
    }


}
