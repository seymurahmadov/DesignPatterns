package SingletonPattern;

public class PersonalSingleton {


    private PersonalSingleton(){
        // hec kim bunun obyektin yaratmamasi ucun konstruktoru private edirik
    }

    private static PersonalSingleton f = null;  // birinciden f e null veririk

    public static PersonalSingleton instance(){
        if (f==null){
            f=new PersonalSingleton();
        }
        return f;
    }
}
