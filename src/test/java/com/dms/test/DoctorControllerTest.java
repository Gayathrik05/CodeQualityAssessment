/*package com.dms.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dms.bean.Doctor;
import com.dms.controller.DoctorController;

@SpringBootTest
class DoctorSprinBootApplicationTests {

    @Autowired
    DoctorController controller;

    String insert;
    String update;
    String delete;
    String result;
    String result1;
    
    List<Doctor> list = new ArrayList<Doctor>();
    List<Doctor> list1 = new ArrayList<Doctor>();
    Doctor cus1;
    Doctor cus2;

    @Test
    @Order(1)
    void contextLoads() {

    }

    @Test
    @Order(2)
    public void testPerformInsert() {
    	Doctor obj = new Doctor();
        obj.setId(108);
        obj.setName("Ignesh");
        obj.setAge("34");
        obj.setEmail("ig@gmail.com");
        obj.setSpecial("Ear");
        obj.setContact("9078563456");
        obj.setLocation("Trichy");
        insert = "Inserted";
        result = controller.performInsert(obj);
        Assert.assertEquals(insert, result);
    }

    
    
    
    
    
    
    @Test
    @Order(3)
    public void testPerformUpdate() {
        Doctor cu = new Doctor();
        cu.setId(104);
        cu.setName("Kishore");
        cu.setEmail("kis@gmail.com");
        cu.setCno("9078563456");
        cu.setLocation("Trichy");
        update = "Updated";
        result = controller.performupdateDoctor(cu);
        assertEquals(update, result);
    }

    @Test
    @Order(4)
    public void testPerformDelete() {
        delete = "Deleted";
        result = controller.performdeleteDoctor(201);
        result1 = controller.performdeleteDoctor(301);
        assertEquals(delete, result);
    }

    @Test
    @Order(5)
    public void testGetAllMovieDetails() {
        list = controller.getAllDoctor();
        cus1 = new Doctor(101, "Domnic", "d@gmail.com", "8967456745", "Trichy");
        cus2 = new Doctor(102, "Raja", "r@gmail.com", "9078564534", "PDKT");
        list1.add(cus1);
        list1.add(cus2);
        list.equals(list1);
    }

}




 * package com.dms.test;
 

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dms.bean.Doctor;
import com.dms.controller.DoctorController;

public class DoctorControllerTest {
	static DoctorController obj;
	static Doctor bean;
	int id;
	String name;
	String age;
	String email;
	String special;
	String contact;
	String location;

	@BeforeClass
	public static void objectCreation() {
		obj = new DoctorController();
		bean = new Doctor();
	}

	@AfterClass
	public static void objectDeletion() {
		obj = null;
	}

	@Before
	public void initialization() {
		id = 401;
		name = "Gowtham";
		age = "30";
		email = "gm @gmail.com";
		special = "General";
		contact = "3333333333";
		location = "Sivakasi";
	}

	@After
	public void reset() {
		id = 0;
		name = null;
		age = null;
		email = null;
		special = null;
		contact = null;
		location = null;
	}

	@Test
	public void testPerformViewAll() {
       
        List<Doctor> actual = obj.performViewAll();
        List<Doctor> expected = obj.performViewAll();
        assertEquals(expected,actual);
            }
	@Test
	public void testPerformInsert() {
		int actual = obj.performInsert(null);
	    int expected =  101;
	    assertEquals(expected,actual);
	}
}


	@Test
	public void testPerformUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testPerformDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testPerformViewAll() {
		fail("Not yet implemented");
	}





	
	 * @Test public void testperformInsert() {
	 * 
	 * int actual = Laptop.performInsert(4]); int expected = 101;
	 * assertEquals(expected,actual); }
	 * 
	 * @Test public void testperformUpdate() { int actual = Laptop.performUpdate();
	 * int expected = 101; assertEquals(expected,actual); }
	 * 
	 * @Test public void testperformDelete() {
	 * 
	 * int actual = Laptop.performDelete(); int expected = 101;
	 * assertEquals(expected,actual); }
	 
	
	


*/
