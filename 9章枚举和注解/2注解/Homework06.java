package 枚举和注解.注解;/*
 *@author yang
 */

public class Homework06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Horse());
        person.passHorse();
        person.passRiver();
        person.passSky();
    }
}
interface Vehicles {
    public void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("Horse作为交通工具");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("Boat作为交通工具");
    }
}

class Fly implements Vehicles {
    @Override
    public void work() {
        System.out.println("飞机作为交通工具");
    }
}

class Company {
    //马始终是同一匹马
    private static Horse horse = new Horse();
    private static Fly fly = new Fly();
    private Company() {

    }
    public static Horse getHorse() {
        return horse;

    }
    public static Boat getBoat() {
        return new Boat();

    }
    public static Fly getfly() {
        return fly;
    }
}

class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    //把具体的要求封装成方法,这里就是OOP
    public void passRiver() {
        if (!(vehicles instanceof Boat)) {

            vehicles = Company.getBoat();
        }

        vehicles.work();
    }
    public void passHorse() {
        //这里是接口的多态
        if (!(vehicles instanceof Horse)) {
            vehicles = Company.getHorse();
        }

        vehicles.work();
    }

    public void passSky() {
        if (!(vehicles instanceof Fly)) {
            vehicles = Company.getfly();
        }
        vehicles.work();

    }
}
