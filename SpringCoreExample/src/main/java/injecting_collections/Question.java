package injecting_collections;

import java.util.Map;

public class Question {
  int questionId;

  String question;

  Map<Integer, String> solution;

  public int getQuestionId() {

    return this.questionId;
  }

  public void setQuestionId(int questionId) {

    this.questionId = questionId;
  }

  public String getQuestion() {

    return this.question;
  }

  public void setQuestion(String Question) {

    this.question = this.question;
  }

  public Map<Integer, String> getSolution() {

    return this.solution;
  }

  public void setSolution(Map<Integer, String> solution) {

    this.solution = solution;

  }

  @Override
  public String toString() {

    // TODO Auto-generated method stub
    return super.toString();
  }

  @Override
  public boolean equals(Object obj) {

    // TODO Auto-generated method stub
    return super.equals(obj);
  }

  public void display() {

    System.out.println(getQuestionId());
    System.out.println(getQuestion());
    System.out.println(getSolution());
  }
}
