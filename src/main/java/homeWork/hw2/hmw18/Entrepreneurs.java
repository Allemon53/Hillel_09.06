package homeWork.hw2.hmw18;

public class Entrepreneurs extends Client {
    private double balance = 500;
    private static final double COMMISSION = 0.01;
    private static final double MAX_NO_COMMISSION_AMOUNT = 1000;

    @Override
    public void add(double amount) {
        double totalAmount = amount - amount * COMMISSION;
        balance += totalAmount;
    }

    @Override
    public void get(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счете.");
        }
    }
    @Override
    public double rest() {
        System.out.println("Баланс:" + " " + balance);
        return balance;
    }
    @Override
    public void about() {
        System.out.println("Условия пополнения: комиссия 1% при сумме меньше 1000");
        System.out.println("Условия снятия: без комиссии");
    }
}
