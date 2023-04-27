class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 97 && array[i] <= 122) {
				String temp = array[i] + "";
				answer += temp.toUpperCase();
			} else {
				if (array[i] >= 65 && array[i] <= 90) {
					String temp = array[i] + "";
					answer += temp.toLowerCase();
				}
			}
		}

        return answer;
    }
}