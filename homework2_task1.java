// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
/*public static void main(String[] args) {

}

public String shuffle(final String s, final int[] index){

return "";
}
}*/

import java.util.Scanner;

public class homework2_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String s = sc.nextLine();
        int[] index = new int[s.length()];
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            index[i] = count;
            count -= 1;
        }
        System.out.println(shuffle(s, index));
        sc.close();
    }

    public static String shuffle(final String s, final int[] index) {
        char[] chars = s.toCharArray();
        String symbol = "";
        for (int i : index)
        symbol += chars[i - 1];
        return symbol;
    }
}
