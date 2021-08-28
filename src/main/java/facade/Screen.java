package facade;

/**
 * @author 35147
 */
public class Screen {

    /**
     * 使用单例模式，饿汉式
     */
    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println(" Screen up ");
    }

    public void down(){
        System.out.println(" Screen down ");
    }

}
