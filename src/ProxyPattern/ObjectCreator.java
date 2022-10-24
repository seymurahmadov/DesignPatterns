package ProxyPattern;

public class ObjectCreator {
    public static Image createObject(Class clazz){
        if (clazz==RealImage.class){
            return new ProxyImage();
        }
        return null;
    }
}
