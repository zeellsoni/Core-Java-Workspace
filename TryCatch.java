import java.io.*;
class TryCatch{
/*	
	public static void main(String[] args){

try{
	
		int x = 1/0;
		System.out.println(x);
	}

catch(ArithmeticException z){

	System.out.println("arithmetic");
}
finally{

	System.out.println("hi");
}
}
} */
public static void writeToFile() throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
    bw.write("Test");
    bw.close();
}

public static void main(String[] args) {
try {
        writeToFile();
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
}
}
