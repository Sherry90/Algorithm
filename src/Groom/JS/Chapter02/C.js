const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const set = new Set(input[1].split(" "));

console.log(Math.min(set.size, input[0]))