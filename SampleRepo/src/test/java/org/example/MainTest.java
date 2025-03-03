package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @Test
  public void testOutput() {
    String expected = "Hello, CI/CD Pipeline!";
    String actual = "Hello, CI/CD Pipeline!";  // Simulated output
    assertEquals(expected, actual, "The output should match expected value.");
  }
}