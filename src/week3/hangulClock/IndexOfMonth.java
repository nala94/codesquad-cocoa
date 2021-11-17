package week3.hangulClock;

enum IndexOfMonth {
    JAN(1, 0),
    FEB(2, 1),
    MAR(3, 2),
    APR(4, 3),
    MAY(5, 4),
    JUN(6, 5),
    JUL(7, 6),
    AUG(8, 7),
    SEP(9, 8),
    OCT(10, 9),
    NOV(11, 10),
    DEC(12, 11);

    private int month;
    private int index;

    IndexOfMonth(int month, int index) {
        this.month = month;
        this.index = index;
    }

    public int getMonth() {
        return this.month;
    }

    public int getIndex() {
        return this.index;
    }
}