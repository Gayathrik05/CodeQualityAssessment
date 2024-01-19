/*package com.dms;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dms.bean.Doctor;
import com.dms.controller.DoctorController;

@SpringBootTest
class SbDmsApplicationTests {

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
    	Doctor obj = new Doctor();
        obj.setId(108);
        obj.setName("Jawan");
        obj.setAge("34");
        obj.setEmail("jq@gmail.com");
        obj.setSpecial("Throat");
        obj.setContact("3698521470");
        obj.setLocation("Erode");
        update = "Updated";
        result = controller.performUpdate(obj);
        Assert.assertEquals(update, result);
    }

    @Test
    @Order(4)
    public void testPerformDelete() {
        delete = "Deleted";
        result = controller.performDelete(202);
        Assert.assertEquals(delete, result);
    }

    @Test
    @Order(5)
    public void testPerformViewAll() {
        list = controller.performViewAll();
        cus1 = new Doctor(301, "Domnic","45", "d@gmail.com","Eye", "8967456745", "Trichy");
        cus2 = new Doctor(302, "Raja", "46","r@gmail.com","Eye", "9078564534", "PDKT");
        list1.add(cus1);
        list1.add(cus2);
        list.equals(list1);
    }

}
*/