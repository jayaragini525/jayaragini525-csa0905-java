import java.util.*;
class Cal {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }


    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double calculateVolume(double radius, double height, boolean isCone) {
        if (isCone) {
            return (1.0 / 3.0) * Math.PI * radius * radius * height;
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = s.nextDouble();
        double circleArea = calculateArea(radius);
        System.out.println("Area of Circle: " + circleArea);

        System.out.print("Enter the radius of the cylinder: ");
        double cylinderRadius = s.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double cylinderHeight = s.nextDouble();
        double cylinderVolume = calculateVolume(cylinderRadius, cylinderHeight);
        System.out.println("Volume of Cylinder: " + cylinderVolume);

        System.out.print("Enter the radius of the cone: ");
        double cR = s.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double cH = s.nextDouble();
        double cV = calculateVolume(cR, cH, true);
        if (cV != -1) {
            System.out.println("Volume of Cone: " + cV);
        } else {
            System.out.println("Invalid choice. This is not a cone.");
        }

      
    }
}
