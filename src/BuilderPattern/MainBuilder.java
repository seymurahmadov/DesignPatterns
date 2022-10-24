package BuilderPattern;

public class MainBuilder {
    public static void main(String[] args) {

        Customer.CustomerBuilder builder = Customer.builder()
                .setName("Vusal")
                .setSurname("Ahmadov")       // bele de yazmaq olar. cunku
                .setAge(20);

//        builder.setName("Seymur");
//        builder.setSurname("Ahmadov");
//        builder.setAge(23);

        Customer f = builder.build();

        builder.setName("Vusal"); // olmur
        builder.setSurname("dfdfd");




        System.out.println(f.getName());
        System.out.println(f.getSurname());
        System.out.println(f.getAge());


    }
}
