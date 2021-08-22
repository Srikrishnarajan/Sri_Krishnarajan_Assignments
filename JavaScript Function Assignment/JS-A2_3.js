function isEven(n){

    if(n%2==0){
        return true;
    }

    else{
        return false;
    }

}

function find(arr, fun){
    
    for(i=0;i<arr.length;i++){
        if(fun(arr[i])==true){
            return arr[i];
        }
    }

}

let inputArray = [1,3,5,4,2];
document.write(find(inputArray, isEven));