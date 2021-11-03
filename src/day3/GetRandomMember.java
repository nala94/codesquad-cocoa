package day3;

import java.util.Random;
import java.util.Scanner;

public class GetRandomMember {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    public static final String[] MEMBER = {"BC", "호두마루", "DAVE", "Barney", "meatsby", "mong",
            "Jun", "Phil", "Dike", "Jhin", "OS"};

    public void printMember() {

        System.out.print("몇 명인가요? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = rd.nextInt(MEMBER.length);
            System.out.print(MEMBER[x]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        GetRandomMember grm = new GetRandomMember();
        grm.printMember();
    }

}
