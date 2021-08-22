function squares(n){
    return n*n;
}

function squareRoots(n){
    return (Math.sqrt(n));
}

function mapSquares(arr1, squareValues){

    if(j < inputArray1.length){
        var result = squareValues(arr1[i]);
        newArray[j] = result;
        j++;
        mapSquares(inputArray1.slice(j, 5), squareValues);
    }

    else if(j == inputArray1.length){
        document.write(newArray+"<br>");
        j = 0;
    }

}

function mapSquareRoots(arr2, squareRootValues){

    if(j < inputArray2.length){
        var result = squareRootValues(arr2[i]);
        newArray[j] = result;
        j++;
        mapSquareRoots(inputArray2.slice(j, 5), squareRootValues);
    }

    else if(j == inputArray2.length){
        document.write(newArray+"<br>");
        j = 0;
    }

}

var inputArray1 = [1, 2, 3, 4, 5];
var inputArray2 = [1, 4, 9, 16, 25];
var newArray = new Array(5);
var i = 0, j = 0;

mapSquares(inputArray1, squares);
mapSquareRoots(inputArray2, squareRoots);