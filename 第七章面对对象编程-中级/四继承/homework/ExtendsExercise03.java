package 面向对象中级.四继承.homework;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel",16,500,"IBM");
        pc.printInfo();
        NotePad notePad = new NotePad("intel",18,500,"red");
        notePad.printInfo02();
    }
}
class Computer {
    private String CPU;
    private int momory;
    private int disk;

    public Computer() {

    }
    public Computer(String CPU,int momory , int disk) {
        this.CPU = CPU;
        this.momory = momory;
        this.disk = disk;
    }
    public String getDetails() {
        return "cpu=" + CPU + "memory=" + momory + "disk=" + disk;
    }
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMomory() {
        return momory;
    }

    public void setMomory(int momory) {
        this.momory = momory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }


}

