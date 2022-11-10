public class Triangle extends Shape2D {

    private final double triangleLength;
    private final double triangleHeight;

    public Triangle(double setTriangleLength, double setTriangleHeight) {

        this.triangleLength = setTriangleLength;
        this.triangleHeight = setTriangleHeight;
    }

    @Override
    double getArea(){
        return (triangleLength * triangleHeight) / 2;
    }

}
