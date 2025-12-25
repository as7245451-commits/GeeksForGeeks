// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int sum=0,og=n;
        // code here
        while(n>0)
        {int number=n%10;
            sum+=number*number*number;
            n/=10;}
            if(og==sum)
            return true;
            else
            return false;
            
    }
}