package visitor;

/**
 * 这里使用到了双分派，即首先在客户端程序中，将具体状态作为参数传递Man中（第一次分派）
 * 然后Man类调用作为参数的“具体方法”中方法getManResult,同时将自己（this）作为参数传入，完成第二次分派
 * @author 35147
 */
public class Man extends Person {
    public Man(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
