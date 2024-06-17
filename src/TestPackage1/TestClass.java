package TestPackage1;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 30;
		if(age<13)
			System.out.println("humans are called children");
		else if(age>=13 && age<=19)
			System.out.println("humans are called teenagers");
		else if(age>19 && age<=35)
			System.out.println("humans are called youth");
		else if(age>35 && age<60)
			System.out.println("humans are called middle aged");
		else
			System.out.println("humans are called senior citizens");
	}

}
