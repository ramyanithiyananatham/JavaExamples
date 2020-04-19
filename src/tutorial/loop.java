package tutorial;

public class loop 
{
	public static void main(String[] args) {
//loop l=new loop();	

int[] array = new int[10];
int[][] myArray2 = new int[3][4];
for (int i=0;i<array.length;i++) 
{ 
	array[i]=i; 
	System.out.print(array[i]); 
}
System.out.println();
for (int y : array)
{
System.out.print(y);
}
System.out.println();
for(int i=0;i<myArray2.length;i++)
{
for (int j= 0; j<myArray2[i].length;j++ )
{
myArray2[i][j]= j;
}
}
for (int i=0; i<myArray2.length;i++)
{
for (int j=0 ; j<myArray2[i].length; j++)
{
System.out.print(myArray2[i][j] + "\t");
//System.out.print("\t");
}
System.out.println();
}
System.out.println("right triangle");
	for (int row =0; row<5; row++ )
	{
	for (int col= 0; col<=row; col++)
	{
	System.out.print("*");
	}
	System.out.println();
	}
	System.out.println("rightt triangle reverse");
	for (int row =0; row<5; row++ )
	{
	for (int col = row; col<5; col++)
	{
	System.out.print("*");
	}
	System.out.println();
	}	
	System.out.println("left triangle");
			 for(int row=1;row<=5;row++){
				 for(int space=5;space>row;space--)
			            System.out.print(" ");
			        for(int col=1;col<=row;col++)
			            System.out.print("*");
			        System.out.println();

		    }
			 System.out.println("Equilateral triangle");
			for (int row=1;row<=4;row++)// for lop for row
			 {   
			 for (int space =4;space>=row;space--)// for loop for space
			 {  
			 System.out.print(" ");
			 }
			 for (int b=1;b<=row;b++)// for loop for column
			 {
			 System.out.print("* ");
			 }
			 System.out.println();
			 }
	
			 for(int row=1;row<=5;row++){
				 for(int space=5;space>row;space--)
			            System.out.print(" ");
			        for(int col=1;col<2*row;col++)
			            System.out.print("*");
			        System.out.println();

		    }
    
	}
}
