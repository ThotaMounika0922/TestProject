package case_study;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testInsert {


	@Test
	void test() {
		//fail("Not yet implemented");
		int check=Book.Insert();
		assertEquals(check, 1);
	}

}
