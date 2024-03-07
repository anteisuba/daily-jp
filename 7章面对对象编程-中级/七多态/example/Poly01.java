package 面向对象中级.五多态.example;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("dabanggu");
        tom.feed(dog,bone);

        Pig pig = new Pig("xianuha");
        Rice rice = new Rice("mifan");
        tom.feed(pig,rice);

    }
}


