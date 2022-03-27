const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const arr = input[1].split(" ").map(Number).filter((x)=> x <= input[0].split(" ")[1]);
const sum = arr.reduce((acc,cur) => acc+cur,0);

console.log(arr.length, sum);
console.log(sum <= input[0].split(" ")[2] ? 'YES' : 'NO');
