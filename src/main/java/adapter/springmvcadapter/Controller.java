package adapter.springmvcadapter;

/**
 * @author 35147
 */
public interface Controller {
}

class HttpController implements Controller{
    public void doHttpHandler(){
        System.out.println("http..");
    }
}

class AnnotationController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("annotation..");
    }
}

class SimpleController implements Controller{
    public void doSimpleHandler(){
        System.out.println("simple..");
    }
}