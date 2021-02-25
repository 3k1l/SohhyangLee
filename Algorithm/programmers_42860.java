import java.util.*;
class Solution {
    public int solution(String name) {
        int answer = 0;
        int front_answer = 0;
        int back_answer = 0;

        String[] strName = name.split("");

        for(int i=0; i<strName.length; i++){
            int text = strName[i].charAt(0) - 65;
            //from front
            if(text > 13){
                front_answer = front_answer + (26-text);
            }
            else if(text < 13){
                front_answer = front_answer + text;
            }
            else if(text == 13){
                front_answer = front_answer + 13;
            }
            //from back? A..
            if(strName[i].equals('A')){
              //넘기기?
            }
        }
        // 뒤로 가는 테스트 케이스 생각이 필요....
        // front_case 와 back_case 구해서 비교
        // A를 만났을 때 갈 것이냐 아니냐
        return answer;
    }
}

//A~Z : 65~90
//a~z : 97~122
// 뒤에서 가는 거가 생각보다 너무 어려움
//
