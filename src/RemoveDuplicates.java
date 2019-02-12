import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        List<String> list = Arrays.asList(str.split(","));
        ArrayList<String> newList = new ArrayList<>();

        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        String sep = "";
        for (String str1 : newList){
            System.out.print(sep + str1);
            sep = ",";
        }
    }
}
