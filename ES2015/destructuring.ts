//7. a.
let inputArray = [2, 4, 8, 16, 32];
let [a0, a1, a2, a3, a4] = inputArray;
console.log("Array element at position 3 (inputArray[2]): ",a2);

//7. b.
var organization = {
    orgName: "Capgemini",
    address: {country: "India", city: "Bangalore", pincode: 560066}
}

let {orgName, address: addr} = organization;
console.log("Pincode: ",addr.pincode);