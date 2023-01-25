import java.util.Arrays;

public class Ex5_9 {
	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 };
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = code[(int)(Math.random()*5)];
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
