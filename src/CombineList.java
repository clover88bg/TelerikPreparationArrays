
import java.util.Scanner;

public class CombineList {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        String str2 = scann.nextLine();
        String[] strArr = str.split(",");
        String[] strArr2 = str2.split(",");
        int k = 0,l = 0;
        String sep = "";
        for (int j = 0;j<(strArr.length*2); j++){
            if (j%2==0){
                System.out.print(sep + strArr[k] + ",");
                sep = ",";
                k++;
            }else {
                System.out.print(strArr2[l]);
                l++;
            }
        }
    }
}
