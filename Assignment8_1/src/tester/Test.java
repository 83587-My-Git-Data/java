package tester;

import java.util.Comparator;

import com.sunbeam.Generic.GenericSort;


public  class Test implements Comparator<Double>{
	
	
	@Override
	public int compare(Double o1, Double o2) {
		int diff=Double.compare(o1, o2);
			return diff;
	}
	
	
	}


