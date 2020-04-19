package tutorial;

 

public class BreakAndContinue {
	
	
	public void go(){
		
		System.out.println("First");
		
		//break;
		
		//continue;
		
		System.out.println("Last");
		
	}

	public static void main(String[] args) {


		/*BreakandCont b = new BreakandCont();
		b.go();*/
		
		//continue ---> continue to the next cycle --> to skip the iterations
		
		for(int i=0; i<10; i++){
			
			
			if(i>=5 && i<=7)
				continue;
			
			//if(i==5)
		//		break;
			
			System.out.println(i);
		}
		
		System.out.println("Outside the loop");
	}

}
