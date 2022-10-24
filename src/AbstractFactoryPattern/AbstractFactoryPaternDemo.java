package AbstractFactoryPattern;

public class AbstractFactoryPaternDemo {
    public static void main(String[] args) {
        //get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("SQUARE");

        // call draw method of Shape Circle
        shape1.draw();

        //*******************************************************************

        //get Color Factory
       AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        //get an object of Color Green
       Color color1 = colorFactory.getColor("GREEN");

        // call fill method of Color Green
        color1.fill();




    }
}
