import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stackList = new Stack<>();
        stackList.push(0);

        for(int move : moves){
            for(int j=0; j<board.length; j++){
                if(board[j][move-1] != 0){
                    if(stackList.peek() == board[j][move-1]){
                    stackList.pop();
                    answer += 2;
                    }
                    else{
                        stackList.push(board[j][move-1]);
                    }
                    board[j][move-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}

//stack.peek -> get top value
//stack.pop -> delete and print top value
//stack.push -> add value
