class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            String ch=patterns[i];
            if(word.contains(ch)){
                count++;
            }
        }
        return count;
    }
}