function solution(s) {
    let answer = false;

    if(!Number(s) || (s.length != 4 || s.length != 6)){
        answer = false;
    } else if(Number(s) && (s.length == 4 || s.length == 6)) {
        answer = true;
    }

    return answer;
}