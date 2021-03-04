import java.util.*;
class Solution {
  static boolean[][] visited;
  static ArrayList<String> cityList;

  public String[] solution(String[][] tickets) {

    visited = new boolean[tickets.length][tickets[0].length];
    cityList = new ArrayList<>();

    for(int i=0; i<tickets.length; i++){
      for(int j=0; j<2; j++){
        visited[i][j] = false;
      }
    }

    for(int i=0; i<tickets.length; i++){
      if(tickets[i][0].equals("ICN")){
        if(checkMinimum("ICN", tickets)){
          dfs(tickets[i][0], tickets[i][1], tickets);
        }
      }
    }

    String[] answer = new String[cityList.size()];

    for(int i=0; i<cityList.size(); i++){
      answer[i] = cityList.get(i);
    }

    return answer;
  }

  public void dfs(String depart, String destination, String[][] tickets){
    System.out.println("destination : " + destination);
    for(int i=0; i<tickets.length; i++){
      if(destination.equals(tickets[i][0]) && !visited[i][0]){
        if(checkRedundantStatus(tickets[i][0], tickets)){
          visited[i][0] = true;
          cityList.add(destination);
          dfs(tickets[i][0], tickets[i][1], tickets);
        }
        else{
          if(checkMinimum(tickets[i][0], tickets)){
            visited[i][0] = true;
            cityList.add(destination);
            dfs(tickets[i][0], tickets[i][1], tickets);
          }
        }
      }
    }
  }

  public boolean checkRedundantStatus(String department, String[][] tickets){
      int cnt = 0;
    for(int i=0; i<tickets.length; i++){
      if(department.equals(tickets[i][0])){
          System.out.println("checkRedundant : " + tickets[i][0]);
          cnt++;
      }
    }
    return cnt > 1 ? false : true;
  }


  public boolean checkMinimum(String toBeDepartment, String[][] tickets){
    System.out.println("toBeDepartment : " + toBeDepartment);
    String mC = "";
    for(int i=0; i<tickets.length; i++){
      if(toBeDepartment.equals(tickets[i][0])){
        if(toBeDepartment.compareTo(tickets[i][1]) < 0){
          System.out.println("compare : tickets[i][1] : " + tickets[i][1]);
          return true;
        }
      }
    }
    return false;
  }
}
