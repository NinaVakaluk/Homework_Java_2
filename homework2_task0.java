/*Task_0
public class Task_0 {

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public static void main(String[] args) {

}

public String findJewelsInStones(String jewels, String stones) {

return "";
}
}*/
import java.util.Scanner;
public class homework2_task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите  драгоценные камни =  ");
        String jewels = sc.nextLine();
        System.out.printf("Введите все камни в куче =  ");
        String stones = sc.nextLine();
        String res = findJewelsInStones(jewels, stones);
        System.out.println(res);
        sc.close();
    }

       
         public static String findJewelsInStones(String jewels, String stones) {
            StringBuilder result = new StringBuilder();
            
            for (char jewel : jewels.toCharArray()) {
            int count = 0;
            for (char stone : stones.toCharArray()) {
            if (stone == jewel) {
            count++;
            }
            }
            result.append(jewel).append(count);
            }
            
            return result.toString();
            }
    }
                            