public class Person {
    private String country;
    Person (String CNT){
        country = CNT;

    }

    public Person(){

    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
    public void ShowCountry(){
        System.out.println(("Country of the person: " +country));
    }
}

