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
    private boolean isLoop = true;

    void runPrompt() {
        acc = new ArrayList<>();
        user = new HashMap<>();

        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Password: ");
        String pw = sc.next();

        user.put(name, pw);
        while (isLoop) {
            System.out.println("----------");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 출력");
            System.out.println("q. 종료");
            System.out.println("----------");
            System.out.print("SELECT> ");
            String cmd = sc.next();
            if (cmd.equals("q")) {
                isLoop = false;
                System.out.println("Bye~");
                break;
            }
            Map<String, Runnable> commands = new HashMap<>();
            commands.put("1", () -> InputData());
            commands.put("2'", () -> updateData());
            commands.put("3", () -> deleteData());
            commands.put("4", () -> printData());
            commands.get(cmd).run();
        }
        printData();
        sc.close();
    }

    private void InputData() {
        accInfo = new AccountInfo();
        sc.nextLine();
        int n = acc.size();
        System.out.println("---- 입력 ----");
        System.out.println(n + "번째 입력중");
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

    private void updateData() {
        accInfo = new AccountInfo();
        System.out.print("수정할 순번 : ");
        int update_num = sc.nextInt();

        sc.nextLine();
        System.out.println("---- 수정 ----");
        System.out.print("날짜 : ");
        accInfo.inputDate = sc.nextLine();
        System.out.print("내용 : ");
        accInfo.description = sc.nextLine();
        System.out.print("수입 : ");
        accInfo.income = sc.nextInt();
        System.out.print("지출 : ");
        accInfo.outcome = sc.nextInt();

        acc.set(update_num, accInfo);
    }

    private void deleteData() {
        System.out.print("삭제할 순번 : ");
        int delete_num = sc.nextInt();
        acc.remove(delete_num);
    }

    private void printData() {
        for (int i = 0; i < acc.size(); i++) {
            accInfo = acc.get(i);
            System.out.println("---- 출력 ----");
            System.out.println("순번 : " + i);
            System.out.println(accInfo.inputDate);
            System.out.println(accInfo.description);
            System.out.println(accInfo.income);
            System.out.println(accInfo.outcome);
        }
    }

}
