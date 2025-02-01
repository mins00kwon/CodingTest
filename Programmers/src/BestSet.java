/* 설명:
*   사전 지식을 활용했다
*   언젠가 이런 내용을 들었던 기억이 있다
*   "합해서 같은 수가 되는 두 값의 곱의 최대값은 두 수의 값이 가장 가까울 때 발생한다
*   이 내용을 기억하고 문제 풀이에 적용한게 기쁘기도 하지만
*   다른 사람들은 문제를 어떤 식으로 풀었는지 궁금하니 천천히 살펴보자*/




public class BestSet {
    public static void main(String[] args) {
        int[] result = solution(6, 728);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int n, int s) {
        if (n > s)
            return new int[]{-1};
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            result[i] = (s - sum) / (n - i);
            sum += result[i];
        }
        return result;
    }
}