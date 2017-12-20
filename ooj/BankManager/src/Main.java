public class Main {
    public static void main(String [] args) {
        BankAccount BankAccountFirst = new BankAccount();
        System.out.println(BankAccountFirst.accountNumber);

        CertificateOfDeposit CertficateOfDepositFirst = new CertificateOfDeposit();
        System.out.println(CertficateOfDepositFirst.balance);

        CheckingAccount CheckingAccountFirst = new CheckingAccount();
        System.out.println(CheckingAccountFirst.accountNumber);

        SavingsAccount SavingsAccountFirst = new SavingsAccount();
        System.out.println(SavingsAccountFirst.balance);
    }
}
