public class Sphere extends Shape3D {

    private final double sphereDiameter;


    public Sphere(double setSphereDiameter) {

        this.sphereDiameter = setSphereDiameter;
    }


    @Override
    double getArea() {
        return 4*Math.PI*Math.pow(sphereDiameter/2,2);
    }

    @Override
    double getVolume() {
        double radius = sphereDiameter/2;
        return (4.0/3.0)*Math.PI * Math.pow(radius,3);
    }
}
