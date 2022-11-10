public class Circle extends Shape2D{

    private final double circleDiameter;

    public Circle(double setDiameter) {

        this.circleDiameter = setDiameter;

    }

    @Override
    double getArea(){

        double radius = circleDiameter/2;

        return Math.PI * Math.pow(radius, 2);
    }

}
