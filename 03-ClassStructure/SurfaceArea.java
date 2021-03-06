
/**
8.	Define a class SurfaceArea that contains static methods to calculate the surface area for:
circle, rectangle and triangle.
Validate the created methods. 

11.	Using the class to calculate the area of geometric figures, write a program that creates the calculation and displays:
a.	area of a rectangle with sides 4 and 5
b.	area of a circle with a radius of 3
c.	area of a triangle with base 3 and height 4

 */
public class SurfaceArea
{
    public static float circleArea(float radius) {
        float pi = 3.14f;
        return pi*radius*radius;
    }
    
     public static float rectangleArea(float a, float b) {
        return a*b;
    }
    
     public static float triangleArea(float h, float a) {
        return 0.5f*a*h;
    }
    
    public static void main(String[] args){
        System.out.println("Area of circle with a radius of 3 is " + SurfaceArea.circleArea(5));
        System.out.println("Area of rectangle with sides 4 and 5 is " + SurfaceArea.rectangleArea(4,5));
        System.out.println("Area of triangle with base 3 and height 4 is " + SurfaceArea.triangleArea(4,3));
        
        
    }
}
