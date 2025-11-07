package encapsulation;

public class Test {

  public static void main(String[] args){
      User us = new User();
      us.setAge(-4);
      us.setName("RRRR");
      System.out.println(us.getAge());
      System.out.println(us.getName());
  }
}
