package day3;

import java.util.Scanner;

public class Naming {

    public static final String[] YEAR_NAME = {"시끄러운", "푸른", "어두운", "조용한", "웅크린", "백색",
            "지혜로운", "용감한", "날카로운", "욕심 많은"};
    public static final String[] MONTH_NAME = {"늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛",
            "말", "돼지", "하늘", "바람"};
    public static final String[] DAY_NAME = {"와(과) 함께 춤을", "의 기상", "은(는) 그림자 속에", "", "", "",
            "의 환생", "의 죽음", "아래에서", "을(를) 보라", "이(가) 노래하다", "의 그늘", "의 일격", "에게 쫓기는 남자",
            "의 행진", "의 왕", "의 유령", "을 죽인 자", "은(는) 맨날 잠잔다.", "처럼", "의 고향", "의 전사", "은(는) 나의 친구",
            "의 노래", "의 정령", "의 파수꾼", "의 악마", "와(과) 같은 사나이", "의 심판자", "의 혼", "은(는) 말이 없다"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("생년월일을 입력해 주세요> ");
//        String year = sc.next();
//        String month = sc.next();
//        String str_day = sc.next();
        int year = Integer.parseInt(sc.next());
        int month = Integer.parseInt(sc.next());
        int day = Integer.parseInt(sc.next());

        int y = year % 10;
        int m = month - 1;
        int d = day - 1;

        System.out.println(DAY_NAME.length);
        System.out.println(y);
        System.out.println("당신의 이름은 " + YEAR_NAME[y] + " " + MONTH_NAME[m] + DAY_NAME[d] + "입니다.");
        System.out.printf("당신의 이름은 %s %s%s입니다.", YEAR_NAME[y], MONTH_NAME[m], DAY_NAME[d]);
    }
}
