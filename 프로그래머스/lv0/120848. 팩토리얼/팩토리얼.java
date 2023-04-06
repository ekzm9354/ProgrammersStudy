class Solution {
    public int solution(int n) {
       int answer = 1;
		int sum = 1;

		while (true) {
			sum *= answer;

			if (n < sum) {
				answer = answer-1;
				break;
			} else {
				if (sum == n) {
					break;
				} else {
					answer++;
				}
			}
		}
        return answer;
    }
}