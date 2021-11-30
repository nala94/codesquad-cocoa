package week1.mission2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GetRandomMember {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    public static final String[] MEMBER = {"BC", "호두마루", "DAVE", "Barney", "meatsby", "mong",
            "Jun", "Phil", "Dike", "Jhin", "OS"};

    private static List<String> createList() throws FileNotFoundException {
        List cocoaList = new ArrayList();
        File f = new File("./user.txt");
        Scanner s = new Scanner(f);
        while (s.hasNext()) {
            String name = s.next();
            cocoaList.add(name);
        }
        return cocoaList;

    }


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
        sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        GetRandomMember grm = new GetRandomMember();
        List<String> cocoaList = createList();
        int i = 1;
        for (String sr : cocoaList) {
            System.out.println(i + ". " + sr);
            i++;
        }
//        grm.printMember();
    }


}
