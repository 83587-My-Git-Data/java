package tester;

import com.sunbeam.creditApp.Credit;

public class Test {

	
	public static void main(String[] args) {
		Credit c[] = new Credit[2];
		
		for(int i =0; i < c.length; i++) {
			c[i] = new Credit();
			c[i].acceptData();
			c[i].calculateNewBalance();
			c[i].newBalance();
			
		}
		
		
		for(int i = 0; i < c.length; i++) {
			if(c[i].isCreditLimitExceed()) {
				c[i].displayData();
			}
		}
		
	}

}
