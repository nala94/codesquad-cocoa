package week3.hangulClock;

public enum HangulHour {
    ONE(1, 0, 0),
    TWO(2, 0, 1),
    THREE(3, 00, 2),
    FOUR(4, 0, 3),
    FIVE_DA(5, 0, 4),
    FIVE_SEOT(5, 0, 51),
    SIX_YEO(6, 1, 0),
    SIX_SEOT(6, 1, 1),
    SEVEN_IL(7, 1, 2),
    SEVEN_GOB(7, 1, 3),
    EIGHT_YEO(8, 1, 4),
    EIGHT_DULB(8, 1, 52),
    NINE_AH(9, 2, 0),
    NINE_HOB(9, 2, 1),
    TEN_YEOL(10, 2, 2),
    ELEVEN_YEOL(11, 2, 2),
    ELEVEN_HAN(11, 2, 3),
    TWELVE_YEOL(12, 2, 2),
    TWELVE_DOOL(12, 2, 4);

    private final int hour;
    private final int row;
    private final int column;

    HangulHour(int hour, int row, int column) {
        this.hour = hour;
        this.row = row;
        this.column = column;
    }

    public int getHour() {
        return this.hour;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

}