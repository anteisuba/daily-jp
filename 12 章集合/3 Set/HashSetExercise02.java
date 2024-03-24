package 集合.Set_;/*
 *@author yang
 */

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employ("yang",23.3,"0421"));
        hashSet.add(new Employ("jian",33.3,"4321"));
        hashSet.add(new Employ("yang",23.3,"1223"));
        hashSet.add(new Employ("yang",334,"0421"));
        System.out.println(hashSet);
    }
}
class Employ {
    private String name;
    private double sal;
    private String birthday;

    public Employ(String name, double sal, String birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employ employ = (Employ) o;
        return Objects.equals(name, employ.name) && Objects.equals(birthday, employ.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
