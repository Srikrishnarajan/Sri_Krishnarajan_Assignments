class Rectangle{

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
var rectangle = new Rectangle(7, 6);
document.write("Rectangle<br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);

rectangle = new Rectangle(76, 64);
document.write("<br><hr>Rectangle properties at Instance 1:<br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);

rectangle = new Rectangle(5, 4);
document.write("<br><hr>Rectangle properties at Instance 2:<br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);

rectangle = new Rectangle(75, 63);
document.write("<br><hr>Rectangle properties at Instance 3:<br>Length: "+rectangle.getLength);
document.write("<br>Breadth: "+rectangle.getBreadth);