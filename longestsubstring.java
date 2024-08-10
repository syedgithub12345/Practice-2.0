//longest substring
import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int maxlength=0;
//         for(int i=0;i<s.length();i++){
//             HashSet<Character> set=new HashSet<>();
//             for(int j=i;j<s.length();j++){
//                 if(set.contains(s.charAt(j))){
//                     break;
//                 }
//                 set.add(s.charAt(j));
//                 maxlength=Math.max(maxlength,j-i+1);
//             }
//         }
//         return maxlength;
//     }
// }