
public class Application {

	public static void main(String[] args) {
		//operator perform actions on operands
		// + - * /
		int age = 34 * 2;
		System.out.println(age);
		boolean isAge30 = age == 30;
		System.out.println(isAge30);
		
		System.out.println(68 == 68);
		
		age = age + 1;
		System.out.println(age);
		
		String firstName = "Tommy";
		String lastName = "Smith";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
	}

}
