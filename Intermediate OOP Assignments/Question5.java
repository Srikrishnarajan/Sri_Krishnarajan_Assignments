//Program to print shapes
package co.skr;

abstract class Shape {
    abstract public String draw();
}

class Rectangle extends Shape {
    @Override public String draw() {
    	return "Rectangle";
    }
}

class Line extends Shape {
    @Override public String draw() {
    	return "Line";
    }
}

class Cube extends Shape {
    @Override public String draw() {
    	return "Cube";
	}
}

public class Question5 {

	public static void main(String[] args) {
		Shape c = new Cube();
    	Shape l = new Line();
    	Shape r = new Rectangle();
    	
    	System.out.println(c.draw());
    	System.out.println(l.draw());
    	System.out.println(r.draw());
	}

}
