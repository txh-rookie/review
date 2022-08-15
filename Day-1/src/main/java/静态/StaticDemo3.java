package 静态;

/**
 * @author kevintam
 * @version 1.0
 * @title
 * @description
 * @createDate 2022/8/15
 */
public class StaticDemo3 {
    /**
     * static修饰的方法分为:
     *   （1）静态方法，使用static修饰的，是属于类的，直接随着类的记载而被记载，直接使用类名访问即可。
     *   （2）实例方法，无static修饰的，是属于对象的，必须先创建对象，在进行访问。
     *
     */
    public static String name;
    public static void setName(){
        System.out.println("名字"+name);
    }

    public static void main(String[] args) {
//        静态.StaticDemo3 staticDemo3 = new 静态.StaticDemo3();
//        staticDemo3.name="张三";
//        staticDemo3.setName();
//        静态.StaticDemo3.name="李四";
//        静态.StaticDemo3.setName();
    }
}
