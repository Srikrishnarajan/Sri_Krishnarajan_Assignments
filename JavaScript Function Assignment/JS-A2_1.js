function squareValue(num){
    return num*num;
}

function doubleValue(num){
    return num*2;
}

function composedValue(f1, f2, val){
    var doubledVal = f2(val);
    var squaredVal = f1(doubledVal);

    return squaredVal;
}

var n = parseInt(prompt("Enter a number: "));
document.write(composedValue(squareValue, doubleValue, n));