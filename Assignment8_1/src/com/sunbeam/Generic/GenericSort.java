package com.sunbeam.Generic;

import java.util.Comparator;

import tester.Test;

public class GenericSort{

	public static  <T> void selectionSort(T [] arr, Comparator<T> c){
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(c.compare(arr[i],arr[j]) > 0){
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	
	public static void main(String[] args) {
		Test c = new Test();
		Double arr[] = {1.0 , 2.0 , 5.0 , 9.0 , 4.0};
		
		
		
		System.out.println("Before sort");
		for(Double ele : arr) {
			
			System.out.println(ele+" ");
		}
			System.out.println();
			
			selectionSort(arr, c);
			
			System.out.println("After sort");
			for(Double ele : arr) {
				
				System.out.println(ele+" ");
				System.out.println();
			
		}
		
		
			
		}
	} 
