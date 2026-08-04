package Day07.Ex15_사용자정의예외;

// 사용자 정의 예외 클래스
// - public class ??Exception extends Exception { } 
public class BalanceException extends Exception {

	public BalanceException() {
		super();
	}

	public BalanceException(String message) {
		super(message);
	}

}
