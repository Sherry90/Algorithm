const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const n = Number(input[0].split(" ")[0])
const k = Number(input[0].split(" ")[1])
const data = input[1].split(" ").map(Number);

let sum = 0;

for(let i = 0 ; i < k ; i++){
    sum += data[i];
}

if(!(sum&1)) return console.log("YES")

for(let i = 1 ; i + k -1 < n ;i++){
    sum = sum - data[i-1] + data[i+k-1]
    if(!(sum&1)) return console.log("YES")
}

console.log("NO")
// 슬라이딩 윈도우 기법