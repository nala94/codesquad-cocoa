package week3.hangulClock;

public class PutHangulForm {

    void putHangulHour(String[][] hangulClock, String[][] hangulForm, int hour) {
        for (HangulHour h : HangulHour.values()) {
            if (hour == h.getHour()) {
                hangulClock[h.getRow()][h.getColumn()] = hangulForm[h.getRow()][h.getColumn()];
            }
        }
        hangulClock[2][5] = hangulForm[2][5];
    }

    void putHangulMinuteTen(String[][] hangulClock, String[][] hangulForm, int minuteTen) {
        if (minuteTen == 0) {
            return;
        }
        for (HangulMinute hm : HangulMinute.values()) {
            if (minuteTen == hm.getMinute()) {
                hangulClock[hm.getRow()][hm.getColumn()] = hangulForm[hm.getRow()][hm.getColumn()];
            }
        }
        hangulClock[3][5] = hangulForm[3][5]; // 십
    }

    void putHangulMinuteOne(String[][] hangulClock, String[][] hangulForm, int minuteOne) {
        if (minuteOne == 0) {
            return;
        }
        for (HangulMinute hm : HangulMinute.values()) {
            if (minuteOne == hm.getMinute()) {
                hangulClock[hm.getRow()][hm.getColumn()] = hangulForm[hm.getRow()][hm.getColumn()];
            }
        }
        hangulClock[5][5] = hangulForm[5][5]; // 분
    }
}
