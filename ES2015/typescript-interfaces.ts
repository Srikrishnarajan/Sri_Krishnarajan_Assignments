interface Printable{
    print():any;
}

let circle: Printable = {
    print(){
        return "Circle Object implementing Printable Interface...";
    }
}
let employee: Printable = {
    print(){
        return "Employee Object implementing Printable Interface...";
    }
}

function printAll(...objectsArray: Array<any>){

    for(let i in objectsArray){
        console.log(objectsArray[i].print());
    }

}

printAll(circle, employee);
