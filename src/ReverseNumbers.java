import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        String[] strArr = str.split(", ");
        int n = strArr.length;
        int[] a = new int[n];
        int i = 0;
        for (String str1 : strArr) {
            a[i] = Integer.parseInt(str1);
            i++;
        }
        int[] b = new int[n];
        int j = n;
        for (int ii = 0; ii < n; ii++) {
            b[j - 1] = a[ii];
            j = j - 1;
        }
        String sep = "";
        for (int k = 0; k < n; k++) {
            System.out.print(sep + b[k]);
            sep = ", ";
        }
    }
}
