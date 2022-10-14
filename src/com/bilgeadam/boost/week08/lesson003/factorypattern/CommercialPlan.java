package com.bilgeadam.boost.week08.lesson003.factorypattern;

public class CommercialPlan extends Plan {
	private static CommercialPlan instance ;
	
	
	 private CommercialPlan() {
		getRate();
	}
	 
	 public static CommercialPlan getInstance() {
		 if(instance== null) {
			 instance = new CommercialPlan();
		 }
		 return instance;
	 }

	public void getRate(){  
	        rate=3.50;              
	   }  

}
