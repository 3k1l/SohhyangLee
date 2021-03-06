import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    List<String> list = new ArrayList<>();
    static String route = "";
    static boolean[] visit;

    public String[] solution(String[][] tickets) {
        for(int i=0; i<tickets.length; i++){
            visit = new boolean[tickets.length];
            String start = tickets[i][0];
            String end = tickets[i][1];

            if(start.equals("ICN")){
                route = start + ",";
                visit[i] = true;
                dfs(tickets, end, 1);
            }
        }
        Collections.sort(list);
        String[] answer = list.get(0).split(",");
        return answer;
    }

    private void dfs(String[][] tickets, String end, int cnt){
        route += end + ",";

        if(cnt == tickets.length){ //모든 티켓을 사용하게 되는 경우 return
            list.add(route);
            System.out.println("route : " + route);
            return;
        }

        for(int i=0; i<tickets.length; i++){
            String s = tickets[i][0];
            String e = tickets[i][1];

            if(s.equals(end) && !visit[i]){
                visit[i] = true;
                dfs(tickets, e, cnt+1);
                System.out.println("route - : " + route);
                visit[i] = false; //여러 경로 구하기 위해서 이렇게 해줌
                //return 이 되어서 여기로 왔다면 모든 경로를 간 것이 아니니, false를 해주고
                //왔던 곳을 빼주었던 것!!
                route = route.substring(0, route.length()-4);
            }
        }
    }
}
