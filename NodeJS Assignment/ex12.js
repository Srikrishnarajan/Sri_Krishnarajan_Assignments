const date = require('date-and-time')
  
const currentDateTime  =  new Date();
  
const outputDateTime = date.format(currentDateTime,'DD/MM/YYYY HH:mm:ss');
  
console.log("Current Date and Time: "+outputDateTime);