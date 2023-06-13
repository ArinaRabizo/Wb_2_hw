public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        MyList<String> test = new MyList<>();
        test.add("2");
        test.add(1, "3");
        test.add(0, "1");
        System.out.println(test.toString());
        test.add("4");
        test.add("5");
        test.remove("3");
        System.out.println(test.toString());
        System.out.println(test.indexOf("5"));
        test.remove("1");
        System.out.println(test.indexOf("2"));
        System.out.println(test.indexOf("4"));
        System.out.println(test.toString());












    }
}