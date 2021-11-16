class Dates {
	String[] weeks = new String[7];
	String[] chWeeks = {"�P����", 
											"�P���@", 
											"�P���G", 
											"�P���T", 
											"�P���|", 
											"�P����", 
											"�P����"};
	
	public Dates() {
		weeks[0] = "Sun";
		weeks[1] = "Mon";
		weeks[2] = "Thu";
		weeks[3] = "Wed";
		weeks[4] = "Tus";
		weeks[5] = "Fri";
		weeks[6] = "Sat";
	}
	
	public String askDate(int day) {
		if(day >= 1 && day <= 7)
			return weeks[day % 7];
		return "Wrong day";
	}
	
	public String toChinese(String day) {
		for(int i = 0;i < 7;i++)
			if(weeks[i].toUpperCase().equals(day.toUpperCase()))
				return chWeeks[i];
		return "������";
	}
}

public class Pgm0909 {
	public static void main(String[] argv) {
		Dates aDate = new Dates();
		for(int i = 1;i <= 7;i++)
			System.out.println(aDate.toChinese(aDate.askDate(i)));
	}
}