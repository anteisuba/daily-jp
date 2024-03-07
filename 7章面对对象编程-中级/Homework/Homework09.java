package 面向对象中级.homework;

import java.lang.constant.DynamicCallSiteDesc;

public class Homework09 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack",24,"yisheng",1,20000);
        Doctor doctor2 = new Doctor("yang",25,"IT",0,30000);
        System.out.println(doctor1.equals(doctor2));
    }
}
class Doctor {
    private String name;
    private int age;
    private String job;
    private double gender;
    private double sal;

    public Doctor(String name, int age, String job, double gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getGender() {
        return gender;
    }

    public void setGender(double gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (! (obj instanceof Doctor)) {
            return false;
        }
        Doctor doctor = (Doctor)obj;
        return this.name.equals(doctor.name) && this.age == doctor.age && this.gender == doctor.gender && this.job.equals(doctor.job) && this.sal == sal;

    }
}
