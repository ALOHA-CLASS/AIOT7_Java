package Day06.Ex03_캡슐화;

public class Account {

    // private 필드 : 계좌번호, 예금주, 잔액
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // 생성자
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalance(balance);
    }

    // Getter & Setter : ctrl + . > Generate Getters and Setters...
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if( balance >= 0 )
            this.balance = balance;
        else
            System.err.println("잔액은 음수가 될 수 없습니다.");
    }

    // 입금
    public void deposit(double amount) {
        if( amount <= 0 ) {
            System.err.println("입금 금액은 0보다 커야 합니다!");
            return;     // 메소드 종료
        }
        balance += amount;
        System.out.println(amount + "원 입금 완료!");
        System.out.println("잔액 : " + balance);
    }

    // 출금
    public void withdraw(double amount) {
        if( amount <= 0 ) {
            System.err.println("출금 금액은 0보다 커야 합니다!");
            return;         // 메소드 종료
        }

        if( balance < amount ) {
            System.out.println("잔액이 부족합니다!");
            return;
        }

        balance -= amount;
        System.out.println(amount + "원 출금 완료");
        System.out.println("잔액 : " + balance);
    }

    // 계좌정보 
    public void printInfo() {
        System.out.println("::::: 계좌 정보  :::::");
        System.out.println("계좌번호 : " + accountNumber);
        System.out.println("예금주 : " + accountHolder);
        System.out.println("잔액 : " + balance + "원");
    }
    
    
}
