package calendar;

public class CalendarBug1 {

	public static String calend(int d, String ms, int a){
		int m=0;
		if (ms=="january") m=1;
		else if (ms=="february") m=2;
		else if (ms=="march") m=3;
		else if (ms=="april")m=4;
		else if (ms=="may")m=5;
		else if (ms=="june")m=6;
		else if (ms=="july")m=7;
		else if (ms=="august")m=8;
		else if (ms=="september")m=9;
		else if (ms=="october") m=10;
		else if (ms=="november")m=11;
		else if (ms=="december")m=12;

		if (d<1 || d>31 || m==0 || a<=1582)
			return "error";
		if (d<1 || d>31 || m==0 || a>2100)
			return "error";
		Boolean leapYear= (a%4==0);
		if (leapYear && a%100==0 && a%400!=0)
			leapYear=false;
		if ((m==2 && d>29)||(m==2 && d==29 && !leapYear))
			return "error";
		if ((m==4 || m==6 || m==9 || m==11) && d>30)
			return "error";
		if (m<=2){
			m = m + 12;
			a--;
		};
		int f1 = a / 4;
		int f2 = a / 100;
		int f3 = a / 400;
		int f4 = (int) (2 * m + (.6 * (m + 1)));
		int f5 = a + d + 1;
		int x = f1 - f2 + f3 + f4 + f5;
		int k = x / 7;
		int n = x - k * 7;

		if (n==1) return "monday";
		else if (n==2) return "tuesday";
		else if (n==3) return "wednesday";
		else if (n==4) return "thursday";
		else if (n==5) return "friday";
		else if (n==6) return "saturday";
		else if (n==0) return "sunday";
		else return "error";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 29;
		String month = "febbraio";
		int year = 1583;
		System.out.println(calend(day, month, year));
	}
}