package 面向对象中级.四继承;

//大学生考试情况
public class Graduate {
    public String name;
    public int age;
    private  double score;
    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {//和pupil不一样

        System.out.println("大学生" + name + "正在考");
    }

    public void showInfo() {

        System.out.println("大学生名字" + name + "年龄" + age + "成绩" + score);
    }


}
