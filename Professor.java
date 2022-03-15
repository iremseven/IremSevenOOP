import java.util.PrimitiveIterator;

public class Professor extends Person{
    private String prof_name;

    Professor(String name){

        prof_name = name;

    }
    public void setStd_name(String prof_name){
        this.prof_name = prof_name;
    }
    public String getStd_name(){
        return prof_name;
    }

    void teachs(){

        System.out.println("prof" + prof_name+ "is teaching now");
    }

}
//iremseven