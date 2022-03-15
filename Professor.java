public class Professor extends Person{
    String prof_name;

    Professor(String name){
        prof_name = name;
    }

    void teachs(){

        System.out.println("prof" +prof_name+ "is teaching now");
    }

}
