package studio8;

import java.util.Objects;

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
@Override
public int hashCode() {
	return Objects.hash(hour, minutes);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Time other = (Time) obj;
	return hour == other.hour && minutes == other.minutes;
}
	public static void main(String[] args) {
 
    	Time a = new Time(13,32,false);
    	Time b = new Time (1,32,true);
    	Time c = new Time (4, 2, false);
    	Time d = new Time(13,32,true);
    	if(a.equals(b)) {
    		System.out.print("yes");
    	}
    	else {
    		System.out.println("no");
    	}
    	//System.out.print(a);
    }
	

}