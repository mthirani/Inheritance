package com.dremio.daas.application.optimizationservice.server;

public class TestInheritance {
  public static void main(String []args) {
    Base b = new Child();
    b.testCMethod();
    b.testBMethod();
  }
}
class Base {
  private void testAMethod() {
    System.out.println("testAMethod in Base");
  }

  public void testBMethod() {
    testAMethod();
    System.out.println("testBMethod in Base");
  }

  public void testCMethod() {
    testAMethod();
    System.out.println("testCMethod in Base");
  }
}

class Child extends Base {
  public void testAMethod() {
    System.out.println("testAMethod in Child");
  }

  public void testBMethod() {
    System.out.println("testBMethod in Child");
  }
}
