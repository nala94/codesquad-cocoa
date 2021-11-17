package week3.hangulClock;

public enum HangulMinute {
    TWO_TEN(20, 3, 1),
    THREE_TEN(30, 3, 2),
    FOUR_TEN(40, 3, 3),
    FIVE_TEN(50, 3, 4),
    ONE(1, 4, 1),
    TWO(2, 4, 2),
    THREE(3, 4, 3),
    FOUR(4, 4, 4),
    FIVE(5, 5, 1),
    SIX(6, 4, 5),
    SEVEN(7, 5, 2),
    EIGHT(8, 5, 3),
    NINE(9, 5, 4);

    private final int minute;
    private final int row;
    private final int column;

    HangulMinute(int minute, int row, int column) {
        this.minute = minute;
        this.row = row;
        this.column = column;
    }

    public int getMinute() {
        return minute;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
