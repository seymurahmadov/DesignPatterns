package FirstAttemp;

public class Personal {
    private String name;

    public Personal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Personal(){

    }

    private static Personal f = null;

    public static Personal instance(){
        if (f==null){
            f=new Personal();
        }
        return f;
    }

    public boolean check(){

        return true;
    }
}
