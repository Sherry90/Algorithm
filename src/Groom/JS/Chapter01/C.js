const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');
console.log(Math.max(...input[1].split(" ")) );