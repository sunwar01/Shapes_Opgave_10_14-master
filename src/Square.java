public class Square extends Shape2D{

    private final double squareLength;

    public Square(double setSquareLength) {

        this.squareLength = setSquareLength;
    }

    @Override
    double getArea(){
        return squareLength*squareLength;
    }

}
