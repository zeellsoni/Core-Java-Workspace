class StringMethod{

	public static void main(String[] args){
		
		StringBuffer sb = new StringBuffer("abc");
		String s = sb.toString();
		//StringBuilder sb1 = new StringBuilder("abc");
		//System.out.println(sb +" "+sb.getClass());
		//System.out.println(s==sb);
		System.out.println(s.equals(sb));
		System.out.println(sb.equals(s));
		//System.out.println(sb.toString().getClass());
		//System.out.println(sb1.toString().getClass());
	}
}
