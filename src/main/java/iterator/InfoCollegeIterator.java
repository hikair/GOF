package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author 35147
 */
public class InfoCollegeIterator implements Iterator {

    /**
     * 信息工程学院是以List方式存储
     */
    List<Department> departmentList;

    /**
     * 索引
     */
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1) {
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
