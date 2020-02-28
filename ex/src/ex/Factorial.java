package ex;

public class Factorial {
	public int calcFact(int x){
		if (x ==0) 
		{
			return 1;
		}
		else 
		{
			return (x*calcFact(x-1));
		}
	}
}
