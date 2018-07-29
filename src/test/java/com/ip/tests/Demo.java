package com.ip.tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ip.utilitylibrary.*;

public class Demo extends Base
{
	public static void main(String[] args) {
		
		Base base= new Base();
		base.Initiate("firefox");
	}
}
