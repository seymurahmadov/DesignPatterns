package BuilderPattern;

import ImMutable.Mercedes;

public class Customer {
    private String name;
    private String surname;
    private String fatherName;
    private Integer age;
    private Mercedes m = null;

    private Customer() {

    }

    public Customer(String name, String surname, String fatherName, Integer age, Mercedes m) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.age = age;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    } // setler olmaya biler

    public String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    private void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Integer getAge() {
        return age;
    }

    private void setAge(Integer age) {
        this.age = age;
    }


    public Mercedes getM() {
        return m;
    }

    private void setM(Mercedes m) {
        this.m = m;
    }

    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }

    //*************************************************************************************
    public static class CustomerBuilder {
        private Customer f = null;

        public CustomerBuilder() {
            f = new Customer();
        }

        public Customer build() {
            return new Customer(f.name, f.surname, f.fatherName, f.age, f.m);

//            Customer ff=f;
//            f=null;                        bu 3 setr basqa bir variantdi. Custoner builder ozunu qaytardigina gore olur
//            return ff;
        }


        public CustomerBuilder setName(String name) {
            this.f.setName(name);
            return this;
        }

        public CustomerBuilder setSurname(String surname) {
            this.f.setSurname(surname);
            return this;
        }

        public CustomerBuilder setAge(Integer age) {
            this.f.setAge(age);
            return this;
        }


        public CustomerBuilder setM(Mercedes m) {
            this.f.setM(m);
            return this;
        }

    }
}
