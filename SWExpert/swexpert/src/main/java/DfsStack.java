import java.util.Stack;

public class DfsStack {


    // 방문처리에 사용할 배열 선언
    static boolean[] visited=new boolean[9];

    // 그림에서 그래프의 연결상태를 2차원 배열로 표현
    // 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    // DFS에 사용할 스택
    static Stack<Integer> stack=new Stack<>();

    public static void main(String[] args) {
        dfs(1);
    }

    static void dfs(int nodeIndex){
        // 시작 노드를 스택에 넣어줌
        stack.push(nodeIndex);
        // 시작 노드 방문처리
        visited[nodeIndex]=true;

        // 스택이 비어있지 않으면 반복
        while(!stack.isEmpty()){
            int currentNode=stack.pop();

            // 방문 노드 출력
            System.out.print(currentNode+" -> ");

            // 꺼낸 노드와 인접한 노드 찾기
            for(int i=0;i<graph[currentNode].length;i++){
                if(!visited[graph[currentNode][i]]){
                    stack.push(graph[currentNode][i]);
                    visited[graph[currentNode][i]]=true;
                }
            }
        }
    }
}
