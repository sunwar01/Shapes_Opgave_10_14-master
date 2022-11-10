public class Cube extends Shape3D{

    private final double cubeLength;

    public Cube(double setCubeLength) {

        this.cubeLength = setCubeLength;
    }

    @Override
    double getArea() {
        return cubeLength*cubeLength*6;
    }

    @Override
    double getVolume() {
        return Math.pow(cubeLength,3);
        // return cubeLength*cubeLength*cubeLength;
    }
}
