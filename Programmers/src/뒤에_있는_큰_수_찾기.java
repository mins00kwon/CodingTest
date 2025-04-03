import java.util.Arrays;

public class 뒤에_있는_큰_수_찾기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{9, 1, 5, 3, 6, 2})));
    }
    public static int[] solution(int[] numbers) {
        boolean foundBig;
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            foundBig=false;
            int cur=numbers[i];                     /* 설명: 숫자 하나 잡고 돌리기 시작*/
            for(int j=i+1;j<numbers.length;j++){    /* 설명: 뒤 숫자부터 하나씩 탐색 시작*/
                if(cur<numbers[j]){                 /* 설명: 자신보다 큰 숫자 찾으면*/
                    answer[i]=numbers[j];           /* 설명: 정답 기록*/
                    foundBig=true;                  /* 설명: 자신보다 큰 숫자 찾았다는 기록 남김*/
                    break;
                }                                   /* 설명: 탐색 종료*/
            }
            if(!foundBig){
                answer[i]=-1;
            }
        }
        return answer;
    }
}
