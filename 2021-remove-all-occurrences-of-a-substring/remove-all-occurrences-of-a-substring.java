class Solution {
    public String removeOccurrences(String s, String part) {
        String str=s;
        while(str.contains(part)){
            str=str.replaceFirst(part,"");
        }
        return str;
    }
}