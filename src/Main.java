import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        ///////////////////////////2D/////////////////////////////////

        Circle circle1 = new Circle(15);
        Square square1 = new Square(10);
        Triangle triangle1 = new Triangle(10, 10);



        ///////////////////////////3D/////////////////////////////////

        Cube cube1 = new Cube(5);
        Sphere sphere1 = new Sphere(10);
        Tetrahedron tetrahedron1 = new Tetrahedron(10);




       ///////////////////////////Print/////////////////////////////////

        Shape[] shapes = {circle1, square1, triangle1, cube1, sphere1, tetrahedron1};

        for (Shape shape: shapes) {

            System.out.println(shape.getClass());
            System.out.println("area: " + shape.getArea());

           if(shape instanceof Shape3D)
           {
               System.out.println("volume: " + ((Shape3D) shape).getVolume());
           }

            System.out.println();



        /*if (shape.getClass() == Square.class) {
            System.out.println("Square Area: " + ((Square) shape).getArea());
        }
        else if (shape.getClass() == Circle.class) {
            System.out.println("Circle Area: " + ((Circle) shape).getArea());
        }
        else if (shape.getClass() == Triangle.class) {
            System.out.println("Triangle Area: " + ((Triangle) shape).getArea());
        }
        else if (shape.getClass() == Cube.class) {
            System.out.println("Cube Area: " + ((Cube) shape).getArea());
            System.out.println("Cube Volume: " + ((Cube) shape).getVolume());
        }
        else if (shape.getClass() == Sphere.class) {
            System.out.println("Sphere Area: " + ((Sphere) shape).getArea());
            System.out.println("Sphere Volume: " + ((Sphere) shape).getVolume());
        }
        else if (shape.getClass() == Tetrahedron.class) {
            System.out.println("Tetrahedron Area: " + ((Tetrahedron) shape).getArea());
            System.out.println("Tetrahedron Volume: " + ((Tetrahedron) shape).getVolume());
        }*/






        }



    }
}