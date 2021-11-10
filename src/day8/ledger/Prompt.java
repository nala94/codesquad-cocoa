package day8.ledger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prompt {
    Scanner sc = new Scanner(System.in);
    AccountInfo accInfo;
    ArrayList<AccountInfo> acc;
    HashMap<String, String> user;

    void runPrompt() {
        acc = new ArrayList<>();
        user = new HashMap<>();


        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Password: ");
        String pw = sc.next();

        user.put(name, pw);
        InputData();
        printData();
    }

    private void printData() {
        for (int i=0; i < acc.size(); i++){
            accInfo = acc.get(i);

            System.out.println(accInfo.inputDate);
            System.out.println(accInfo.description);
            System.out.println(accInfo.income);
            System.out.println(accInfo.outcome);
        }
    }

    private void InputData() {
        accInfo = new AccountInfo();
        sc.nextLine();

        System.out.print("날짜 : ");
        accInfo.inputDate = sc.nextLine();
        System.out.print("내용 : ");
        accInfo.description = sc.nextLine();
        System.out.print("수입 : ");
        accInfo.income = sc.nextInt();
        System.out.print("지출 : ");
        accInfo.outcome = sc.nextInt();
        acc.add(accInfo);
    }
}
