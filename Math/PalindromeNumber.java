Problem Descrion:

Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?


  ==============Solution=============
  -------------using String Conversion--------------
  class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String s = String.valueOf(x);
        int l= s.length(),p=0;    
        while(p<l/2){
            if(s.charAt(p)!=s.charAt(l-p-1)){
                return false;
            }
            p+=1;
        }
       return true;
        
    }
}
  ------------without using String Conversion ---------------
  class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,x1=x;
        while(x1>0){
            int rem=x1%10;
            rev=rev*10+rem;
            x1=x1/10;
        }
        if(rev==x) return true;
        return false;
    }
}
