package JavaTest;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		System.out.println("Month Selected :"+calender(2));
	}

	public static String calender(int month) {

		String monthName;
		switch (month) {

		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			if (true) {
				System.out.println("its Riya's Birthday in this month");
			}
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "Septeber";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;

		default:
			monthName = "Invalid selection , please choose months from  1-12 ";
			break;
		}
		return monthName;
	}

}
