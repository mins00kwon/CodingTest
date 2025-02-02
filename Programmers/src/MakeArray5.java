import java.util.Arrays;

public class MakeArray5 {
    public static void main(String[] args) {
        System.out.println("Arrays.toString(solution(new int[]{\"0123456789\",\"9876543210\",\"9999999999999\"}),50000,5,5) = " +
                Arrays.toString(solution(new String[]{"0123456789","9876543210","9999999999999"},50000,5,5)));
    }
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        StringBuilder sb=new StringBuilder();
        // intStrs 의 각 원소마다
        for(int i=0;i<intStrs.length;i++){
            // s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내서 정수로 변환
            int temp=Integer.parseInt(intStrs[i].substring(s,s+l));
            // k값보다 크면 answer에 담음
            if(temp>k){
                sb.append(temp+" ");
            }
        }
        String[] stringAnswer=sb.toString().split(" ");
        int[] answer=new int[stringAnswer.length];
        for(int i=0;i<stringAnswer.length;i++){
            answer[i]=Integer.parseInt(stringAnswer[i]);
        }
        return answer;
    }
}
