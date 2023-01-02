package injecting_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
  private static ApplicationContext context;

  public static void main(String args[]) {

    context = new ClassPathXmlApplicationContext("solution.xml");

    Question q = (Question) context.getBean("answer");
    q.display();
  }
}
