package criticalthinkingoption1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Option1 {

	public static void main(String[] args) {
		// Creating a program that pulls up days of a week with their
		// respective average temperature, allowing for a "week" entry
		// to show an entire week and the temperatures.
		Scanner scnr = new Scanner(System.in);
		List<String> daysOfweek = new ArrayList<>();
		List<Integer> temps = new ArrayList<>();
		boolean lookup = true;
		daysOfweek.add("Sunday");
		daysOfweek.add("Monday");
		daysOfweek.add("Tuesday");
		daysOfweek.add("Wednesday");
		daysOfweek.add("Thursday");
		daysOfweek.add("Friday");
		daysOfweek.add("Saturday");
		temps.add(73);
		temps.add(64);
		temps.add(66);
		temps.add(70);
		temps.add(79);
		temps.add(80);
		temps.add(81);
		
		while (lookup) {		
		System.out.println("Please enter a day of the week, or type 'Week' for a complete overview and average temperature:");
		
		String searchKey = scnr.next();
		
		switch(searchKey) {
			case "Sunday":
				System.out.println(daysOfweek.get(0) + " " + temps.get(0));
				break;
			case "Monday":
				System.out.println(daysOfweek.get(1) + " " + temps.get(1));
				break;
			case "Tuesday":
				System.out.println(daysOfweek.get(2) + " " + temps.get(2));
				break;
			case "Wednesday":
				System.out.println(daysOfweek.get(3) + " " + temps.get(3));
				break;
			case "Thursday":
				System.out.println(daysOfweek.get(4) + " " + temps.get(4));
				break;
			case "Friday":
				System.out.println(daysOfweek.get(5) + " " + temps.get(5));
				break;
			case "Saturday":
				System.out.println(daysOfweek.get(6) + " " + temps.get(6));
				break;
			case "Week":
				for (int i = 0; i < Math.min(daysOfweek.size(), temps.size()); i++) {
					System.out.println(daysOfweek.get(i) + " " + temps.get(i));
				}
				int sum = 0;
				for (int num : temps) {
					sum += num;
				}
				int averageTemp = (int)sum / temps.size();
				System.out.println("Average Temperature for the week: " + averageTemp);
				break;
		}
		System.out.println("Do you need more info? Type Y for yes or N for no.");
		String decision = scnr.next();
		if (!decision.equalsIgnoreCase("Y")) {
			lookup = false;
		
		}
	
	}
}
}


