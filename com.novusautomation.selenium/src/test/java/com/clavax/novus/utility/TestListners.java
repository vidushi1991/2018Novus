package com.clavax.novus.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


	
	public class TestListners implements ITestListener{

		public void onTestStart(ITestResult result) {
		System.out.println("Test result onTestStart  "+result);
		}

		public void onTestSuccess(ITestResult result) {
		System.out.println("Test result onTestSuccess  "+result);

		}

		public void onTestFailure(ITestResult result) {
		System.out.println("Test result onTestFailure  "+result);
	
		}

		public void onTestSkipped(ITestResult result) {
		System.out.println("Test result onTestSkipped  "+result);
	
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

	
}
