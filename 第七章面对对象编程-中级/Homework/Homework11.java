package 面向对象中级.homework;

public class Homework11 {
    public static void main(String[] args) {
        Person2[] p2 = new Person2[4];
        p2[0] = new Student1("yang",'男',24,"120224");
        p2[1] = new Student1("yan",'男',32,"120224");
        p2[2] = new Teacher1("ya",'女',33,5);
        p2[3] = new Teacher1("y",'女',56,10);
        Student1 student1 = new Student1("xiao", 'n', 12, "00020003");
        student1.printInfo();
        Teacher1 teacher1 = new Teacher1("las", 'n', 33, 20);
        teacher1.printInfo();
        Homework11 homework11 = new Homework11();
        homework11.bubbleSort(p2);

        for (int i = 0; i < p2.length; i++) {
            System.out.println(p2[i].toString());
        }

        //遍历多态数组
        System.out.println("========");
        for (int i = 0; i < p2.length; i++) {
            homework11.test(p2[i]);
        }


    }

    public void test(Person2 person2) {
        if (person2 instanceof Student1) {
            ((Student1) person2).study();
        } else if (person2 instanceof Teacher1) {
            ((Teacher1) person2).teach();
        } else {
            System.out.println("do nothing");
        }

    }

    public void bubbleSort(Person2[] p2) {
        Person2 temp = null;
        for (int i = 0; i < p2.length - 1; i++) {
            for (int j = 0; j < p2.length - 1 - i; j++) {
                if (p2[j].getAge() < p2[j + 1].getAge()) {
                    temp = p2[j];
                    p2[j] = p2[j + 1];
                    p2[j + 1] = temp;
                }

            }
        }
    }
}
class Person2 {
    private String name;
    private char sex;
    private int age;

    public Person2(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return name + "玩游戏";
    }

    public String basicInfo() {
        return "姓名" + name + "\n年龄" + age + "\n性别" + sex;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
class Student1 extends Person2{
    private String stuid;

    public Student1(String name, char sex, int age, String stuid) {
        super(name, sex, age);
        this.stuid = stuid;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "stuid='" + stuid + '\'' +
                '}' + super.toString();
    }

    public void study() {
        System.out.println(getName() + "承认 我会好好学习");
    }

    public String paly() {
        return super.play() + "爱玩足球";
    }

    public void printInfo() {
        System.out.println("学 生的信息");
        System.out.println(super.basicInfo());
        System.out.println("学号" + stuid);
        study();
        System.out.println(paly());
    }
}

class Teacher1 extends Person2{
    private int workage;

    public Teacher1(String name, char sex, int age, int workage) {
        super(name, sex, age);
        this.workage = workage;
    }

    public int getWorkage() {
        return workage;
    }

    public void setWorkage(int workage) {
        this.workage = workage;
    }

    @Override
    public String toString() {
        return "Teacher1{" +
                "workage=" + workage +
                '}' + super.toString();
    }

    public void teach() {
        System.out.println(getName() + "承认 我会认真教学");
    }
    public String play() {
        return super.play() + "爱玩象棋";
    }
    public void printInfo() {
        System.out.println("老师的信息");
        System.out.println(super.basicInfo());
        System.out.println("工龄" + workage);
        teach();
        System.out.println(play());
    }
}
