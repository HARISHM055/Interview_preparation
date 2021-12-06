//(leetcode)1922. Count Good Numbers

class Solution {
    public static long binExp(long x,long y,long mod){
        if(y==0)
            return 1;
        long res = binExp(x,y/2,mod)%mod;
        if(y%2==0)
        {
            return (res*res)%mod;
        }
        else
            return (x*res*res)%mod;
    }
    public int countGoodNumbers(long n) {
        long evenCount=(n+1)/2;
        long oddCount=n/2;
        long mod=1000000007;
        return (int)((binExp(5,evenCount,mod)*binExp(4,oddCount,mod))%mod);
    }
}


public class countGoodNum
{
	public static void main(String[] args) {
	Solution s1=new Solution();
	int r=s1.countGoodNumbers(4);
	System.out.println(r);
	}
}