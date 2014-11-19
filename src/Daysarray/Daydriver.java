package Daysarray;

class Daydriver {

	public static void main(String[] args) {
		
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
