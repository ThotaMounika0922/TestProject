package Bookdomain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;





class testcase {
//testing the insertion operation
	@Test
	void testInsert() {
		
       int check= Book.Insert();
		//test the output
		assertEquals(1,check);
		
		
	}
	//testing the fetch operation 
	@Test
	void testFetch() {
		
		 int check=Book.Fetch();
		assertEquals( 1,check);
		
}

	@Test
	
	//testing the delete operation
	void testDelete() {
		
		
		int check=Book.Delete();
		assertEquals(1,check);
	}
	//testing the update operation
	@Test
void testUpdate() {
	
		int check=Book.Update();
		assertEquals(1,check);
	}
	
	
		
}
