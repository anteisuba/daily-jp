package 面向对象高级.代码块;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("yang");
        Movie movie02 = new Movie("yang",20);
        Movie movie03 = new Movie("yang",30,"jian");

    }
}
class Movie {
    private String name;
    private double price;
    private String director;
    //不管调用哪个构造器，创建对象，都会先调用代码块的内容
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影正是开始");
    };
    //三个构造器-》重载
    public Movie(String name) {
        System.out.println("Movie(String name)被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("Movie(String name, double price)被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price,String director)被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
