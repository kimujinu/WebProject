package kr.ac.dit;

public class ClassB {
	 ClassA classA;
	 public ClassB(ClassA classA) {
	  this.classA = classA;
	 }
	 public void methodB() {
	  System.out.println("ClassB depends on "+classA.methodA());
	 }
}
