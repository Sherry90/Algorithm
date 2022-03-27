const fs = require('fs');
const input = (()=>{
    const stdin = fs.readFileSync('/dev/stdin').toString().split('\n');
    let ln=0;
    return ()=>stdin[ln++];
})();

const [s1,s2] = input().split(" ")

const compare = (s1,s2) => {
    for(let i = 0 ; i < Math.min(s1.length, s2.length) ; i++){
        if(s1[i] != s2[i]) return s1[i] - s2[i]
    }
    return s1.length - s2.length
}

const equals = (s1,s2) => {
    if(s1.length != s2.length){
        return false;
    }
    for(let i = 0; i < s1.length ; i++){
        if(s1[i] != s2[i]){
            return false;
        }
    }
    return true;
}

console.log(compare(s1,s2))
console.log(equals(s1,s2))
