function squareValue(num){
    return num*num;
}

function doubleValue(num){
    return num*2;
}

function compose(){
    return "The value of compose(square, double) is  "+squareValue(doubleValue(num))+"<br>The value of compose(double, square) is  "+doubleValue(squareValue(num));
}

var num = parseInt(prompt("Enter a number: "));
document.write(compose());