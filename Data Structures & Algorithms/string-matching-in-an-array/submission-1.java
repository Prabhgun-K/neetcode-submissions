class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i =0; i<words.length-1; i++) {
            for(int j=i+1; j<words.length; j++) {
                if(words[i].contains(words[j]) && !ans.contains(words[j])) ans.add(words[j]);
            }
        }
        for(int i=words.length-1; i>0; i--) {
            for(int j=i-1; j>=0; j--) {
                if(words[i].contains(words[j]) && !ans.contains(words[j])) ans.add(words[j]);
            }
        }
        return ans;
    }
}