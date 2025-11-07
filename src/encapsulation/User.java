package encapsulation;

public class User {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }else {
            System.out.println("Invalid Age!!!");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }
}
