package homeWork.hw2.hw18;

abstract class Client {
    protected double balance;
    public abstract void add(double amount);
    public abstract void get(double amount);
    public double rest() {
        System.out.println("Баланс:" + " " + balance);
        return balance;
    }
    public void about() {
        System.out.println("Условия пополнения: без комиссии");
        System.out.println("Условия снятия: без комиссии");
    }
}
