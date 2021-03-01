class Solution {
    static int cnt;
    static boolean[] visit;
    static int computer;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        computer = n;
        cnt = 0;
        visit = new boolean[n+1];

        for(int i=0; i<n ; i++){
            if(visit[i] == false){
                dfs(i, computers);
                cnt++; //가지 않은 곳에서 dfs 하면 연결된 node들을 구할 수 있쥐
                System.out.println("cnt : " + cnt);
            }
        }

        return cnt;
    }

    public void dfs(int start, int[][] map){
        visit[start] = true;
        for(int i=0; i<computer; i++){
            if(map[start][i] == 1 && !visit[i]){
                System.out.println("start : "+ start + " i :" + i);
                dfs(i, map);
            }
        }
    }
}
