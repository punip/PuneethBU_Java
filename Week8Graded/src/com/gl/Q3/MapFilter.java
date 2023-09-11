package com.gl.Q3;

import java.util.Arrays;
import java.util.Scanner;

public class MapFilter {

	public static void main(String[] args) {
		
	int arr[] = {1,2,3,4,5};
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter size of array");
//	int n = sc.nextInt();
//	int arr[] = new int[n];
//	System.out.println("Enter array elements");
//	for(int i=0;i<n;i++)
//		arr[i] = sc.nextInt();
	System.out.println(Arrays.stream(arr).filter(x->x%2!=0).map(x->x*x).sum());
	
	}
	
}
