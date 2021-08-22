class Person {
    constructor(fname, lname, age, skills, dateOfBirth, address, married, profession) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.skills = skills;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.married = married;
        this.profession = profession;
    }
    get getlname(){
        return this.lname;
    }
    get getfname(){
        return this.fname;
    }
    get getage(){
        return this.age ;
    }
    get getskills(){
        return this.skills;
    }
    get getaddress(){
        return this.address;
    }
    get getmarried(){
        return this.maegetmarried;
    }
    get getdateOfBirth(){
        return this.dateOfBirth;
    }
    get getprofession(){
        return this.profession;
    }
}
var person1 = new Person("nikhil","goud",22,["C"],"24/10/1996",{city:"Hyderabad",pincode:"521185"},false,"sr. analyst");
var person2 = new Person("harish","chinna",21,["HTML"],"08/06/1997",{city:"Ameerpet",pincode:"500038"},false,"jr. analyst");

print = function(){
    console.log(person1);
    console.log(person2);
}();