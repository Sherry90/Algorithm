const fs = require('fs');
const input = (()=>{
    const stdin = fs.readFileSync('/dev/stdin').toString().split('\n');
    let ln=0;
    return ()=>stdin[ln++];
})();

const n = Number(input());

const data = []

for(let i = 0 ; i < n ; i++){
    data[i] = Number(input());
}

data.sort()

const indexArray = Array(10000).fill(0)

for(let i = 0 ; i < n ; i++){
    indexArray[data[i]] += 1;
}

const max = Math.max(...indexArray);

let num = String(indexArray.findIndex((x)=> x === max))

while(num.length < 4){
    num = ["0"].concat(num.split("")).join("")
}

console.log(num)