const solution = (numbers, hand) => {
    let answer = '';

    let leftPosition = '*';
    let rightPosition = '#';

    let leftDistance = 0;
    let rightDistance = 0;

    for(let i = 0 ; i < numbers.length ; i++)
    {
        if(numbers[i] === 1 || numbers[i] === 4 || numbers[i] === 7)
        {
            answer += 'L';
            leftPosition = numbers[i];
        }
        else if(numbers[i] === 3 || numbers[i] === 6 || numbers[i] === 9)
        {
            answer += 'R';
            rightPosition = numbers[i];
        }
        else
        {
            if(numbers[i] === 2)
            {
                if(leftPosition == 1 || leftPosition == 5){
                    leftDistance = 1;
                }
                else if(leftPosition == 4 || leftPosition == 8){
                    leftDistance = 2;
                }
                else if(leftPosition == 7 || leftPosition == 0){
                    leftDistance = 3;
                }
                else if(leftPosition == '*'){
                    leftDistance = 4;
                }

                if(rightPosition == 3 || rightPosition == 5){
                    rightDistance = 1;
                }
                else if(rightPosition == 6 || rightPosition == 8 ){
                    rightDistance = 2;
                }
                else if(rightPosition == 9 || rightPosition == 0 ){
                    rightDistance = 3;
                }
                else if(rightPosition == '#'){
                    rightDistance = 4;
                }

            }
            else if(numbers[i] === 5)
            {
                if(leftPosition == 2 || leftPosition == 4 || leftPosition == 8){
                    leftDistance = 1;
                }
                else if(leftPosition == 1 || leftPosition == 7 || leftPosition == 0){
                    leftDistance = 2;
                }
                else if(leftPosition == '*'){
                    leftDistance = 3;
                }

                if(rightPosition == 2 || rightPosition == 6 || rightPosition ==8){
                    rightDistance = 1;
                }
                else if(rightPosition == 3 || rightPosition == 9 || rightPosition == 0){
                    rightDistance = 2;
                }
                else if(rightPosition == '#'){
                    rightDistance = 3;
                }

            }
            else if(numbers[i] === 8)
            {
                if(leftPosition == 5 || leftPosition == 7 || leftPosition == 0){
                    leftDistance = 1;
                }
                else if(leftPosition == 2 || leftPosition == 4 || leftPosition == '*'){
                    leftDistance = 2;
                }
                else if(leftPosition == 1){
                    leftDistance = 3;
                }

                if(rightPosition == 5 || rightPosition == 9 || rightPosition == 0){
                    rightDistance = 1;
                }
                else if(rightPosition == 2 || rightPosition == 6 || rightPosition == '#'){
                    rightDistance = 2;
                }
                else if(rightPosition == 3){
                    rightDistance = 3;
                }
            }
            else if(numbers[i] == 0){
                if(leftPosition == 8 || leftPosition == '*'){
                    leftDistance = 1;
                }
                else if(leftPosition == 5 || leftPosition == 7){
                    leftDistance = 2;
                }
                else if(leftPosition == 2 || leftPosition == 4){
                    leftDistance = 3;
                }
                else if(leftPosition == 1){
                    leftDistance = 4;
                }

                if(rightPosition == 8 || rightPosition == '#'){
                    rightDistance = 1;
                }
                else if(rightPosition == 5 || rightPosition == 9){
                    rightDistance = 2;
                }
                else if(rightPosition == 2 || rightPosition == 6){
                    rightDistance = 3;
                }
                else if(rightPosition == 3){
                    rightDistance = 4;
                }

            }

            if(leftDistance < rightDistance){
                answer += 'L';
                leftPosition = numbers[i];
            }
            else if(leftDistance > rightDistance) {
                answer += 'R';
                rightPosition = numbers[i];
            }
            else {
                if(hand == 'left'){
                    answer += 'L';
                    leftPosition = numbers[i];
                }else {
                    answer += 'R';
                    rightPosition = numbers[i];
                }
            }

        }
    }

    return answer;
}