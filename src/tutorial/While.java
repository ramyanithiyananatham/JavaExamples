package tutorial;

public class While {

	public static void main(String[] args) {

		int j=11;
		
		/*
		 * while(j<=10){
		 * 
		 * j++;
		 * 
		 * }
		 */
		
		do{
			
			System.out.println("inside Do while"+j);
			j++;
			
		}
		while(j<=10);
		
       for(int i=1;i<=10 ;i++){
			
			
			System.out.println(i);
			i++;
       }
			
		System.out.println(j);
		//System.out.println("After loop");
		

	}

}
