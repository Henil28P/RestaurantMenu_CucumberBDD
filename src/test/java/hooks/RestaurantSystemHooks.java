package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class RestaurantSystemHooks {
	@Before
	public void BeforeDisplayMessage()
	{
		System.out.println("Before");
	}

	@After
	public void AfterDisplayMessage()
	{
		System.out.println("After");
	}
}
