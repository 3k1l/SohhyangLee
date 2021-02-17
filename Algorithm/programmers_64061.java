import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //Stack<Integer> list = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    System.out.println("board["+j+"]"+"["+(moves[i]-1)+"]"+": " + board[j][moves[i]-1]);
                    list.add(board[j][moves[i]-1]);
                   // System.out.println(list.peek());
                    if(list.get(list.size()-1) == board[j][moves[i]-1]){
                        System.out.println("same");
                       // list.pop();
                       // answer = answer + 1;
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
