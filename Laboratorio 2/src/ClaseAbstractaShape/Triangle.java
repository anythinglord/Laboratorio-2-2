package ClaseAbstractaShape;

public class Triangle extends Shape{
    public double width;
    public double height;

    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width*height)/2;
    }

    @Override
    public double getPerimeter() {
        return width+height+Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
    }    
}
