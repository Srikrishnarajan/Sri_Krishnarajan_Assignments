class Rectangle {
    constructor(height, width) {
        this.height = height;
        this.width = width;
    }
    get getHeight(){
        return this.height;
    }
    get getWidth(){
        return this.width;
    }
}

var rectangle = new Rectangle(4, 5);
document.write("Rectangle Dimensions<br><br>Height: "+rectangle.getHeight);
document.write("<br>Width: "+rectangle.getWidth);

Rectangle.prototype.getArea = function() {
    return this.height * this.width
};

Rectangle.prototype.height = 50;
document.write("<br><br>Rectangle Area: " +rectangle.getArea());