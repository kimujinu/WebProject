
public class ClassB {
 ClassA classA;
 public void setClassA(ClassA classA) {
  this.classA = classA;
 }
 public void methodB() {
  System.out.println("ClassB depends on "+classA.methodA());
 }
}