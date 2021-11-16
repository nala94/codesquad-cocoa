package week3.hangulClock;

public class PutHangulForm {

    void putHangulHour(String[][] hangulClockForm, String[][] hangulForm, int hour) {
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
