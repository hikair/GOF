package decorator.test;

public class B extends P {

    P p;

    public B(P p) {
        this.p = p;
    }

    @Override
    public void m() {
        p.m();
        System.out.println("B");
    }
}
