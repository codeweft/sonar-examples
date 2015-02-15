package example;

public class One {
  String message = "foo";

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
  }
  
  public void uncoveredMethod1() {
    System.out.println(foo());
  }
}
