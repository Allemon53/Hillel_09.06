package homeWork.hw2.hmw18;

public class EntityIndividual extends Client {
    private double balance = 5000;
    private static final double COMMISSION = 0.01;

    @Override
    public void add(double amount) {
        balance += amount;
    }

    @Override
    public void get(double amount) {
        double totalAmount = amount + amount * COMMISSION;
        if (balance >= totalAmount) {
            balance -= totalAmount;
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
        System.out.println("Условия пополнения: без комиссии");
        System.out.println("Условия снятия: комиссия 1%");
    }
}
