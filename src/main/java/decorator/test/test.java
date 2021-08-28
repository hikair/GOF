package decorator.test;

public class test {

    public static void main(String[] args) {
        P b = new B(new A());
        b.m();
    }
}
