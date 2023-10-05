package homeWork.hw2.hw34;

public class MainABC {
    public static void main(String[] args) {
        String eng = "rksjmgiehbvtxwnqpoauydclzf";

        eng.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .forEach(System.out::print);
    }
}
