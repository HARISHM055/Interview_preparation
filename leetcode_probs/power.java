//Cal the power of a number using binary exponentiation in O(log n)

public class power {
    public static int binExp(int x,int y){
        //base case
        //x^0=1
        if(y==0)
            return 1;
            
        //update statement
        int res=binExp(x,y/2);
        if(y%2==0)
            return res*res;
        else    
            return x*res*res;
            
    }
	public static void main(String[] args) {
	    int sol=binExp(2,5);
		System.out.println(sol);
	}
}
