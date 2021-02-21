import java.util.*;
class Solution {
    public int solution(String name) {
        int answer = 0;
        String[] strName = name.split("");

        for(int i=0; i<strName.length; i++){
            int text = strName[i].charAt(0) - 65;
            if(text > 13){
                answer = answer + (26-text);
            }
            else if(text < 13){
                answer = answer + text;
            }
            else if(text == 13){
                answer = answer + 13;
            }
        }
        return answer;
    }
}

//A~Z : 65~90
//a~z : 97~122
