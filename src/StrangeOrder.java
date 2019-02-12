import java.util.Scanner;

public class StrangeOrder {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        StringBuilder builder = new StringBuilder(20);
        String[] strArr = str.split(",");
        int n = strArr.length;
        for (int jj = 0; jj < n; jj++) {
            if (strArr[jj].startsWith("-"))
                builder.append(strArr[jj]).append(",");
        }
        for (int j = 0; j < n; j++) {
            if (strArr[j].equals("0")) {
                builder.append(strArr[j]).append(",");
            }
        }
        for (int ii = 0; ii < n; ii++) {
            if (!(strArr[ii].startsWith("-")) && !(strArr[ii].equals("0"))) {
                builder.append(strArr[ii]).append(",");
            }
        }
        builder.setLength(builder.length() - 1);
        System.out.println(builder.toString());
    }
}
