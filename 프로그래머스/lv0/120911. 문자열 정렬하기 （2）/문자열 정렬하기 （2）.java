import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] array = my_string.split("");
        Arrays.sort(array,String.CASE_INSENSITIVE_ORDER);
        
        for(String data : array){
            answer += data.toLowerCase();
        }
        
        return answer;
    }
}