import java.util.*;
class Solution {
    static boolean[] visit;
    static int answer;
    public int solution(String begin, String target, String[] words) {
        answer = 0;
        visit = new boolean[words.length];

        for(int i=0; i<words.length; i++){
            if(words[i].equals(target)){
                dfs(begin, target, words);
            }
        }

        return answer;
    }

    public void dfs(String presentWord, String target, String[] words){
        for(int j=0; j<words.length; j++){
            System.out.println("visited["+j+"] = " + visit[j]);
            if(!visit[j] && check(presentWord, words[j])){
                visit[j] = true;
                answer++;
                if(words[j].equals(target)){
                    return;
                }
                if(check(words[j], target)){
                    answer++;
                    return;
                }
                else{
                    dfs(words[j], target, words);
                }
            }
        }

    }

    public boolean check(String presentWord, String nextWord){
        System.out.println("presentWord : " + presentWord + " nextWord : " + nextWord);
        int count = 0;
        for(int i=0; i<presentWord.length(); i++){
            if(presentWord.charAt(i) != nextWord.charAt(i)){
                count++;
            }
        }
        return count ==1 ? true : false;
    }
}
