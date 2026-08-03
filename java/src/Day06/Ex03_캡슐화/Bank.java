package Day06.Ex03_캡슐화;

public class Bank {

    public static void main(String[] args) {
        Account account = new Account("282401-04-109955", "알로하", 10000);
        account.printInfo();
        System.out.println();

        account.deposit(50000);         // 50000원 입금
        account.withdraw(30000);        // 30000원 출금
        account.withdraw(200000);        // 200000원 출금
        System.out.println();

        account.printInfo();
        System.out.println();

        // 예금주 변경
        account.setAccountHolder("김대우");
        System.out.println("이름 변경 후");
        account.printInfo();
        System.out.println();

        // 잘못된 금액 설정
        account.setBalance(-5000);
    }
    
}
