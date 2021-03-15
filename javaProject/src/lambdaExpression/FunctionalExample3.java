package lambdaExpression;

@FunctionalInterface
interface MyFuncInterace {
	int run(int a, int b);
}

public class FunctionalExample3 {
	public static void main(String[] args) {
		MyFuncInterace mfi = (a, b) -> a+b;
	
		int result = mfi.run(4, 5);
		System.out.println(result);
		
		mfi = (a,b) ->a * b;
		result = mfi.run(4, 5);
		System.out.println(result);
		
		mfi = (aa,bb) ->{
			return (aa+bb)/2;
		};
		result = mfi.run(4, 5);
		System.out.println(result);
	}
}
