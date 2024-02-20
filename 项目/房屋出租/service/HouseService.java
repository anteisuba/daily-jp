package 项目.房屋出租.service;

import 项目.房屋出租.domain.House;

public class HouseService{
    private House[] houses; //保存House对象
    private int houseNums = 1; //记录当前有多少个房屋信息
    private int idCounter = 1; //记录当前的id增长

    public HouseService(int size) {  //无参构造器
        houses = new House[size];
        houses[0] = new House(1,"javk","112","配点",2000,"修造");

        this.houses = houses;
    }
    //find方法，查找房屋信息
    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }

        return null;
    }
    //del方法，删除一个房屋信息
    public boolean del(int delId) {
        //应当先找到要删除的房屋信息对应的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) { //要删除的房屋对应的id，在数组下标为i的元素
                index = i;
            }
        }
        if (index == -1) {  //说明delId在数组中不存在
            return false;

        }
        //如果找到，删除
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];

        }
        houses[--houseNums] = null;  //把当前存在的房屋信息的最后一个设置null
        return true;

    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加
        if(houseNums == houses.length) { //已满，不能再添加
            System.out.println("数组已满，不能再添加了");
            return false;
        }
        //把newHouse对象加入到,新增加了一个房屋
        houses[houseNums++] = newHouse;
        //id自增长机制，然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;



    }

    public House[] list(){
          return houses;
    }

}


