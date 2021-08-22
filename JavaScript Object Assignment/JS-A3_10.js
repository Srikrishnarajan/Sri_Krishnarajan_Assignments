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
        return this.married;
    }
    get getdateOfBirth(){
        return this.dateOfBirth;
    }
    get getprofession(){
        return this.profession;
    }
}
var amithab = new Person("amithab","bachan",22,["C"],"24/10/1996",{city:"Hyderabad",pincode:"521185"},false,"sr. analyst");
var abhishek = new Person("abhishek",amithab.getlname,21,"HTML","08/06/1997",amithab.getaddress,false,"jr. analyst");
var Aaradhya = new Person("Aaradhya",amithab.getlname,amithab.age,"Java","21/10/1997",amithab.getaddress,abhishek.getmarried,abhishek.getprofession);

print = function(){
    console.log(amithab);
    console.log(abhishek);
    console.log(Aaradhya);
}();