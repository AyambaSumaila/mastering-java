
// Abstract class defining common properties and behaviors for shapes
abstract class Shape {
    // Encapsulated attribute representing the color of the shape
    private String color;

    // Constructor to initialize the color of the shape
    public Shape(String color) {
        this.color = color;
    }

    // Getter for the color attribute
    public String getColor() {
        return color;
    }

    // Abstract method to draw the shape (to be implemented by subclasses)
    public abstract void draw();

    // Abstract method to calculate the area (to be implemented by subclasses)
    public abstract double calculateArea();
}

// Interface defining the perimeter calculation behavior
interface PerimeterCalculable {
    // Abstract method to calculate the perimeter of the shape
    double calculatePerimeter();
}

// Circle class implementing Shape and PerimeterCalculable interface
class Circle extends Shape implements PerimeterCalculable {
    private double radius;

    // Constructor to initialize color and radius of the circle
    public Circle(String color, double radius) {
        super(color);  // Call the parent constructor to set the color
        this.radius = radius;
    }

    // Implementation of the draw method for Circle
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with color: " + getColor());
    }

    // Implementation of the calculateArea method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;  // Area of a circle: πr²
    }

    // Implementation of the calculatePerimeter method for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;  // Perimeter of a circle: 2πr
    }
}

// Rectangle class implementing Shape and PerimeterCalculable interface
class Rectangle extends Shape implements PerimeterCalculable {
    private double width, height;

    // Constructor to initialize color, width, and height of the rectangle
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Implementation of the draw method for Rectangle
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with color: " + getColor());
    }

    // Implementation of the calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return width * height;  // Area of a rectangle: width × height
    }

    // Implementation of the calculatePerimeter method for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);  // Perimeter of a rectangle: 2(width + height)
    }
}

// Triangle class implementing only Shape (does not implement PerimeterCalculable)
class Triangle extends Shape {
    private double base, height;

    // Constructor to initialize color, base, and height of the triangle
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    // Implementation of the draw method for Triangle
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with color: " + getColor());
    }

    // Implementation of the calculateArea method for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;  // Area of a triangle: 0.5 × base × height
    }
}

// Main class managing the shapes
public class ShapeDrawingSystem {
    public static void main(String[] args) {
        // Creating different shapes
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);
        Shape triangle = new Triangle("Green", 4.0, 5.0);

        // Drawing and calculating the area of each shape
        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.calculateArea());

            // If the shape supports perimeter calculation, calculate and display it
            if (shape instanceof PerimeterCalculable) {
                PerimeterCalculable perimeterShape = (PerimeterCalculable) shape;
                System.out.println("Perimeter: " + perimeterShape.calculatePerimeter());
            }
            System.out.println();
        }
    }
}



