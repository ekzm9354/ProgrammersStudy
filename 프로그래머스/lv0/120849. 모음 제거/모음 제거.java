class Solution {
    public String solution(String my_string) {
       
        char[] remove = { 'a', 'e', 'i', 'o', 'u' };
		String answer = my_string.replaceAll("[aeiou]","");
		
        return answer;
    }
}