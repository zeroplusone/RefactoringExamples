package demo.refactor;

public class IntroduceParameterObjectAfter {

    private String fun1(Range range) {
        return "fun 1 "+ range.start + "~" + range.end;
    }

    private String fun2(Range range) {
        return "fun 2 "+ range.start + "~" + range.end;
    }

    private String fun3(Range range) {
        return "fun 3 "+ range.start + "~" + range.end;
    }

    public static void main(String[] args) {
        final IntroduceParameterObjectAfter introduceParameterObject = new IntroduceParameterObjectAfter();
        System.out.println(introduceParameterObject.fun1(new Range("3", "6")));
        System.out.println(introduceParameterObject.fun2(new Range("4", "7")));
        System.out.println(introduceParameterObject.fun3(new Range("5", "8")));
    }

}

class Range{
    String start;
    String end;

    public Range(String start, String end){
        this.start = start;
        this.end = end;
    }
}
