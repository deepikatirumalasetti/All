package springexpressionlanguage;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringExpressionParserExample {
  public static void main(String[] args) {

    SpelExpressionParser parser = new SpelExpressionParser();
    Expression exp = parser.parseExpression("'Just a string value'");
    String message = (String) exp.getValue();
    System.out.println(message);

    System.out.println(parser.parseExpression("'Just a string value'.substring(5)").getValue());

    System.out.println(parser.parseExpression("'Just a string value'.length()").getValue());

    System.out.println(parser.parseExpression("'Just a string value'.substring('Just '.length())").getValue());

    System.out.println(parser.parseExpression("'Just a string value'.class").getValue());

    System.out.println(parser.parseExpression("'Just a string value'.bytes").getValue());

    System.out
        .println(parser.parseExpression("new com.geeksforgeeks.spring.Topic('Java')").getValue(Topic.class).getClass());
  }
}
