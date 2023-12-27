class String1{

	public static void main(String[] args){
	
	String s = "ABC";
	s= s.concat("");
	String s1 = new String("ABC");
	
	/*StringBuffer sb = new StringBuffer("Zeel");
	StringBuffer sb1 = new StringBuffer("Zeel");
	
	//.append("abc"); */
	
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	
	//System.out.println(sb==sb1);
	//System.out.println(sb.equals(sb1));
	}
}
