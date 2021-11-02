import java.sql.SQLOutput;
import java.util.Scanner;

public class Gugudan {
    private static void printGugudan(int num1, int num2) {
        for(int i=num1; i<=num2; i++){
            System.out.println(i + "단을 출력합니다");
            for(int j=1; j<10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("구구단을 외자");

        Scanner sc = new Scanner(System.in);

        System.out.println("첫단과 끝단을 입력하세요");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("첫단: %d 끝단: %d %n%n", num1, num2);

        printGugudan(num1, num2);
        sc.close();


    }



}
