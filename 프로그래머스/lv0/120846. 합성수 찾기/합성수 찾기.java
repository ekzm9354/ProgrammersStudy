class Solution {
    public int solution(int n) {
        int answer = 0;
//       n까지의 자연수
        for(int i=1; i<=n;i++){
//           약수 개수
            int count = 0;
//            약수구하기
            for(int k=1;k<=i;k++){
//                수를 약수로 나눴을 때 나머지 0이면 count++
                if(i%k==0) count++;
            }
//             count가 3이상이면 answer ++
            if(count>=3) answer++;
        }
        return answer;
    }
}