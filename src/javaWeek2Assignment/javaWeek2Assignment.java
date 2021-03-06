package javaWeek2Assignment;

public class javaWeek2Assignment{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Java assignment week 2 homework
		
		//Question 2 a,b,c parts
		 boolean isHotOutside = true;// part 2a 
		  boolean isWeekday = false ;// part 2b 
		  boolean hasMoneyInPocket = true;// part 2c `
		
		  //Question 3 a,b,c parts
		  double costOfMilk = 2.65;//part 3a
		  double moneyInWallet = 21.23;//part 3b
		  int thirstLevel =6;// part 3c
		  
		  //Question 4 a,b,c,d parts 
		 boolean shouldByIceCream = isHotOutside && hasMoneyInPocket;//part 4a 
		 System.out.println(shouldByIceCream);// this will print true
		 boolean willGoSwimming = isHotOutside && !isWeekday;//part 4b the "!" command makes it print the opposite since the original value is false it will print true
		  System.out.println(willGoSwimming);//this will print out true because both are true
		  boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;//part 4c "!" flip false value to true because it is a 
		  System.out.println(isAGoodDay);//will print out statement true
		  boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk;//part 4d
		  System.out.println(willBuyMilk);//this will check statement is true
		  
		  
		  

	}
}
	
	 
 
		  


	  
    
 

