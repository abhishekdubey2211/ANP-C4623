package Strings;

public class StringsInJava {
	public static void main(String[] args) {
		String a = "Abhishek";
		int age = 22;
		String address = "Mumbai";
		
		System.out.println("hello Mr I am MR %s Iam %d years of old Leaving in %s"+a+age+address);
		System.out.print("hello Mr I am MR %s Iam %d years of old Leaving in %s"+a+age+address);

//		printing using printf   use %d for int  use %s for string    use %f for float %c for char
		System.out.printf("\nhello Mr I am MR %s Iam %d years of old Leaving in %s",a,age,address);
		System.out.format("\nhello Mr I am MR %s Iam %d years of old Leaving in %s",a,age,address);
		
		
		
//		methods of string
		String b = "          hello Mr I am MR Abhishek Iam 22 years of old Leaving in Mumbai        ";
		System.out.println("\n\nString methods \n"+b);
		System.out.println("toUpperCase() = "+b.toUpperCase());
		System.out.println("toLowerCase() = "+b.toLowerCase());
		System.out.println("length() = "+b.length());
		System.out.println("removing whitescaces using trim()  = "+b.trim());
		System.out.println("return boolean values   contains() = "+b.contains("years"));
		System.out.println("from index no 30 to end of index    substring() = "+b.substring(30));
		System.out.println("from index no 30 to 40 of index    substring() = "+b.substring(30,40));
		System.out.println("replacing 22 to 45    replace() = "+b.replace("22", "45"));
		System.out.println("startsWith() = "+b.startsWith("   "));
		System.out.println("cheaking character at index 29    charAt()  = "+b.charAt(29));
		System.out.println("indexOf()  = "+b.indexOf("years"));
	}

}
