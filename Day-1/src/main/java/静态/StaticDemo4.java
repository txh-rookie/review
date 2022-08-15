package 静态;

/**
 * @author kevintam
 * @version 1.0
 * @title
 * @description
 * @createDate 2022/8/15
 */
public class StaticDemo4 {
    //访问形式:
    /**
     * 1、实例方法是否可以使用访问实例成员变量。能被访问，因为都是基于对象的。
     * 2、实例方法是否可以直接访问静态成员变量。是可以的，因为静态成员变量是属于类的，能够被对象所共享的。
     * 3、实例方法是否可以直接访问实例方法. 可以的，因为都是属于对象的。
     * 4、实例方法是否可以直接访问静态方法。可以访问,静态变量是属于类的,只有一份，能够被所有的对象进行共享。
     * 5、静态方法是否可以直接访问实例变量。不可以的，因为静态变量是属于类的，而实例变量是属于对象的，当我们的静态方法被初始化的，实例变量是没有被加载的。
     * 6、静态方法是否直接访问静态变量。可以的
     * 7、静态方法是否直接访问实例方法。不可以
     * 8、静态方法是否可以直接访问静态方法。可以的
     */
    public String name;
    private static Integer age;
    public void setName(){
        System.out.println(name);
        System.out.println(age);
    }
}
