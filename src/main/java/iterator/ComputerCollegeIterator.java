package iterator;

import java.util.Iterator;

/**
 * @author 35147
 */
public class ComputerCollegeIterator implements Iterator {

    /**
     * 这里我们需要Department 是以怎么的方式存储  数组
     */
    Department[] departments;

    /**
     * 遍历的位置
     */
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        if(position > departments.length || departments[position] == null) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
