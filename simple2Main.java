public class simple2Main {
    public static void main(String[] args){

        Professor p1;
        Professor p2;
        Student s1;

        p1 = new Professor("Ensar gül");
        p1.Country = "Turkey";
        p1.ShowCountry();
        p1.teachs();

        p2 = new Professor( "Raif hoca");
        p2.Country = "Turkey";
        p2.ShowCountry();
        p2.teachs();

        s1 = new Student("irem seven");
        s1.Country = "Greece";
        s1.ShowCountry();
        s1.learns();


    }

}
