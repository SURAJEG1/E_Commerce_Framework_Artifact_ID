package listenerPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener Interface
public class Listener implements ITestListener {
	
	public void onTestSuccess(ITestResult pass) {
		System.out.println(pass.getMethod().getMethodName() + " Successfully Executed");
	}
	
	
	public void onTestFailure(ITestResult failed) {
		System.out.println(failed.getMethod().getMethodName() + " Got Failed & ScreenShot Captured");
		System.out.println(failed.getThrowable());
	}
	

}
