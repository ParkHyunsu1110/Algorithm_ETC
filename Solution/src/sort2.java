import java.util.Scanner;

public class sort2 {

	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("반복 횟수 설정 : ");
		   int[] array = new int[sc.nextInt()];
		   
		   for(int i=0; i<array.length; i++) {
		    	System.out.print("Array[" + i + "] = ");
		    	array[i] = sc.nextInt();
		    }
		      
		    sc.close();
		      
		    int max1,max2;
		      
		    max1 = max2 = array[0];
		    for(int i=1; i<array.length; i++) {
		    	if(max1 < array[i]) max1 = array[i];
		    }

		    for(int i=1; i<array.length; i++) {
		    	if(max2 < array[i]) {
		    		if(array[i] == max1) continue;
		    		else max2 = array[i];
		    	}
		    }
		    
		    System.out.println(max1 + "\n" + max2);
	   }
}
