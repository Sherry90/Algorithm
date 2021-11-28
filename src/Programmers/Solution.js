

const solution = (a, b) => a === b ? a : [...Array(Math.max(a,b) - Math.min(a,b)+1)].fill(0).reduce((arr,_,index) => Math.min(a,b)+arr+index,0);


console.log(solution(3, 5));
