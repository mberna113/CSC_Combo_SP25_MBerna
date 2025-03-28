package Time;

public class Time {
	
	private int hour;
	private int min;
	private double sec;
	
	public Time() {  //default constructor
		this.hour = 0;
		this.min = 0;
		this.sec = 0.0;
	}//end Time()
	
		
	public Time(int hour, int min, double sec) { // constructor with variables in it
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public boolean equals(Time that) {
		
		final double DELTA = 0.001;
		return this.hour == that.hour &&
				this.min == that.min &&
				this.sec == that.sec &&
				Math.abs(this.sec - that.sec) < DELTA ;
	}

	public static Time add(Time t1, Time t2) {
		Time sum = new Time();
		sum.hour = t1.hour + t2.hour;
		sum.min = t1.min + t2.min;
		sum.sec = t1.sec + t2.sec;
		if (sum.sec >= 60) {
			sum.sec -= 60;
			sum.min += 1;
		}
		if (sum.min >= 60) {
			sum.min -= 60;
			sum.hour += 1;
		}
		
		return sum;
	}
	
	public Time add(Time t2) {
		Time sum = new Time();
		sum.hour = this.hour + t2.hour;
		sum.min = this.min + t2.min;
		sum.sec = this.sec + t2.sec;
		
		if (sum.sec >= 60) {
			sum.sec -= 60;
			sum.min += 1;
		}
		if (sum.min >= 60) {
			sum.min -= 60;
			sum.hour += 1;
		}
		
		return sum;
	}


	public void setHour(int hour) {  
		this.hour = hour;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
	
	public void setSec(double sec) {
		this.sec = sec;
	}


	public int getHour() {  //Returns hour
		return hour;
	}


	public int getMin() {  // returns min
		return min;
	}


	public double getSec() {  // returns sec (as double)
		return sec;
	}


	@Override
	public String toString() {
		return String.format("The time is %d:%d:%.2f", this.hour, this.min, this.sec);
	}
	
	
	
	
}//end Time class
