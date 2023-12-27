import java.util.Arrays;

public class ArrayUtilityCopyOf{

	public static void main(String[] args){
	
	int[] arr = { 10, 20, 11, 21, 31 };
	arr = Arrays.copyOf(arr, 4);

	//foreach loop iterates over
	//each element and 
	//prints it
	for(int i : arr){
		System.out.println(i);
	}
	
	System.out.println("Integer Array is: "
                           + Arrays.toString(arr));
	
	}
}
