package typeinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by wwh on 16-3-21.
 */
abstract class Shape {
    Shape(String s){
        name = s;
    }
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
    public String name;
}

class Rhomboid extends Shape {
    Rhomboid(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Rhomboid";
    }
    public void pt() {
        System.out.println(name);
    }
}

class Circle extends Shape {
    Circle(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    Square(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    Triangle(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Triangle";
    }
}

public class Shapes {
    public static Shapes Sh = new Shapes();
    public void rotate(Shape s) {
        if (s instanceof Circle) {
            System.out.println("is circle not rotate");
        }else {
            System.out.println(s + " rotate");
        }
    }
    public static void main(String []args) {
        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(new Circle("circle"));
        shapeList.add(new Triangle("triangle"));
        shapeList.add(new Square("square"));
        for(Shape shape : shapeList) {
            //shape.draw();
            Sh.rotate(shape);
        }

    }
}


