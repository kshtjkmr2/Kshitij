package Normal_Regular;

public class Test {

	public static void main(String[] args) {
		OuterInnerDemo3 outer=new OuterInnerDemo3();
		OuterInnerDemo3.Inner in=outer.new Inner();
		in.method1();

	}

}
