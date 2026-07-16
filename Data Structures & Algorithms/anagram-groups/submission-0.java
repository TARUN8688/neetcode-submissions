class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> res = new HashMap<>();

        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(res.get(sortedString)==null){
                res.put(sortedString,new ArrayList<>());
            }
            res.get(sortedString).add(s);
        }
        return new ArrayList<>(res.values());
    }
}