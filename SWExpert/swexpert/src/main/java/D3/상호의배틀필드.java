//package problem;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class 상호의배틀필드 {
//    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//    static StringTokenizer st;
//    static StringBuilder sb=new StringBuilder();
//    public static void main(String[] args) throws IOException {
//        int T=Integer.parseInt(br.readLine());
//        for(int t=0;t<T;t++){
//            sb.append("#").append(t+1).append(" ").append(solution()).append("\n");
//        }
//        System.out.println(sb.toString());
//    }
//
//    private static String solution() throws IOException {
//        // 입력
//        st=new StringTokenizer(br.readLine());
//        int width=Integer.parseInt(st.nextToken());
//        int height=Integer.parseInt(st.nextToken());
//        String[][] map=new String[height][width];
//        for(int i=0;i<height;i++){
//            map[i]=br.readLine().split("");
//        }
//        int N=Integer.parseInt(st.nextToken());
//        String[] inputArr=br.readLine().split("");
//        // 입력 완료
//
//        Tank tank=new Tank(0,0,0,0);
//        // 탱크 위치 찾아서 탱그 생성
//        for(int i=0;i<height;i++){
//            for(int j=0;j<width;j++){
//                if(map[i][j].equals("^")||map[i][j].equals("v")||map[i][j].equals(">")||map[i][j].equals("<")){
//                    tank=new Tank(j,i,width,height);
//                }
//            }
//        }
//        for(int i=0;i<N;i++){
//            String move=inputArr[i];
//            switch(move){
//                case "U":
//                    tank.moveUp(map);
//            }
//        }
//
//        // 하
//        return null;
//    }
//    public static class Tank{
//        int x,y;
//        String dir;
//        int width, height;
//
//        public Tank(int x,int y, int width, int height){
//            this.x=x;
//            this.y=y;
//            this.width=width;
//            this.height=height;
//        }
//
//        public void moveUp(String[][] map) {
//
//        }
//    }
//}