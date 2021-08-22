var fullName = '({"firstName": "Sri Krishnarajan", "lastName": "Kumar"})';
var realObject = eval(fullName);
document.getElementById("eval-function").innerHTML = realObject.firstName+" "+realObject.lastName;