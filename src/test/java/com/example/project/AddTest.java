package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class AddTest {

	@Test
	void myAddTest(TestInfo testInfo) {
		Calculator calculator = new Calculator();
		assertEquals(11, calculator.add(10, 1), "10 + 1 should equal 11");
		
	}

}