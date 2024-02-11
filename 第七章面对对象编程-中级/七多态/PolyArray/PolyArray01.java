package 面向对象中级.五多态.PolyArray;

public class PolyArray01 {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("yang",24);
        persons[1] = new Student("jian",24,100);
        persons[2] = new Student("y",22,22100);
        persons[3] = new Teacher("j",30,32100);
        persons[4] = new Teacher("s",50,42100);

        for (int i = 0; i < persons.length; i++) {
            //person[i]编译类型是Person ，运行类型是根据情况
            System.out.println(persons[i].say());  //动态绑定机制
            //类型判断+向下转型
            if (persons[i] instanceof Student) { //判断person[i]的运行类型是不是Student
                ((Student)persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            } else {
                System.out.println("没有这种方法");
            }
        }

    }
}
