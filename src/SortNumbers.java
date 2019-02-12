import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        String[] strArr = str.split(", ");
        int[] num = new int[strArr.length];
        int i = 0;
        for (String str1 : strArr) {
            num[i] = Integer.parseInt(str1);
            i++;
        }
        Arrays.sort(num);
        String sep = "";
        for (int i1 = num.length - 1; i1 >= 0; i1--) {
            System.out.print(sep + num[i1]);
            sep = ", ";
        }
    }
}