package ap;
public class circle implements ap{
 private double radius;
 public circle(double radius) {
 if (radius <= 0) {
 throw new IllegalArgumentException("Radius must be positive.");
 }
 this.radius = radius;
 }
 public double area() {
 return Math.PI * radius * radius;
 }
 public double perimeter() {
 return 2 * Math.PI * radius;
 }
} 
