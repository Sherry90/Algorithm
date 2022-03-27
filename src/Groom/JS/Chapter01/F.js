const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

console.log(input[1].split(" ").findIndex((x) => x === input[0].split(" ")[1]));