public class TestConstructorDI {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
  //Constructor based Dependency Injection
		ClassB classB = new ClassB(classA);
		classB.methodB();
	}

}