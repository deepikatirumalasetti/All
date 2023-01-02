package initializing_disposable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class App {
  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Spring-Customer.xml" });

    CustomerService cust = (CustomerService) context.getBean("customerService");

    System.out.println(cust);

    context.close();
  }
}