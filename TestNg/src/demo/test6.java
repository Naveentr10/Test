package demo;

import org.testng.annotations.Test;

public class test6 
{
@Test(dependsOnMethods = "register")
public void chat()
{
	System.out.println("send msg");
}
@Test
public void register()
{
	System.out.println("7090356319");
}
@Test(dependsOnMethods = "chat")
public void send()
{
	System.out.println("click");
}
}
