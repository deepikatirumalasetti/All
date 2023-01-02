package Bean_lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanCycle {
  public static void main(String[] args) throws Exception {

    ConfigurableApplicationContext life = new ClassPathXmlApplicationContext("lifeCycle.xml");
    life.close();
  }

}