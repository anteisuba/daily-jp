package 常用类;/*
 *@author yang
 */

public class Homework02 {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123456";
        String email = "jacs@com.";
        try {
            input(name,pwd,email);
            System.out.println("恭喜你，注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void input(String name,String pwd,String email) {
        if (!(name.length() > 1 && name.length() < 5)) {
            throw new RuntimeException("用户名长度不对");
        }
        if (!(pwd.length() == 6 && isDal(pwd))) {
            throw new RuntimeException("密码长度为6且全是数字");
        }
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱需要包含@和.");
        }

    }
    public static boolean isDal(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}

