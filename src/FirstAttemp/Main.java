package FirstAttemp;

import FirstAttemp.Customer;

public class Main {
    public static void main(String[] args) {

        //Builder Pattern
        Customer.FanarBuilder builder = new Customer.FanarBuilder();

        builder.setName("Seymur");
        builder.setSurname("Ahmadov");

        Customer f = builder.build();
        builder.setName("fgf");
        System.out.println(f.getName()+" " + f.getSurname());
        //Builder Pattern


        //Singleton Pattern
        //Fanar fanar= new Fanar("sss");


        // set yoxdu immutable


    }
}
