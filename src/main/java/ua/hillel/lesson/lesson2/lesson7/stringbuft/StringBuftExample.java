package ua.hillel.lesson.lesson2.lesson7.stringbuft;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringBuftExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append(2);
        sb.append(false);
        sb.append(Arrays.asList(3, 4, 5));
        sb.append('\n');
        sb.append("; ");

        System.out.println(sb);

        stringBufferMethods();
    }

    public static void stringBufferMethods(){
        String numbers = "0123456789";
        StringBuffer stringBuffer = new StringBuffer(numbers);
        System.out.println(stringBuffer.substring(3));
        System.out.println(stringBuffer.substring(4, 8));
        System.out.println(stringBuffer.replace(3,5, "ABCD"));

        System.out.println(stringBuffer.delete(5,9));
        System.out.println(stringBuffer.deleteCharAt(1));
        System.out.println(stringBuffer.insert(1, "ABC"));

    }
}
