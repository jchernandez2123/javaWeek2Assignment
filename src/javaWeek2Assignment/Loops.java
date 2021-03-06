package javaWeek2Assignment;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		  //Question 5 a,b,c,d solutions
		
		System.out.println("This is part 5a");
		 int x = 0;// part 5a it will print out all even numbers 
		  while ( x < 102) // this will make it so it stops at 102 and prints out 100 in our console display
		  {
			  System.out.print(x);
			  x += 2;// this will make it so it prints out even numbers
		  } 
		  System.out.println();
		  System.out.println("This is part 5b");
		  int z =100;//part 5b 
		 while (z >= 0) //this will command to tell the computer to print number greater than 0 or equal
		 {
			System.out.println(z);//this will print the variable z
			 z-=3;//this will tell it to print every third number backwards 
		 }
		 System.out.println();
		 System.out.println("This is part 5c");
	for (int a = 1; a < 100; a+= 2) // part 5 c  will tell the software to print out every other number from 1 to 100
	{ 
		System.out.print(a);// this will print out variable a
	}
     System.out.println("This is part 5d");
	for(int i = 0; i <= 100; i++) //part 5 d
	{
		 if (i % 3 == 0) //this will print every number divisible by 3
		 {
			 {System.out.println("Hello");
		 } if (i % 5 ==0) // this will initialize every number divisible by 5
		 { 
			 System.out.println("World");	 
		 } if (i % 3==0 && i % 5==0) // this will initialize every number divisible by 3 and 5
		 {
			System.out.println("HelloWorld");// this will print out the numbers divisible by 3 and 5 as "HelloWorld"
		 		} else 
		 		{
		 			System.out.println(i);// This will print out all the numbers that are not divisible by 3 or 5
		 		}
		 	}
		 }
		
		
		
		
		

	}

}
