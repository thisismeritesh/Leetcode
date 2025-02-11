class Solution {
    public boolean isAnagram(String s, String t) {
        int slen=s.length(),tlen=t.length();
        if(slen!=slen) return false;
        int[][] ana =new int[26][2];
        for(char c:s.toCharArray()){
            ana[c-'a'][0]++;
        }
        for(char c:t.toCharArray()){
            ana[c-'a'][1]++;
        }
        for(int i=0;i<ana.length;i++){
            if(ana[i][0]!=ana[i][1])return false;
        }
        return true;
    }
}