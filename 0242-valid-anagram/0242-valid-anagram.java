class Solution {
    public boolean isAnagram(String s, String t) {
        int sn = s.length();
        int tn = t.length();
        if(sn != tn){
            return false;
        }
        List<Character> slist = new ArrayList<>();
        List<Character> tlist = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            slist.add(s.charAt(i));
        }
        for(int j=0;j<t.length();j++){
            tlist.add(t.charAt(j));
        }
        Collections.sort(slist);
        Collections.sort(tlist);
        return slist.equals(tlist);    
    }
}