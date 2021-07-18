package Programmers;

class Solution {

    public static String solution(String s) {
        String answer = "";

        int length = s.length();
        int middle = 0;

        if(length % 2 != 0){
            middle = length/2;
            answer = s.substring(middle,middle);
        }

        System.out.println(answer);


        return answer;
    }

    public static void main(String[] args) {
        solution("abcde");
    }
}