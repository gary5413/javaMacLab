public class Ex_10_07 {
	
	public static void main(String[] argv) {
		String a = "abbc12a";
		System.out.println(a.matches("\\w*\\d*\\w*"));
		System.out.println(a.matches("\\w{4}\\d*\\w?"));
		System.out.println(a.matches("(\\w*\\d{2,3})\\w*"));
		
		System.out.println(a.replaceAll("(\\w*\\d{2,3})(\\w*)","$2$1"));
		
		System.out.println(a.substring(2,3));
		
		System.out.println(a.matches("\\w+"));
	}
}
		
