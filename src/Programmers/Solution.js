const solution = (n, lost, reserve) => {
    let answer = 0;
    let canWear = n - lost.length;
    let rentalSuccess = 0;

    for(let i = 0 ; i < reserve.length; i++){
        for(let j = 0; j < lost.length; j++){

            if(reserve[i]-1 === lost[j]){
                reserve.splice(i, 1);
                lost.splice(j, 1);
                rentalSuccess++
            }

            if(reserve[i]+1 === lost[j]){
                reserve.splice(i, 1);
                lost.splice(j, 1);
                rentalSuccess++
            }

            if(reserve[i] === lost[j]){
                reserve.splice(i, 1);
                lost.splice(j, 1);
                rentalSuccess++
            }


            if(lost.length == 0){
                break;
            }
        }
    }

    answer = canWear + rentalSuccess;

    if(answer  >= n){
        answer = n;
    }

    return answer;
}