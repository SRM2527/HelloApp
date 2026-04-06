package org.example;

public class HelloApp {
    public static void main(String[] args) {
        String namesText;
        if(args.length == 0) {
            namesText = "World";
        }
        else {
            StringBuilder sb = new StringBuilder();
            for (String name: args) {
                if(sb.length() > 0) {
                    sb.append(" , ");
                }
                sb.append(name);
            }
            namesText = sb.toString();
        }
        System.out.println("Hello, " + namesText + "!");
    }
}
