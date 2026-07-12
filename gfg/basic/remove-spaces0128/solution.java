class Solution {
    public String removeSpaces(String s) {
        // code here
        String w = "";
        for(int i =0;i<=s.length()-1;i++){
            if(s.charAt(i) != ' '){
                w += s.charAt(i);
            }
        }
        return w;
    }
}