package this和supper的使用总结;

/**
 * @author kevintam
 * @version 1.0
 * @title
 * @description
 * @createDate 2022/8/15
 */
public class ThisDemo {
    /**
     * 总结与扩展：this和supper关键字使用总结
     * this代表当前对象的引用(继承重指代子类对象)
     *  this.子类成员变量
     *  this.子类成员方法
     *  this():可以根据参数匹配访问本类其他构造器。
     *  supper代表类父类对象的引用(继承中指代类父类对象空间)
     *    supper.父类成员变量。
     *    supper.父类的成员方法
     *    supper(...):可以根据参数匹配访问父类的构造器。
     *    this(...)和supper(...)必须放在第一行，所以this(..)和supper(.....)不能放在一起使用
     */
}
