
//public class ClassB {
//	public void methodB() {
//		ClassA classA = new ClassA(); 
//		System.out.println("ClassB Depends on"+classA.methodA());
//	}
//}

public class ClassB {
	ClassA classA;
	public ClassB(ClassA classA) {
		this.classA = classA;
	}
	public void methodB() {
		System.out.println("ClassB depends on "+classA.methodA());
	}
}