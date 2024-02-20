package 项目.房屋出租.view;

import 项目.房屋出租.domain.House;
import 项目.房屋出租.service.HouseService;
import 项目.房屋出租.utils.Utility;

public class HouseView {

    private boolean loop = true;  //控制显示菜单
    private char key = ' ';  //接收用户选择
    private HouseService houseService = new HouseService(2); //设置数组大小

    public void update() {
        System.out.println("=====修改房屋信息====");
        System.out.println("请选择待修改房屋的编号（-1）表示退出");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("=====你放弃修改房屋信息====");
            return;
        }
        //根据输入得到update，查找对象
        //因此后面对house.setXxx(),就会修改HouseService中数组的元素
        House house = houseService.findById(updateId); //返回的是引用类型[就是数组的元素]

        if (house == null) {
            System.out.println("===修改房屋信息编号不存在=====");
            return;
        }

        System.out.println("姓名(" + house.getName() + ")");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(name);
        }

        System.out.println("地址(" + house.getAddress() + "):");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setPhone(address);
        }

        System.out.println("租金(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }

        System.out.println("状态(" + house.getState() + "):");
        String state = Utility.readString(12, "");
        if (!"".equals(state)) {
            house.setState(state);
        }

        System.out.println("修改成功");

    }

    public void findHouse() {
        System.out.println("=====查找房屋=====");
        System.out.print("请输入你要查找的id：");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("查找的id不存在");
        }
    }

    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    public void delHouse() {
        System.out.println("====删除房屋信息=====");
        System.out.print("请输入带删除房屋的编号（-1退出）");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("====放弃删除房屋信息====");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') { //真的删除房屋信息
            if (houseService.del(delId)) {
                System.out.println("===删除房屋信息成功===");
            } else {
                System.out.println("===房屋编号不存在，删除失败===");
            }
        } else {
            System.out.println("====放弃删除房屋信息=====");
        }
    }


    //编写房屋列表
    public void listHouse() {
        System.out.println("======房屋列表======");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(已出租/未出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("======房屋列表显示完毕======");

    }

    public void addHouse() {  //接收用户输入
        System.out.print("=======添加房屋======");
        System.out.print("姓名");
        String name = Utility.readString(8);
        System.out.print("电话");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        //创建一个新的House对象，id是系统分配的，用户不能输入

        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("=====添加房屋成功=====");
        } else {
            System.out.println("=====添加房屋失败=====");
        }
    }

    public void mainMenu() {
        do {
            System.out.println("\n======房屋出租系统======");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 列 表");
            System.out.println("\t\t\t6 退     出");
            System.out.println("请输入你的选择");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }
}
