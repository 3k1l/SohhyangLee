class Solution {
    static int cnt;
    static boolean[] visit;
    static int computer;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        computer = n;
        cnt = 0;
        visit = new boolean[n+1];

        dfs(0, computers);

        return cnt;
    }

    public void dfs(int start, int[][] map){
        visit[start] = true;
        for(int i=0; i<computer; i++){
            if(map[start][i] == 1 && !visit[i]){
                System.out.println("start : "+ start + " i :" + i);
                dfs(i, map);
                cnt++; //간선의 수를 구해버린 것
            }
        }
    }
}
