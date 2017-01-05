package com.linkedlist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import org.junit.Before;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LinkedListTestApplicationTests {

	MyLinkedList list;
	
	@Before
	public void contextLoads() {
		list = new MyLinkedList();
		list.addNode("10");
		list.addNode("20");
		list.addNode("30");
		list.addNode("40");
		list.addNode("50");
	}
	
	@Test
	public void testAdd() { 
		assertTrue("list size should be 5 but list size was "+ list.size,list.size==5);
		assertTrue(list.head.next.next.value=="30");
		

	}
	public void testremoveWithValue() {
		list.removeNode("30");
		assertTrue(list.head.next.next.value=="40");
		assertTrue("list size should be 4 but list size was "+ list.size,list.size==4);
		assertTrue(list.head.next.value=="20");
		assertTrue(list.head.next.next.next.value=="50");
	}
	
	public void testremoveWithIndex() {
		list.removeNode(0);
		assertTrue("list size should be 4 but list size was "+ list.size,list.size==4);
		assertTrue(list.head.value=="20");
		assertTrue(list.head.next.value=="30");
		list.removeNode(1);
		assertTrue("list size should be 3 but list size was "+ list.size,list.size==3);
		assertTrue(list.head.next.value=="40");
		assertTrue(list.head.next.next.value=="50");
	}
	public void testGetNode() {
		assertTrue(list.getNode(1)=="20");
		assertTrue(list.getNode(0)=="10");
		assertTrue(list.getNode(4)=="50");

	}

}
