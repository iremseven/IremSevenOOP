public class simple2Main {
    public static void main(String[] args){

        Professor p1;
        Professor p2;
        Student s1;

        p1 = new Professor("Ensar gül");
        p1.setCountry("Turkey");
        p1.getCountry();

        p1.ShowCountry();
        p1.teachs();

        p2 = new Professor( "Raif hoca");
        p2.setCountry("Turkey");
        p2.getCountry();
        p2.ShowCountry();
        p2.teachs();

        s1 = new Student("irem seven");
        s1.setCountry("Turkey");
        s1.getCountry();
        s1.ShowCountry();
        s1.learns();


    }

}
