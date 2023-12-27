class String2{

	public static void main(String[] args){
	
	String s = "abcd";
	String s1 = new String("abcd");
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	
	String s2 = "a";
	String s3 = s2 + "bcd";
	System.out.println(s1==s3);
	System.out.println(s1.equals(s3));
	
	String s4 = s.concat("");
	System.out.println(s1==s4);
	System.out.println(s1.equals(s4));
	
	String s6 = "a" + "bcd";
	System.out.println(s1==s6);
	System.out.println(s1.equals(s6));
	}
} 