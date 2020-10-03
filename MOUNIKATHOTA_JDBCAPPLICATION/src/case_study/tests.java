package case_study;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class tests {
	@Test
	//testing the fetch operation
	void testFetch() {
		
		 int object=Book.Fetch();
		assertEquals( object,1);
		
}
	
	@Test
	
	//testing the delete operation
	void testDelete() {
		
		int check=Book.Delete();
		assertEquals(0,check);
	}
		

	@Test
	//testing the insert operation
	void testInsert() {

		int check=Book.Insert();
		assertEquals(check, 1);
		
		
	}
	@Test
	//testing the update operation
	void testUpdate() {
		
		int check=Book.Update();
		assertEquals(check, 0);
	}
	
	
		
		
	

}
