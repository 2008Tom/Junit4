package test01;

import org.junit.Test;

public class Mianji_test {

	@Test
	public void test() {
		Mianji m = new Mianji();  
		double S = m.getArea(m.getp(3, 4, 5));  
		System.out.println(S); 
	}

}
