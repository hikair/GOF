package flyweight.integer;

/**
 * @author 35147
 */
public class FlyWeight {
    public static void main(String[] args) {

        // 如果Integer.valueOf(x) x在-128~127之间，就是使用享元模式返回，如果不在范围内，则仍然new
        // 在valueOf方法中，先判断是否在IntegerCache中，如果不在，就创建新的Integer(new)，否则，就直接从缓存池返回
        // valueOf方法，就使用到享元模式

        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        // true
        System.out.println(x.equals(y));
        // false
        System.out.println(x == y);
        // true
        System.out.println(x == z);
        // false
        System.out.println(w == x);
        // false
        System.out.println(w == y);

    }
}
