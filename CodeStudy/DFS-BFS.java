import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main{
  static int[][] map;
  static boolean[] visit;
  static int n,m,v;

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt(); //node
    m = sc.nextInt(); //line
    v = sc.nextInt(); //start

    map = new int int[n+1][n+1]; //인접 행렬
    visit = new boolean[n+1];

    int num1, num2;

    for(int i=1; i<=m; i++{
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      map[num1][num2] = map[map2][map1] = 1;
    }

    dfs(v);
    RestVisit();
    bfs(v);

  }

  public static void dfs(int d){
    visit[d] = true; //visited check

    for(int i=1; i<n+1; i++){
      if(map[d][i] == 1 && !visit[i]){
        dfs(i);
      }
    }
  }

  public static void bfs(int b){
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(b);
    visit[b] = true;

    while(!queue.isEmpty()){
      b = queue.poll();

      for(int i=1; i<n+1; i++){
        if(int i=1; i<n+1; i++){
          if(map[b][i] == 1 && !visit[i]){
            queue.offer(i);
            visit[i] = true;
          }
        }
      }
    }
  }
}
