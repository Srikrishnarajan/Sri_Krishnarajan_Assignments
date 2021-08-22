class Rectangle {
    constructor(length, breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    get getLength(){
        return this.length;
    }
    get getBreadth(){
        return this.breadth;
    }
}
var rectangle = new Rectangle(76, 64);
document.write("Rectangle Dimensions<br><br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);

Rectangle.prototype.getArea = function() {
    return this.length * this.breadth
};