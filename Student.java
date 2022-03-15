public class Student extends Person{
    String std_name;

    Student(String name){
        std_name = name;
    }

    void learns(){
        System.out.println("std" +std_name+ "is learning now");
    }

}
