package Time;

public class TimeDriver {

	public static void main(String[] args) {
		Time myTime = new Time();
		
		myTime.setHour(11);
		myTime.setMin(24);
		myTime.setSec(48);
		
		System.out.println(myTime.getHour() + ":" + myTime.getMin() + ":" + myTime.getSec());
		System.out.println(myTime);
		
		
		
		Time yourTime = new Time(11,37,55);
		
		System.out.println(yourTime);
		
		
		Time differentTime = new Time(11,37,55);
		
		System.out.println(differentTime.equals(yourTime));
		
		System.out.println(Time.add(differentTime, yourTime));
		
		System.out.println(myTime.add(differentTime));
	}//end main

}//end class
