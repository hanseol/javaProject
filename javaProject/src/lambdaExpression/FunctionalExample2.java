package lambdaExpression;

interface MyFunctionInterface{
	void run(String str);
}

public class FunctionalExample2 {
	public static void main(String[] args) {
//		MyFunctionInterface mfi = new MyFunctionInterface() {
//			@Override
//			public void run(String str) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		MyFunctionInterface mfi = (str) -> System.out.println(str + "실행합니다.");
		
		mfi.run("run()");
		mfi.run("call()");
	}
}
