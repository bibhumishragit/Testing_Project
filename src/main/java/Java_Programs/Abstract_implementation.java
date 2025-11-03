package Java_Programs;

public class Abstract_implementation extends Abstract_test{
    @Override
    String scan() {
        return "This is from scan function";
    }
    @Override
    int sum(int a, int b) {
        return a+b;
    }
}
