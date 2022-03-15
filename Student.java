public class Student extends Person{
    private String std_name;

    Student(String name) {

        std_name = name;


    }
    public void setStd_name(String std_name){
        this.std_name = std_name;
    }
    public String getStd_name(){
        return std_name;
    }
    void learns(){
        System.out.println("std" +std_name+ "is learning now");
    }

}
