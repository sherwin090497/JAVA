package com.company;

public class Main {
        public static void main(String[] args) {
            MyList<String> list = new MyArrayList<String>();

            list.add("Java");
            System.out.println("(1) " + list);

            list.add(0, "C++");
            System.out.println("(2) " + list);

            list.add("C");
            System.out.println("(3) " + list);

            list.add("Python");
            System.out.println("(4) " + list);

            list.add(2, "Groovy");
            System.out.println("(5) " + list);

            list.add(5, "Javascript");
            System.out.println("(6) " + list);

            list.remove(2);
            System.out.println("(8) " + list);

            list.remove(list.size() - 1);
            System.out.println("(9) " + list);
        }

}
