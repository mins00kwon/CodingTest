//package problem;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Stack;
//import java.util.StringTokenizer;
//
//public class 비밀번호 {
//    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//    public static void main(String[] args) throws IOException {
//
//        StringBuilder sb=new StringBuilder();
//
//        for(int i=1;i<=10;i++){
//            sb.append("#").append(i).append(" ").append(solution()).append("\n");
//        }
//        System.out.println(sb.toString());
//    }
//
//    private static String solution() throws IOException {
//        StringTokenizer st=new StringTokenizer(br.readLine());
//        // 문자열 길이 및 문자열 입력
//        int n=Integer.parseInt(st.nextToken());
//        String line=st.nextToken();
//        String[] arr=line.split("");
//        Stack<String> stack=new Stack<>();
//        for(int i=0;i<n;i++){
//            if(stack.isEmpty()){
//                stack.push(arr[i]);
//            }
//            else{
//                if(stack.peek().equals(arr[i])){
//                    stack.pop();
//                }else {
//                    stack.push(arr[i]);
//                }
//            }
//        }
//
//
//        return String.join("",stack);
//    }
//}