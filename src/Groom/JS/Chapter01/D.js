const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const standard1 = input[0].split(" ")[1];
const standard2 = input[0].split(" ")[2];

console.log(input[1].split(" ").filter((x) => x === standard1 || x === standard2).length);
