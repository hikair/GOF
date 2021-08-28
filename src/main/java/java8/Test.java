package java8;

/**
 * @author 35147
 */
public interface Test {
    default void sayHello(){
        System.out.println("hello");
    }
}
