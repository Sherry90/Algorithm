function solution(arr) {
    let answer = [];

    let min = arr[0];

    let minIndex = 0;

    if(arr.length === 1){
        arr[0] = -1;
    } else {
        for (let i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }

        arr.splice(minIndex, 1);
    }

    return arr;
}