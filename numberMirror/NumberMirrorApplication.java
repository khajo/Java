package week3P2.numberMirror;

public class NumberMirrorApplication {
    public static void main(String[] args) {
        NumberMirror numberMirror = new NumberMirror();
        Integer mirror = numberMirror.mirror(1234);
        System.out.println(mirror);

       Integer specialMirror= numberMirror.specialMirror(1234);
        System.out.println(specialMirror);

    }
}
