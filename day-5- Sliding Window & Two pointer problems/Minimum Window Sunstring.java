import java.util.HashMap;

class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

         HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int required = map.size();          
        int formed = 0;              
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        
        HashMap<Character, Integer> window = new HashMap<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            
            if (map.containsKey(c) && window.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }

                        while (left <= right && formed == required) {
                char leftChar = s.charAt(left);

                
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                 window.put(leftChar, window.get(leftChar) - 1);

                if (map.containsKey(leftChar) && window.get(leftChar).intValue() < map.get(leftChar).intValue()) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t)); 
    }
}