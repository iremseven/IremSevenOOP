public class simple2Main {
    public static void main(String[] args){

        Professor p1;
        Professor p2;
        Student s1;
        Person prsn;

        p1 = new Professor("Ensar Gül");
        p1.setCountry("Turkey");
        System.out.println("Ensar Gül : " + p1.getCountry());
        p1.teachs();

        p2 = new Professor( "Raif Hoca");
        p2.setCountry("Turkey");
        System.out.println("Raif Hoca : " + p2.getCountry());
        p2.teachs();

        s1 = new Student("irem Seven");
        s1.setCountry("Turkey");
        System.out.println("İrem Seven : " + s1.getCountry());
        s1.learns();
        prsn = new Person("Turkey");
        prsn.ShowCountry();


    }

}
