//5. a.
var add = (val=10) => val; 
console.log(add());
console.log(add(20));

//5. b.
function userFriends(username: string, ...friends: string[]){
    console.log("username: ",username);
    console.log("friends: ",friends);

    for(let i in friends){
        console.log(friends[i]);
    }
}

userFriends('Joseph Vijay','Saravanan Sivakumar','Vikram','Ajith Kumar','Dhanush','Karthi Sivakumar');

//5. c.
function printCapitalNames(...names: string[]){
    console.log(names);
    
    for(let i in names)
        console.log(names[i].toUpperCase());
}

let capitalNames = ['Joseph Vijay','Saravanan Sivakumar','Vikram','Ajith Kumar','Karthi Sivakumar'];
printCapitalNames(...capitalNames);