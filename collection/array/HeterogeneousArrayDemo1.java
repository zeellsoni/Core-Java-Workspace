public class HeterogeneousArrayDemo1{
	
	public static void main(String[] args){
		
		int[] ob = new int[11];
		
		ob[0] = new String("ABC");
		ob[1] = new Integer(9);
		ob[2] = new Integer(9);
		ob[3] = null;
		ob[4] = "abc";
		ob[5] = new String("abc");
		ob[6] = new StringBuffer("abc");
		ob[7] = new StringBuilder("abc");
		ob[8] = ob[7];
		ob[9] = new Long(8);
		ob[10] = 8;
		
		System.out.println(ob);
		
		
		//comparing memory level reference and value 
		//of ob[1] and ob[2] 
		System.out.println(ob[1].hashCode() == ob[2].hashCode());
		System.out.println("HashCode of ob[1]: " + ob[1].hashCode());
		System.out.println("HashCode of ob[2]: " + ob[2].hashCode());
		
		System.out.println("Comparing ob[1] and ob[2] using == operator: " + (ob[1] == ob[2]));
		System.out.println("Comparing ob[1] and ob[2] using equals method: " + (ob[1]).equals(ob[2])); 
		
		System.out.println();
		
		//comparing memory level reference and value 
		//of ob[2] and ob[3]
		System.out.println(ob[2].hashCode() == ob[3].hashCode());
		System.out.println("HashCode of ob[2]: " + ob[2].hashCode());
		System.out.println("HashCode of ob[3]: " + ob[3].hashCode());
		
		System.out.println("Comparing ob[2] and ob[3] using == operator: " + (ob[2] == ob[3]));
		System.out.println("Comparing ob[2] and ob[3] using equals method: " + (ob[2]).equals(ob[3])); 
		
		System.out.println();
		
		//comparing memory level reference and value 
		//of ob[7] and ob[8]
		System.out.println(ob[7].hashCode() == ob[8].hashCode());
		System.out.println("HashCode of ob[7]: " + ob[7].hashCode());
		System.out.println("HashCode of ob[8]: " + ob[8].hashCode());
		
		System.out.println("Comparing ob[7] and ob[8] using == operator: " + (ob[7] == ob[8]));
		System.out.println("Comparing ob[7] and ob[8] using equals method: " + (ob[7]).equals(ob[8])); 
		
		System.out.println();
		
		//comparing memory level reference and value 
		//of ob[3] and ob[10]
		System.out.println(ob[3].hashCode() == ob[10].hashCode());
		System.out.println("HashCode of ob[3]: " + ob[3].hashCode());
		System.out.println("HashCode of ob[10]: " + ob[10].hashCode());
		
		System.out.println("Comparing ob[3] and ob[10] using == operator: " + (ob[3] == ob[10]));
		System.out.println("Comparing ob[3] and ob[10] using equals method: " + (ob[3]).equals(ob[10])); 
		
		System.out.println();
		
		//comparing memory level reference and value 
		//of StringLiteral ob[4] and String ob[5]
		System.out.println(ob[4].hashCode() == ob[5].hashCode());
		System.out.println("HashCode of StringLiteral ob[4]: " + ob[4].hashCode());
		System.out.println("HashCode of String ob[5]: " + ob[5].hashCode());
		
		System.out.println("Comparing StringLiteral ob[4] and String ob[5] using == operator: " + (ob[4] == ob[5]));
		System.out.println("Comparing StringLiteral ob[4] and String ob[5] using equals method: " + (ob[4]).equals(ob[5]));		
		
		System.out.println();
		
		//comparing memory level reference and value 
		//of String ob[5] and StringBuffer ob[6]
		//Here, StringBuffer does not override
		//equals() of Object Class
		System.out.println(ob[5].hashCode() == ob[6].hashCode());
		System.out.println("HashCode of ob[5]: " + ob[5].hashCode());
		System.out.println("HashCode of ob[6]: " + ob[6].hashCode());
		
		System.out.println("Comparing String ob[5] and StringBuffer ob[6] using == operator: " + (ob[5] == ob[6]));
		System.out.println("Comparing String ob[5] and StringBuffer ob[6] using equals method: " + (ob[5]).equals(ob[6])); 
		
		System.out.println();
		
		//comparing memory level reference and value 
		//of StringBuffer ob[6] and StringBuilder ob[7]
		//StringBuffer and StringBuilder do not
		//override equals() of Object Class
		System.out.println(ob[6].hashCode() == ob[7].hashCode());
		System.out.println("HashCode of ob[6]: " + ob[6].hashCode());
		System.out.println("HashCode of ob[7]: " + ob[7].hashCode());
		
		System.out.println("Comparing StringBuffer ob[6] and StringBuilder ob[7] using == operator: " + (ob[6] == ob[7]));
		System.out.println("Comparing StringBuffer ob[6] and StringBuilder ob[7] using equals method: " + (ob[6]).equals(ob[7]));
		
		System.out.println();
		
		//comparing memory level reference and value 
		//of String ob[5] and StringBuilder ob[7]
		System.out.println(ob[5].hashCode() == ob[7].hashCode());
		System.out.println("HashCode of ob[5]: " + ob[5].hashCode());
		System.out.println("HashCode of ob[7]: " + ob[7].hashCode());
		
		System.out.println("Comparing String ob[5] and StringBuilder ob[7] using == operator: " + (ob[5] == ob[7]));
		System.out.println("Comparing String ob[5] and StringBuilder ob[7] using equals method: " + (ob[5]).equals(ob[7])); 
		
		System.out.println();
		
		//comparing memory level reference and value 
		//of StringLiteral ob[4] and StringBuffer ob[6]
		System.out.println(ob[4].hashCode() == ob[6].hashCode());
		System.out.println("HashCode of ob[4]: " + ob[4].hashCode());
		System.out.println("HashCode of ob[6]: " + ob[6].hashCode());
		
		System.out.println("Comparing StringLiteral ob[5] and StringBuffer ob[7] using == operator: " + (ob[4] == ob[6]));
		System.out.println("Comparing StringLiteral ob[4] and StringBuffer ob[6] using equals method: " +(ob[4]).equals(ob[6]));
		
		System.out.println();
		
		//comparing memory level reference and value 
		//of StringLiteral ob[4] and StringBuilder ob[7]
		System.out.println(ob[4].hashCode() == ob[7].hashCode());
		System.out.println("HashCode of ob[4]: " + ob[4].hashCode());
		System.out.println("HashCode of ob[7]: " + ob[7].hashCode());
		
		System.out.println("Comparing StringLiteral ob[4] and StringBuilder ob[7] using == operator: " + (ob[4] == ob[7]));
		System.out.println("Comparing StringLiteral ob[4] and StringBuilder ob[7] using equals method: " +(ob[4]).equals(ob[7]));
		
		System.out.println();
		
		//This will print
		//ArrayIndexOutOfBoundsException
		ob[11] = 8; 
	
	}
}
	
 