package Programmers;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totalPrice = 0;

        for (int i = 1 ; i <= count ; i ++){
            totalPrice += (long)price * (long)i;
        }

        answer = totalPrice - money;

        if(money >= totalPrice){
            answer = 0;
        }

        return answer;
    }
}