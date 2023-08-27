package homeWork.hw2.hw21_Big_Mac;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Burger {
    enum Ingredients {
        СОУС("СОУС", 9),
        СЫР("СЫР", 20),
        КОТЛЕТА("КОТЛЕТА", 30),
        САЛАТ("САЛАТ", 15),
        ОГУРЕЦ("ОГУРЕЦ", 10),
        ЛУК("ЛУК", 11),
        ПОМИДОР("ПОМИДОР", 12);

        public final String title;
        public final int price;

        Ingredients(String title, int price) {
            this.title = title;
            this.price = price;
        }

        public static Ingredients getIngredientByTitle(String title) {
            for (Ingredients ingredient : Ingredients.values()) {
                if (ingredient.title.equalsIgnoreCase(title)) {
                    return ingredient;
                }
            }
            return null;
        }
    }

    enum PortionSize {
        МАЛЕНЬКИЙ("Маленький", 0.8),
        СРЕДНИЙ("Средний", 1.0),
        БОЛЬШОЙ("Большой", 1.2);

        public final String title;
        public final double priceMultiplier;

        PortionSize(String title, double priceMultiplier) {
            this.title = title;
            this.priceMultiplier = priceMultiplier;
        }
    }

        public static void main(String[] args) {
            Map<Ingredients, Integer> ingredientPrices = new HashMap<>();
            ingredientPrices.put(Ingredients.СОУС, 10);
            ingredientPrices.put(Ingredients.СЫР, 20);
            ingredientPrices.put(Ingredients.КОТЛЕТА, 30);
            ingredientPrices.put(Ingredients.САЛАТ, 15);
            ingredientPrices.put(Ingredients.ОГУРЕЦ, 10);
            ingredientPrices.put(Ingredients.ЛУК, 10);
            ingredientPrices.put(Ingredients.ПОМИДОР, 12);

            int baseBurgerPrice = 50;
            int totalBurgerPrice = baseBurgerPrice;

            StringBuilder selectedIngredients = new StringBuilder();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Добро пожаловать в Burger Builder!");
            System.out.println("Выберите размер порции:");
            for (PortionSize size : PortionSize.values()) {
                System.out.println(size.ordinal() + 1 + ". " + size.title);
            }

            int portionChoice = scanner.nextInt();
            PortionSize selectedPortionSize = PortionSize.values()[portionChoice - 1];
            totalBurgerPrice *= selectedPortionSize.priceMultiplier;

            System.out.println("Выберите дополнительные ингредиенты для бургера:");
            for (Ingredients ingredient : Ingredients.values()) {
                System.out.println(ingredient.ordinal() + 1 + ". " + ingredient.title + " - " + ingredientPrices.get(ingredient));
            }

            while (true) {
                System.out.print("Введите номер или название ингредиента (или введите 'нет' для завершения): ");
                String choice = scanner.next().toLowerCase();

                if (choice.equals("нет")) {
                    if (selectedIngredients.length() == 0) {
                        selectedIngredients.append("без добавлений");
                    }
                    break;
                } else if (choice.matches("[1-7]")) {
                    int num = Integer.parseInt(choice);
                    Ingredients ingredient = Ingredients.values()[num - 1];
                    selectedIngredients.append(ingredient.title).append(", ");
                    totalBurgerPrice += ingredientPrices.get(ingredient);
                } else {
                    Ingredients ingredient = Ingredients.getIngredientByTitle(choice);
                    if (ingredient != null) {
                        selectedIngredients.append(ingredient.title).append(", ");
                        totalBurgerPrice += ingredientPrices.get(ingredient);
                    } else {
                        System.out.println("Ингредиент с таким названием не найден. Пожалуйста, введите номер или корректное название из списка.");
                    }
                }
            }
            System.out.println("Выбранные ингредиенты: " + selectedIngredients);
            System.out.println("Размер порции: " + selectedPortionSize.title);
            System.out.println("Итоговая стоимость бургера с выбранными ингредиентами: " + totalBurgerPrice);
            System.out.println("Приятного аппетита");
        }
    }