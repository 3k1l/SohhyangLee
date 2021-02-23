import java.util.*;
class Solution {
    public int solution(String name) {
        int answer = 0;
        String[] strName = name.split("");

        for(int i=0; i<strName.length; i++){
            int text = strName[i].charAt(0) - 65;
            //from front
            if(text > 13){
                answer = answer + (26-text);
            }
            else if(text < 13){
                answer = answer + text;
            }
            else if(text == 13){
                answer = answer + 13;
            }
            //from back? A..
            //A의 갯수를 구해야하나..
        }
        // 뒤로 가는 테스트 케이스 생각이 필요....
        return answer;
    }
}

//A~Z : 65~90
//a~z : 97~122
// 뒤에서 가는 거가 생각보다 너무 어려움
//
