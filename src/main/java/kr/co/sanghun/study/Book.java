package kr.co.sanghun.study;

@MyAnnotation("sanghun")
public class Book {

    private static String B = "BOOK";

    private static final String C = "BOOK";

    @MyAnnotation
    private String a = "a";

    @MyAnnotation
    public String d = "d";

    @AnotherAnnotation
    protected String e = "e";

    public Book() {
    }

    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    private void f() {
        System.out.println("f");
    }

    public void g() {
        System.out.println("g");
    }

    public int h() {
        return 100;
    }
}
