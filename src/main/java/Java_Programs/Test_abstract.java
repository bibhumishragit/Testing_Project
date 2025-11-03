package Java_Programs;

public class Test_abstract{
    public static void main() {
        Abstract_test abtest = new Abstract_implementation();
        abtest.print();
        abtest.scan();
        System.out.println(abtest.sum(2,3));
    }
}
