package demo.refactor;

public class IntroduceParameterObject {

    private String fun1(String start, String end) {
        return "fun 1 "+ start + "~" + end;
    }

    private String fun2(String start, String end) {
        return "fun 2 "+ start + "~" + end;
    }

    private String fun3(String start, String end) {
        return "fun 3 "+ start + "~" + end;
    }

    public static void main(String[] args) {
        final IntroduceParameterObject introduceParameterObject = new IntroduceParameterObject();
        System.out.println(introduceParameterObject.fun1("3", "6"));
        System.out.println(introduceParameterObject.fun2("4", "7"));
        System.out.println(introduceParameterObject.fun3("5", "8"));
    }

}
