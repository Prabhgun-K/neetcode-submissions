class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int key = 0;
        for(int i=0; i<heights.length-1; i++) {
            for(int j=i+1; j<heights.length; j++) {
                if(heights[j] > heights[i]) {
                    key = heights[i];
                    heights[i] = heights[j];
                    heights[j] = key;
                    String k = names[i];
                    names[i] = names[j];
                    names[j] = k;
                }
            }
        }
        return names;
    }
}