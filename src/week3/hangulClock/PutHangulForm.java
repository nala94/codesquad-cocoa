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

    void putHangulMinuteTen(String[][] hangulClockForm, String[][] hangulForm, int minuteTen) {
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

    void putHangulMinuteOne(String[][] hangulClockForm, String[][] hangulForm, int minuteOne) {
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
