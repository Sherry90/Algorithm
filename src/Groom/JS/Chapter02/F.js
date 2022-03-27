const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const n = Number(input[0])

let xarray = []
let yarray = []

let dx = 0
let dy = 0
let distance = 0

let min = Number.MAX_SAFE_INTEGER;
let count = 0;

for(let i = 1 ; i < n+1 ; i++){
    xarray.push(input[i].split(" ")[0])
    yarray.push(input[i].split(" ")[1])
}

for(let i = 0 ; i < n ; i++){
    for(let j = 0 ; j < i ; j++){
        dx = Math.abs(xarray[j] - xarray[i])
        dy = Math.abs(yarray[j] - yarray[i])

        distance = Math.sqrt(dx*dx + dy*dy).toFixed(1);

        if(min > distance){
            min = distance;
            count = 1;
        } else if(min === distance) {
            count++
        }
    }
}

console.log(min);
console.log(count);
