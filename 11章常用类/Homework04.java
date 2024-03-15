package 常用类;/*
 *@author yang
 */

public class Homework04 {
    public static void main(String[] args) {
        String str = "yang123AASD";
        zimu(str);
    }
    public static void zimu(String str) {
        if (str == null) {
            System.out.println("字符串为空");
            return;
        }

        int temp = 0;
        int temp2 = 0;
        int temp3 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                temp++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                temp2++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                temp3++;
            } else {
                System.out.println("qita");
            }
        }

        System.out.println("数字有" + temp + "小写字母" + temp2 + "大写字母" + temp3);
    }
}

