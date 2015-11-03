package net.apispark.webapi;

import static org.junit.Assert.*;

import junit.framework.Assert;
import net.apispark.webapi.representation.Contact;

public class Test {

	@org.junit.Test
	public void test() {
		Contact c = new Contact("123", "firstname", "lastname", "avatar");
		Assert.assertEquals(true, c.getAvatar().equals("avatar"));
	}
	
	public void testFail() {
		Contact c = new Contact("123", "firstname", "lastname", "avatar");
		Assert.assertEquals(false, c.getAvatar().equals("avatars"));
	}

}
