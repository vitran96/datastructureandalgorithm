package javaBasic_2;

public class TestClassExtend extends TestClass {
    public static void main(String[] args) {
        TestClass tc = new TestClassExtend();
        tc.test1();
        ((TestClass) tc).test1();
    }
    @Override
    public void test1() {
        System.out.println("TestClassExtend 's test1");
    }
}
