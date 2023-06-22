package hw1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 100000;
		int x = 0;
        int[] arrayToSort = new int[n];
        int arr_len = arrayToSort.length;
        for (int i = 0; i < arr_len; i++) {
        	x = rnd.nextInt(1000);
        	arrayToSort[i] = x;
		}
        
        HeapSort hs = new HeapSort();
        long startTime = System.nanoTime();
        hs.sort(arrayToSort);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Heap Sort Time is : " + estimatedTime);
        
        ShellSort ss = new ShellSort();
        startTime = System.nanoTime();
        ss.sort(arrayToSort);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Shell Sort Time is : " + estimatedTime);
        
        Introsort introsort = new Introsort(arr_len);
        startTime = System.nanoTime();
        for (int i = 0; i < arr_len; i++) {
			introsort.dataAppend(arrayToSort[i]);
		}
        introsort.sortData();
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Intro Sort Time is : " + estimatedTime);

	}

}
