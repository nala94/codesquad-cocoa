package day3;

import java.util.Random;
import java.util.Scanner;

public class GetRandomMember {

    public void printMember(Random rd, String[] member, int n){
        for(int i=0; i<n; i++){
            int x = rd.nextInt(member.length);
            System.out.print(member[x]);
            if(i < n-1){
                System.out.print(", ");
            }

        }
    }

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명인가요? ");
        int n = sc.nextInt();

        String[] member = {"BC", "호두마루", "DAVE", "Barney", "meatsby", "mong", "Jun", "Phil", "Dike", "Jhin", "OS"};
        GetRandomMember grm = new GetRandomMember();

        grm.printMember(rd, member, n);


    }
}
