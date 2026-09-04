class Solution {
    public int[] countBits(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<=n;i++){
            int sum =0;
            char[] binaryNum = Integer.toBinaryString(i).toCharArray();

            for(char c:binaryNum){
                if (c == '1') {
    sum++;
}
            }
            res.add(sum);
        }
        return res.stream().mapToInt(Integer :: intValue).toArray();
    }
}
