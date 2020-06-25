package com.aiims.internal;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class AiimsInternalApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AiimsInternalApplication.class, args);

		//Scanner in = new Scanner(System.in); 
		//		int testCaseNum = in.nextInt();
		//		int noOfPlayers = in.nextInt();
		//		int maxGames = 0;
		//		long[] arr1 = new long[noOfPlayers];
		//		long[] arr2 = new long[noOfPlayers];
		//		if (in.hasNext()) {
		//			for (int i = 0; i < noOfPlayers; i++) {
		//				arr1[i] = in.nextLong();
		//			}
		//			for (int i = 0; i < noOfPlayers; i++) {
		//				arr2[i] = in.nextLong();
		//			}
		int testCaseNum =1;
		int noOfPlayers =10;
		long[] arr1 = new long[] {3, 6, 7 ,5, 3, 5, 6, 2, 9, 1};
		long[] arr2 = new long[] {2, 7, 0, 9, 3, 6, 0, 6, 2, 6};
		long[] arr3 = new long[noOfPlayers];
		int maxGames = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		while(testCaseNum>0) {
			for(int i=0; i< noOfPlayers ; i++) {
				arr3[i] = arr1[i] - arr2[i];
				if(arr3[i] > 0) {
					maxGames++;
				} else if(arr3[i] == 0 && (i+1)<=noOfPlayers-1 && arr2[i] < arr2[i+1]) {
					maxGames++;
				}
			}
			testCaseNum--;
			System.out.println(maxGames);
			
		}

	}
}

