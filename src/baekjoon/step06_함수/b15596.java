package baekjoon.step06_함수;

class Test {

    long sum(int[] a) {
        long answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i];
        }

        return answer;
    }
}
