import java.util.*;

public class P4IntToRoman {
  public String intToRoman(int n) {
    int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] numerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    StringBuilder sb = new StringBuilder();
    for(int i=0 i<nums.length; i++){
      while(n >= nums[i]){
        n -= nums[i];
        sb.append(numerals[i]);
      }
    }
    return sb.toString();
 }
}
