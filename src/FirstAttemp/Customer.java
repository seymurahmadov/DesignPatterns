package FirstAttemp;

public class Customer {

    // Builder Pattern
    private String name;
    private String surname;

    private Customer(){

    }
    private Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {

        return name;
    }



    public String getSurname() {
        return surname;
    }



    public static FanarBuilder builder(){
        return new FanarBuilder();
    }



    public static class FanarBuilder {
        private Customer f = null;

        public FanarBuilder() {
            f = new Customer();

        }

        public Customer build() {
            return new Customer(f.name, f.surname);
        }

        public FanarBuilder setName(String name) {
            this.f.name = name;
            return this;
        }

        public FanarBuilder setSurname(String surname) {
            this.f.surname = surname;
            return this;
        }


    }
}
