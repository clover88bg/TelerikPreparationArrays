
import java.util.Scanner;

public class RotateList {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        String[] strArr = str.split(",");
        int k = scann.nextInt();
        for (int j = 0; j < k ; j++) {
            String firstElement = strArr[0];
            System.arraycopy(strArr, 1, strArr, 0, strArr.length - 1);
            strArr[strArr.length - 1] = firstElement;
        }
        String sep = "";
        for (String str1:strArr) {
            System.out.print(sep + str1);
            sep = ",";
        }

    }
}
