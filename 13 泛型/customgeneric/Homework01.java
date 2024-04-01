package 泛型.customgeneric;/*
 *@author yang
 */

import java.util.List;

public class Homework01 {
    public static void main(String[] args) {

    }
}

class DAO<T> {

    public void save(String id,T entity) {

    }

    public T get(String id) {

    }

    public void update(String id,T entity) {

    }

    public List<T> list() {

    }

    public void delete(String id) {

    }

}

class User {
    private int id;
    private int age;
    private String name;


}