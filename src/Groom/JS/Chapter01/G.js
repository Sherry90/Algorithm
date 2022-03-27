const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

input.shift();

console.log(input.findIndex((x) => x === "AJOU")+1, input.lastIndexOf("AJOU")+1);
