public class P2LengthofLongestSubstring{
  public int lengthOfLongestSubstring(String s) {
        int[] dictionary = new int[128];
        char[] ch = s.toCharArray();
        int length = 0, temp = -1, result = 0;
        while(++temp < ch.length){
            dictionary[ch[temp]]++;
            while(dictionary[ch[temp]] > 1){
                dictionary[ch[length++]]--;
            }
            result = Math.max(result, temp - length + 1);
        }
        return result;
  }
}  
