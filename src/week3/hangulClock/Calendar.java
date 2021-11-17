package week3.hangulClock;

import java.time.LocalDate;

public class Calendar {
    public static void main(String[] args) {

        //날짜를 받아온다.
        LocalDate now = LocalDate.now();

        // 날짜를 연도, 월, 일로 분리해서 저장한다.
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();


        // 달력을 출력한다.
        /*
        1. 한달을 출력하게 한다.
        2. 출력하는 년월의 1일이 어떤 요일인지 구한다.
        3. 연도가 윤년인지 구한다.
         */
    }
}
