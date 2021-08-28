package iterator;

import java.util.ArrayList;

/**
 * @author 35147
 */
public class Client {

    public static void main(String[] args) {
        // 创建学院
        ArrayList<College> collegeList = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPutimpl = new OutPutImpl(collegeList);
        outPutimpl.printCollege();
    }

}
