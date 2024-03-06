package 枚举和注解.自定义类实现枚举;/*
 *@author yang
 * 演示enum类的各种方法的使用
 */

public class EnumMethod {
    public static void main(String[] args) {
        Season03 autumn = Season03.SPRING;
        //name方法
        System.out.println(autumn.name());
        //ordinal方法,输出该枚举对象的次序/编号，从0开始编号
        System.out.println(autumn.ordinal());
        //values,含有定义的所有枚举对象
        Season03[] values = Season03.values();
        System.out.println("遍历取出枚举对象（增强for）");
        for (Season03 season : values) { //增强for循环
            System.out.println(season);
        }
        //valueof：将字符串转换成枚举对象，要求字符串必须为已有常量名
        // 否则报异常
        // 执行流程：根据输入的""到Season03的枚举对象去查找
        // 如果找到了就返回，没找到就报异常
        Season03 autumn1 = Season03.valueOf("SPRING");
        System.out.println("autumn1=" + autumn1);
        System.out.println(autumn == autumn1);

        //compareTo:比较两个枚举常量，比较的就是编号
        //Season03.SPRING编号 - Season03.WINTER编号
        System.out.println(Season03.SPRING.compareTo(Season03.WINTER));

        int[] nums = {1,2,3,4,5};
        System.out.println("=====普通的for===== ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("=====增强for======");
        //依次从nums数组中取出数据，赋给i，如果取出完毕，则退出for
        for (int i : nums) {
            System.out.println(i);
        }

    }
}
