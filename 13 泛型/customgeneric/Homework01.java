package 泛型.customgeneric;/*
 *@author yang
 */

import org.junit.jupiter.api.Test;

import java.util.*;

public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList() {  //给泛型T指定的类型是User
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1,10,"jack"));
        dao.save("002", new User(2,18,"king"));
        dao.save("003", new User(3,18,"simth"));
        List<User> list = dao.list();
        System.out.println(list);

        dao.update("003",new User(3,44,"yang"));
        dao.delete("001"); //删除
        System.out.println("=====");
        list = dao.list();
        System.out.println(list);
        System.out.println(dao.get("003"));


    }
}

class DAO<T> {

    private Map<String,T> map = new HashMap<>();

    public void save(String id,T entity) {
        map.put(id,entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id,T entity) {
        map.put(id,entity);
    }

    public List<T> list() {
        //遍历map，将map所有value（entity），封装到ArrayList返回即可
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key :keySet) {
            // 返回就是User对象-> ArrayList
            list.add(get(key));
        }

        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}