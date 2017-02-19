package controlflow;

import org.apache.log4j.Logger;

public class SwitchCase {
	final static Logger logger = Logger.getLogger(SwitchCase.class);

	public static void main(String[] args) {
		//for even months it prints even because a break statment is not present
		logger.info("switch case statment");
		int month =1;
		String monthString = "";
				switch(month){
				case 1:
					monthString = "Jan";
					break;
				case 3:
					monthString = "Mar";
					break;
				case 6:
				case 2:
				case 4:
				case 8:
				case 10:
				case 12:
					monthString = "Even";
					break;
				case 5:
					monthString = "May";
					break;
				case 7:
					monthString = "Jun";
					break;
				case 9:
					monthString = "Sep";
					break;
				case 11:
					monthString = "Nov";
					break;
				default:
					monthString = "Unknown";
				break;
				}
				System.out.println(monthString);
	}

}
