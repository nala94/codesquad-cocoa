package week3.hangulClock;

public class PutHangulForm {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    void putHangulHour(String[][] hangulClock, int hour) {
        hour = hour % 12;
        for (HangulHour h : HangulHour.values()) {
            if (hour == h.getHour()) {
                hangulClock[h.getRow()][h.getColumn()] = ANSI_RED + hangulClock[h.getRow()][h.getColumn()] + ANSI_RESET;
            }
        }
        hangulClock[2][5] = ANSI_RED + hangulClock[2][5] + ANSI_RESET;
    }

    void putHangulMinute(String[][] hangulClock, int minute) {
        int minuteOne = minute % 10;
        int minuteTen = minute - minuteOne;
        if (minute != 0) {
            hangulClock[5][5] = ANSI_RED + hangulClock[5][5] + ANSI_RESET; // 분
        }
        for (HangulMinute hm : HangulMinute.values()) {
            if (minuteOne == hm.getMinute()) {
                hangulClock[hm.getRow()][hm.getColumn()] = ANSI_RED + hangulClock[hm.getRow()][hm.getColumn()] + ANSI_RESET;
            }
            if (minuteTen != 0 && minuteTen == hm.getMinute()) {
                hangulClock[hm.getRow()][hm.getColumn()] = ANSI_RED + hangulClock[hm.getRow()][hm.getColumn()] + ANSI_RESET;
                hangulClock[3][5] = ANSI_RED + hangulClock[3][5] + ANSI_RESET; // 십
            }
        }
    }
}
