package 面向对象中级.四继承.improve;

public class Extends01{
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "xiao";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "yangj";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
