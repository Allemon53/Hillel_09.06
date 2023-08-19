package homeWork.hw2.hmw18;

public class Main {
    public static void main(String[] args) {
        Client individual = new Individual();
        individual.add(1000);
        individual.get(300);
        individual.rest();
        individual.about();

        Client entityIndividual = new EntityIndividual();
        entityIndividual.add(2000);
        entityIndividual.get(550);
        entityIndividual.rest();
        entityIndividual.about();

        Client entrepreneurs = new Entrepreneurs();
        entrepreneurs.add(500);
        entrepreneurs.get(100);
        entrepreneurs.rest();
        entrepreneurs.about();
    }
}
