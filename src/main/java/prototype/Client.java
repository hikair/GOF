package prototype;

/**
 * 原型模式
 * @author 35147
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.setFriend(new Sheep("bob",1,"黑色"));
        Sheep sheep2 = (Sheep)sheep.clone();
        // Sheep{name='tom', age=1, color='白色', friend=Sheep{name='bob', age=1, color='黑色', friend=null}}
        // 浅拷贝 克隆来的sheet里有个对象friend，只是把friend的内存地址拷过来，sheet和sheet2指向的是同一个friend
        System.out.println(sheep2);
    }
}
