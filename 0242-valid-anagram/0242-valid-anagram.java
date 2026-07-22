class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_sort = s.toCharArray();
        char[] t_sort = t.toCharArray();
        Arrays.sort(s_sort);
        Arrays.sort(t_sort);
        List<Character> slist = new ArrayList<>();
        List<Character> tlist = new ArrayList<>();
        for(char word:s_sort){
            slist.add(word);
        }
        for(char word:t_sort){
            tlist.add(word);
        }        
        return (slist.equals(tlist));
    }
}