function isEven(n){
    return (n%2==0);
}

function find(arr, isEven){
    var i = 0, j = 1;

    if(isEven(arr[i])){
        document.write(arr[i]);
    }

    else{
        find(arr.slice(j, 5), isEven);
        j++;
    }

}

var inputArray = [1, 3, 5, 4, 2];
find(inputArray, isEven);