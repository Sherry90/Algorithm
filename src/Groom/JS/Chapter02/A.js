const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const index = input[2].split(" ").lastIndexOf(input[3])

console.log(index === -1 ? index : input[1].split(" ")[index])