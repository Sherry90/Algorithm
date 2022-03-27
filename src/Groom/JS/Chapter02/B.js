const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const sorted = input[1].split(" ").sort((x,y) => x-y).join(" ")

console.log(input[1] === sorted ? "YES" : "NO")
