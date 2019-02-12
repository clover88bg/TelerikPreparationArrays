
import java.util.Scanner;

public class IsAListSorted {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        String str1 = "";
        StringBuilder builder = new StringBuilder(10);
        scann.nextLine();
        for (int i = 0; i < number; i++) {
            String str = scann.nextLine();
            int num[] = convertInput(str);
            builder.append(isSorted(num)).append("\n");
        }
        String result = builder.toString();
            System.out.println(result);
        }

    private static int[] convertInput(String str) {
        String[] strArr = str.split(",");
        int[] num = new int[strArr.length];
        int i = 0;
        for (String str1 : strArr) {
            num[i] = Integer.parseInt(str1);
            i++;
        }
        return num;
    }

    private static boolean isSorted(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                return false;
            }
        }
        return true;
    }
}