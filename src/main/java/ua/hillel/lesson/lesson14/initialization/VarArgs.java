package ua.hillel.lesson.lesson14.initialization;

public class VarArgs {
    public static void main(String[] args) {
    //    String names =nameHandler("Alex", "Oleg", "Maks");
     //   System.out.println(names);
        String names2 = nameHandler("Alex", "Oleg", "Maks");
        System.out.println(names2);
    }
    static String nameHandler(String... name){
        String str = null;
        for (String n : name){
            str += n.toUpperCase();
        }
        return str;
    }
    static String nameHandler(String name1, String name2, String name3){
        return name1.toUpperCase() + name2.toUpperCase() + name3.toUpperCase();

    }
}
