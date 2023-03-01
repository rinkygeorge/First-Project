package Assignments;

public class Division extends Addition {
	int result;
	
	
	public int sum(){
		return super.sum();
				
	}

	public static void main(String[] args) {
		Division d1 = new Division();
		int sum = d1.sum();
		if(sum%10==0){
			System.out.println("Divisible by 10: ");
		}
		else
		{
			System.out.println("Not divisible by 10");
		}
		
		
	}

}
