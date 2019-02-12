import java.util.Scanner;

public class BelowAndAboveAverage {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        StringBuilder builder = new StringBuilder(20);
        StringBuilder builder1 = new StringBuilder(20);
        String[] strArr = str.split(",");
        int[] num = new int[strArr.length];
        int i = 0;
        for (String str1 : strArr) {
            num[i] = Integer.parseInt(str1);
            i++;
        }
        double sum = 0;
        for (int ii:num) {
            sum += ii;
        }
        double average = sum/num.length;
        for (int j:num){
            if (j > average){
                builder.append(j).append(",");
            }else if ( j<average){
                builder1.append(j).append(",");
            }
        }
        System.out.printf("avg: %.2f\n",average);
        builder.setLength(builder.length()-1);
        builder1.setLength(builder1.length()-1);
        System.out.println("below: " + builder1.toString());
        System.out.println("above: " + builder.toString());
    }
}
