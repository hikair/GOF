package proxy.dynamic;

/**
 * @author 35147
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中~");
    }

    @Override
    public void test(String name) {
        System.out.println("测试:"+name);
    }


}
