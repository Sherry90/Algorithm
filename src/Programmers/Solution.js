function solution(n) {
    let answer = "";

    n = n
        .toString()
        .split("")
        .map((str) => Number(str))
        .sort(function(a, b)  {
            return b - a;
        });

    for(let i = 0 ; i < n.length; i++){
        answer += String(n[i]);
    }

    answer = Number(answer);


    return answer;
}