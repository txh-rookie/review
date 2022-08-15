import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kevintam
 * @version 1.0
 * @title
 * @description
 * @createDate 2022/8/15
 */
public class ThisDemo2 {
    /**
     * this关键字的回顾
     * this表示当前对象的引用
     * this关键字可以用在实例方法和构造器中
     * this用在方法中，谁调用这个方法，this就代表谁。
     * this用在构造器，代表类构造器正在初始化的那个对象的作用。
     *
     */
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.setName("金毛");
        System.out.println(a1);
    }

}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Animal{
    private String name;
    private int age;
    private char sex;
}
