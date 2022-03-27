const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const arr = input[1].split(" ").map(Number); // 두 번째 라인의 입력받은 숫자들을 숫자 배열로 저장

const sum = arr.reduce((acc,cur) => acc + cur,0); // 총합
const diff = arr.map((x) => Math.abs(sum - x * input[0])); // 절대값(총합 - 요소 * 요소의 총 갯수) 차이 배열
const min = Math.min(...diff);
const index = diff.findIndex((x) => x === min); // 차이가 가장 작은 수의 index를 반환

console.log(index+1, arr[index])