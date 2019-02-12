import java.util.LinkedList;
import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        String[] strArr = str.split(",");

        LinkedList<String> list = new LinkedList<>();
        for (String ii : strArr) {
            list.add(ii);
        }
        int n = list.size();
        for (int j = 0; j < n; j++) {
            list.remove("0");
        }
        int m = list.size();
        for (int jj = 0; jj < (n - m); jj++) {
            list.add("0");
        }
        String sep = "";
        StringBuilder str2 = new StringBuilder();
        int pp = 0;
        for (String str3 : list){
            str2.append(list.get(pp)).append(",");
            pp++;
        }

        str2.setLength(str2.length()-1);
               System.out.println(str2.toString());
    }
}

