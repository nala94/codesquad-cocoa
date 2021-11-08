package day8.ledger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prompt {
    void runPrompt(){
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> account = new HashMap<>();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Password: ");
        String pw = sc.next();

        account.put(name, pw);

    }
}
