const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');
console.log( input[1].split(" ").map(Number).reduce((acc,cur) => acc+cur,0) );