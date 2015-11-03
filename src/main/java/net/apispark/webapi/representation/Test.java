package net.apispark.webapi.representation;

import static org.junit.Assert.*;

import junit.framework.Assert;

public class Test {

	@org.junit.Test
	public void test() {
		Contact c = new Contact("123", "firstname", "lastname", "avatar");
		Assert.assertEquals(true, c.getAvatar().equals("avatar"));
	}

}
