class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        char[] req1 = s.toCharArray();  
        char[] req2 = t.toCharArray();      

        Arrays.sort(req1);
        Arrays.sort(req2);

        return Arrays.equals(req1,req2);
    }
}
