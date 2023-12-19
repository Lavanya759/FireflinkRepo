package Jenkins;

import org.testng.annotations.Test;

public class jenklinsParamater {
@Test
public void parameters()
{
	String Browser=System.getProperty("Browser");
	System.out.println(Browser);
}
}
