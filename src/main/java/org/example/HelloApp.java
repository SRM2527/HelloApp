package org.example;

public class HelloApp {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }
            StringBuilder sb = new StringBuilder("Hello ");
            String delimiter = " , ";
            for (String name: args) {
                sb.append(name).append(delimiter);
                }
            String result = sb.toString();
            if (result.endsWith(delimiter)) {
                result = result.substring(0, result.length() - delimiter.length());
        }
        System.out.println(result + "!");
    }
}
