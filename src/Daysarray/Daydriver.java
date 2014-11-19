package Daysarray;

class Daydriver {

	public static void main(String[] args) {
		/**
		 * Mohammed Aljubori
		 * 11/14/2014
		 * This is the driver to accompany DaysarryClass.java
		 */
		
		/**
		 * @param test Create new DaysarrayClass
		 */
	
		DaysarrayClass test = new DaysarrayClass(); 
		System.out.print(test.toString());
		test.setDay(1);
		System.out.print(test.toString());
		test.nextDay();
		test.prevDay();
		test.addday(1);
		System.out.print(test.toString());
		
	}

}
