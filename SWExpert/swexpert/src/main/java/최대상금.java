//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class 최대상금 {
//    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//    static StringBuilder sb=new StringBuilder();
//    static StringTokenizer st;
//
//    public static void main(String[] args) throws IOException {
//        int numTestcases= Integer.parseInt(br.readLine());
//        for (int i = 0; i < numTestcases; i++) {
//            sb.append("#").append(i+1).append(" ").append(solution()).append("\n");
//        }
//        System.out.println(sb.toString());
//    }
//
//    private static int solution() throws IOException {
//        st=new StringTokenizer(br.readLine());
//        String numbers=st.nextToken();
//        int change=Integer.parseInt(st.nextToken());
//        int[] arr=new int[numbers.length()];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=Integer.parseInt(numbers.charAt(i)+"");
//        }
//
//        int[] sorted=new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            sorted[i]=arr[i];
//        }
//        Arrays.sort(sorted);
//
//        int index=arr.length-1;
//        int length=sorted.length;
//        while (change>0) {
//            int bigIndex=searchBackward(arr,sorted[index]);     // 현재 바꿔야 하는 숫자의 인덱스 위치를 찾음
//            if(bigIndex==)
//            int changeNum=arr[length-index];                            // 바꿔야 할 자리의 수 저장
//            arr[length-index]=arr[bigIndex];                        // 찾은 큰 수를 위치로 이동
//            arr[bigIndex]=changeNum;                                // 저장해둔 수를 큰 수의 위치로 이동
//            change--;
//            index--;
//            if(index)
//        }
//        return 0;
//    }
//
//    private static int searchBackward(int[] arr, int num) {
//        for(int i=arr.length-1;i>=0;i--){
//            if(arr[i]==num){
//                return i;
//            }
//        }
//        return -1;
//    }
//}
