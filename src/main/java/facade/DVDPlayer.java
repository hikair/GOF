package facade;

/**
 * @author 35147
 */
public class DVDPlayer {

    /**
     * 使用单例模式，饿汉式
     */
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" DVD on ");
    }

    public void off(){
        System.out.println(" DVD off ");
    }

    public void play(){
        System.out.println(" DVD playing ");
    }
    public void pause(){
        System.out.println(" DVD pause ");
    }
}
