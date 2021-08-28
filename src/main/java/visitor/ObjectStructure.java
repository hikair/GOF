package visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理很多人（Man、Woman）
 * @author 35147
 */
public class ObjectStructure {

    /**
     * 维护了一个集合
     */
    private List<Person> persons = new LinkedList<>();

    /**
     * 增加
     * @param person
     */
    public void attach(Person person) {
        persons.add(person);
    }

    /**
     * 移除
     * @param person
     */
    public void detach(Person person) {
        persons.remove(person);
    }

    /**
     * 显示测评情况
     * @param action
     */
    public void display(Action action) {
        for (Person person : persons) {
            if(!"".equals(person.assess)){
                System.out.println(person.name+"已经评价过了，评价为"+person.assess);
                continue;
            }
            person.accept(action);
            person.assess = action.name;
        }
    }
}
