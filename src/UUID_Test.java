import java.util.UUID;

public class UUID_Test {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			System.out.println(uuid);
		}
	}

}


//String trim() test 
/*import java.lang.*;

public class UUID_Test {

	public static void main(String[] args) {

		// string with leading and trailing white space

		String str = " This is YiiBai ";

		System.out.print("Before trim = ");

		System.out.println(".." + str + "..");

		// leading and trailing white space removed

		System.out.print("After trim = ");

		System.out.println(".." + str.trim() + "..");

	}

}*/