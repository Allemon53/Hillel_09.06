
package homeWork.hw2.hmw18;

public class Individual extends Client {
    private double balance = 1000;
    @Override
    public void add(double amount) {
        balance += amount;
    }
    @Override
    public double rest() {
        System.out.println("Баланс:" + " " + balance);
        return balance;
    }
    @Override
    public void get(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счете.");
        }
    }
}
