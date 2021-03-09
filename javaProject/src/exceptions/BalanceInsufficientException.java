package exceptions;
 //RuntimeException과 비교해보기
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
