package 面向对象中级.四继承.improve;
//父类 是pupil 和 Graduate
public class Student {
    //共有属性
    public String name;
    public int age;
    public double score;
    public void setScore(double score) {
        this.score = score;
    }
    //共有方法
     public void showInfo() {
        System.out.println("学生名字" + name + "年龄" + age + "成绩" + score);
    }

    public static void main(String[] args) {

    }
}

