package tutorial;
import java.io.IOException; 
public class CkeckExce1Throws {
	 
	  void m()throws IOException{  
		  System.out.println("try");
	    throw new IOException("device error");//checked exception  
	    }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
		  CkeckExce1Throws obj=new CkeckExce1Throws();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	

}
