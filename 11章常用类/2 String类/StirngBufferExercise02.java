package 常用类.String类;/*
 *@author yang
 */

import java.util.Scanner;

public class StirngBufferExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String price = scanner.next();
        StringBuffer s1 = new StringBuffer(price);
        for (int i = s1.lastIndexOf(".") - 3;i > 0;i -= 3) {
            s1 = s1.insert(i,",");
        }
        s1.append(name);
        System.out.println(s1);
    }
}
