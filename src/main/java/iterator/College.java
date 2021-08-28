package iterator;

import java.util.Iterator;

/**
 * @author 35147
 */
public interface College {

    String getName();

    /**
     * 增加系的方法
     * @param name
     * @param desc
     */
    void addDepartment(String name, String desc);

    Iterator createIterator();
}
