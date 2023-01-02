package Bean_lifecycle;

public class beanLifecycle {

  public void init() throws Exception {

    System.out.println("this bean has been instantiated");
  }

  public void destroy() throws Exception {

    System.out.println("Containers has been closed");
  }
}
