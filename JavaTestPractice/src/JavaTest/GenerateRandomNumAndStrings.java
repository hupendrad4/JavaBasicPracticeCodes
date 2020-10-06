package JavaTest;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumAndStrings {

	public static void main(String[] args) {

		// Approach 1 -Random Class
		/*
		 * Random rand = new Random(); int num1 = rand.nextInt(10);
		 * System.out.println(num1);
		 * 
		 * double num2 = rand.nextDouble(); System.out.println(num2);
		 * 
		 * //Approach 2- Maths function System.out.println(Math.random());
		 */
		// Approach 3- Apache Common lang function
		String randNum = RandomStringUtils.randomNumeric(6);
		System.out.println(randNum);

		String RandAlphaNum = RandomStringUtils.randomAlphanumeric(5);
		System.out.println(RandAlphaNum);
	}

}
