const bio = '{"firstName": "Dhoni", "age": 40, "city": "Ranchi"}';
const bioObject = JSON.parse(bio);
document.getElementById("json-parse").innerHTML = bioObject.firstName+" "+bioObject.age;