package Thread;

//thread by extending thread
class Simple1 extends Thread{  
	 public void run(){  
	   System.out.println("task one");  
	 }  
	}  
	  
	class Simple2 extends Thread{  
	 public void run(){  
	   System.out.println("task two");  
	 }  
	}  
	  
	 class MultiTaskingExtendThread{  
	 public static void main(String args[]){  
	  Simple1 t1=new Simple1();  
	  Simple2 t2=new Simple2();  
	  
	  t1.start();  
	  t2.start();  
	 }  
	}  
