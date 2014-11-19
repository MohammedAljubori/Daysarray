package Daysarray;
public class DaysarrayClass {
	
	/**
	 * Mohammed Aljubori
	 * 11/14/2014
	 * This is the resource class that uses the dayarray array
	 */
	
	
	/**
	 * @param sday Create sday string
	 * @param iday Create iday int
	 */
	
	/**
	 * 3 declared public variables 
	 * sday: the string of the current day
	 * iday: the int of the current day
	 * dayarray: the array of the days of the week
	 */
	public String sday;
	public int iday;
	public String [] dayarray = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", };
	
	/**
	 * The constructor for a day
	 */
	public DaysarrayClass() {
		sday = dayarray[0];
		iday = 1;
	}
	
	/**
	 * The toString to out put the current day
	 */
	public String toString() {
		return "\nThe day is "+sday;
	}
	
	/**
	 * The getter for the current day
	 */
	public String getDay() {
		return sday;
	}

	/**
	 * The setter to change the day through int x.
	 * Int x is the desired day of the week
	 * Int x sets sday to the appropriate string and iday to the appropriate int
	 */
	public void setDay(int x) {
		sday = dayarray[x-1];
		iday = x;
	}
	
	/**
	 * If the day is or between sunday and friday, it will add +1 go one day forward
	 * If the day is saturday, the day is set to sunday
	 */
	public void nextDay() {
		if(iday<=6) {
			iday = iday + 1;
			setDay(iday);
			getDay();
		}
		else {
			setDay(1);
			getDay();
		}
	}
	
	/**
	 * If the day is or between monday and saturday, it will go -1 day backward
	 * If the day is sunday, the day is set to saturday
	 */
	public void prevDay() {
		if(iday>=2) {
			iday = iday-1;
			setDay(iday);
			getDay();
		}
		else {
			setDay(7);
			getDay();
		}	
	}
	
	/**
	 * x is the number of days to jump forward, the int of the current day is saved to temp
	 * y is initialized to be the index of the current day
	 * so long as y is less than the days to jump plus the starting position, y will increment
	 * every increment calls nextDay();
	 * the current day is out put
	 */
	public void addday(int x) {
		int temp = iday;
		for(int y = (temp-1);y<(x+(temp-1));y++) {
			nextDay();
		}
		toString();
		
	}
}
