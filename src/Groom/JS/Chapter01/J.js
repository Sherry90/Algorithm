const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const arr = Array(Number(input[0]+1)).fill(0).map((x,i,arr) => i);

let answer = 0;

for(let i = 1 ; i <= input[0]; i++){
    answer += (1+arr[i])*(arr[i]/2);
}

console.log(answer)
