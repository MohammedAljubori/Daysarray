package Daysarray;
public class DaysarrayClass {
	
	
	public String sday;
	public int iday;
	public String [] dayarray = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", };
	
	public DaysarrayClass() {
		sday = dayarray[0];
		iday = 1;
	}
	
	public String toString() {
		return "\nThe day is "+sday;
	}
	
	public String getDay() {
		return sday;
	}

	public void setDay(int x) {
		sday = dayarray[x-1];
		iday = x;
	}
	
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
	
	public void addday(int x) {
		int temp = iday;
		for(int y = (temp-1);y<=(x+(temp-2));y++) {
			nextDay();
		}
		toString();
		
	}
}
