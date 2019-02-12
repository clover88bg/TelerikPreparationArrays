import java.util.*;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        List<String> list = Arrays.asList(str.split(","));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size();i++) {
            sb.append(i+1).append(",");
        }
        sb.setLength(sb.length() - 1);
        String strTemplate = sb.toString();
        List<String> stringTemplate =  Arrays.asList(strTemplate.split(","));
        ArrayList<String> newList = new ArrayList<>();
        for (String element : stringTemplate) {
            if (!list.contains(element)) {
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
