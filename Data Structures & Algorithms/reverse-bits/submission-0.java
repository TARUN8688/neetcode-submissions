class Solution {
    public int reverseBits(int n) {
        
        String binaryFormat = Integer.toBinaryString(n);
        String temp = "";
        if(binaryFormat.length()<=32){
            for(int i=0;i<32-binaryFormat.length();i++){
                temp += '0';
            }
            temp+=binaryFormat;
        }
        String finalRes = "";
        for(int i = temp.length()-1;i>=0;i--){
            finalRes += temp.charAt(i);
        }
        return (int) Long.parseLong(finalRes,2);
    }
}
