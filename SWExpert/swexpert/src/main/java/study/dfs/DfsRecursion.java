package study.dfs;

public class DfsRecursion {

    // 방문처리에 사용할 배열 선언
    static boolean[] visited=new boolean[9];

    // 그림에서 그래프의 연결상태를 2차원 배열로 표현
    // 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    public static void main(String[] args) {
        dfs(1);
    }

    static void dfs(int nodeIndex){
        // 방문 처리
        visited[nodeIndex]=true;

        // 방문 노드 출력
        System.out.print(nodeIndex + " -> ");

        // 방문한 노드에 인접한 노드 찾기
        for(int node:graph[nodeIndex]){
            if(!visited[node]){
                dfs(node);
            }
        }
    }
}
