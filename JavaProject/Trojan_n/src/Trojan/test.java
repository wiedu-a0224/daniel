package Trojan;

import java.util.Arrays;

public class test {
	 public static void rightRotateByOne(int[] A)
	    {
		    A[0] = (int)Math.round(Math.random()*3);
	        for (int i = A.length - 2; i >= 0; i--) {
	            A[i + 1] = A[i];
	        }
	        
	    }
	 
	    // �N�Ʋեk�� `k` �Ӧ�m�����
	    public static void rightRotate(int[] A, int k)
	    {
	        // �򥻱��p�G�L�Ŀ�J
	        if (k < 0 || k >= A.length) {
	            return;
	        }
	 
	        for (int i = 0; i < k; i++) {
	            rightRotateByOne(A);
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] A = new int[12];
	        int k = 100000;
	 
	        rightRotate(A, k);
	 
	        System.out.println(Arrays.toString(A));
	    }
	
       
}
