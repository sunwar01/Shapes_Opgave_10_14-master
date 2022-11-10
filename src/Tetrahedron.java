public class Tetrahedron extends Shape3D{


    private final double TetrahedronLength;


    public Tetrahedron(double setTetrahedronLength) {

        this.TetrahedronLength = setTetrahedronLength;
    }




    @Override
    double getArea() {
        return (Math.sqrt(3)*(TetrahedronLength*TetrahedronLength));

    }

    @Override
    double getVolume() {
        return Math.pow(TetrahedronLength,3)/(6*(Math.sqrt(2)));
    }
}
