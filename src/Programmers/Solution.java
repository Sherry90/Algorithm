package Programmers;

class Solution {
    public static long solution(int a, int b) {
        long answer = 0;

        int min = 0;
        int max = 0;

        if(a == b){
            answer = (long)a;
        } else {
            if(a > b){
                max = a;
                min = b;
            } else if (a < b){
                max = b;
                min = a;
            }

            for (int i = min; i <= max; i++) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        long result = solution(a, b);
        System.out.println(result);
    }
}