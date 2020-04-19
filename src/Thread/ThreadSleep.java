package Thread;
//Under preemptive scheduling, the highest priority task executes until it enters the waiting or dead states or a higher priority task comes into existence. Under time slicing, a task executes for a predefined slice of time and then reenters the pool of ready tasks.

public class ThreadSleep extends Thread {
	//If you have to perform single task by many threads, have only one run() method.
	public void run() {
		 	for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.printf(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getId());  
			System.out.println(i);;
		}
	}

	public static void main(String args[]) {
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		ThreadSleep t3 = new ThreadSleep();
		t1.start();// Each thread starts in a separate call(beginning of) stack.
		// can't start a thread twice, so below is not allowed
		// t1.start();//Exception in thread "main" java.lang.IllegalThreadStateException
		try {
			t1.join();// it causes the currently running threads(t2, t3) to stop executing until the thread it joins with completes its task(t1 is killed).
		} catch (Exception e) {
			System.out.println(e);
		}
		//5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.
		t2.setPriority(1);  
		t3.setPriority(10);//3 and 4 of t3 prints prior to t2
		t2.start();
		t3.start();
		/*
		 * //As you can see in the above program that there is no context-switching
		 * because here t1 and t2 will be treated as normal object i.e., goes onto the
		 * current call stack(main()) , not thread object. t1.run(); t2.run();
		 */
		 t3.setName("Sonoo Jaiswal");  
		  System.out.println("After changing name of t2:"+t2.getName());  // we cant use t1 here, since it is killed
		 Runtime r=Runtime.getRuntime();//The object of Runtime class can be obtained by calling the static factory method getRuntime()  
		  System.out.println("Total Memory: "+r.totalMemory());  
		  System.out.println("Free Memory: "+r.freeMemory());  
		  for(int i=0;i<10000;i++){  
			   new ThreadSleep();  
			  }  
			  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
			  System.gc();  
			  System.out.println("After gc(), Free Memory: "+r.freeMemory());  
		 
		 
		 //r.addShutdownHook(new Thread());//to execute some code before JVM shuts down, use shutdown hook.i.e., to cleanup resource or save the state when JVM shuts down
			}
}
