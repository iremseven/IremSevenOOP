public class Person {
    public String Country;
    Person(String country){
        Country = country;
    }

    public Person(){

    }
    public void ShowCountry(){
        System.out.println(("Country of the person: "+Country));
    }
}
