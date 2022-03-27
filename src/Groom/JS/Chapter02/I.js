const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const arr = input[1].split(" ").sort((x,y) => x-y).map((x) => Number(x))
const diff = arr[1] - arr[0];

const isSequence = (arr) => {
    for(let i = 1; i < arr.length; i++){
        if(arr[i] - arr[i-1] != diff){
            return false
        }
    }
    return true
}

console.log(isSequence(arr) ? "YES":"NO");