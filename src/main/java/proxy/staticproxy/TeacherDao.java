package proxy.staticproxy;

/**
 * @author 35147
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中~");
    }
}
