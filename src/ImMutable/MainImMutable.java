package ImMutable;

public class MainImMutable {
    public static void main(String[] args) {
        Mercedes m = new Mercedes();
        m.name="test";
    CustomerImMutable customerImMutable = new CustomerImMutable("SssS",m);
    customerImMutable.getM().name="gfgf";

    m.name="armud";

        System.out.println(customerImMutable.getName());
        System.out.println(customerImMutable.getM().name);


    }
}
