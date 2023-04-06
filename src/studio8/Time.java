package studio8;


public class Time {
private int hour;
private int minutes;
private boolean twentyFour;

public Time(int hours, int minutes1, boolean twentyFourOrNot) {
	hour =hours;
	minutes=minutes1;
	twentyFour=twentyFourOrNot;
}
public String toString() {
if (twentyFour)
	return (hour + ":" + minutes);
else {
	if (hour<13)
		return hour + ":" + minutes + " am";
	else
		return hour-12 + ":" + minutes + " pm";
}
	
}

	public static void main(String[] args) {
 
    	Time a = new Time(13,32,false);
    	System.out.print(a);
    }

}