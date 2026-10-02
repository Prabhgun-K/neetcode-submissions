class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String ch : details) {
            if(ch.charAt(11) > '6') {
                count++;
            } else {
                if(ch.charAt(11)=='6' && ch.charAt(12)>'0' && ch.charAt(12)<='9') {
                        count++;
                }
            }
        }
        return count;
    }
}