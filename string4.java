class String4{

	public static void main(String[] args){
	
	String s = new String("abc");
	s = s.concat("xyz");
	System.out.println(s);
	
	//s.concat("xyz");
	//System.out.println(s);
	
	final StringBuffer sb = new StringBuffer("abc");
	System.out.println(sb);
	
	sb.append("xyz");
	System.out.println(sb);
	}
}