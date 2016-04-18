package ClaseAbstractaShape;

public class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }
    
    public double getPerimeter() {
        return 2*height+2*width;
    }
}
