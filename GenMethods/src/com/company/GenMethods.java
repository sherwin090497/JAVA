
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class GenMethods {

    public String getIdentificationString() {
        return "Program 7a, Sherwin Labadan";
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Integer[] list;
        LinkedList<Integer> linked = new LinkedList<Integer>();
        int n;
        int k;

        n = keyboard.nextInt();
        list = new Integer[n];
        for (int i = 0; i < n; i++) {
            list[i] = keyboard.nextInt();
            linked.add(list[i]);
        }

        System.out.println(Arrays.toString(list));
        System.out.println(linked);
        k = keyboard.nextInt();

        int pos = linearSearch(list, k);
        if (pos != -1)
            System.out.println("Key " + k + " was found at position " + pos);
        else
            System.out.println("Key " + k + " was not found");
        System.out.println(max(list) + " is the max element");

        int m, p;
        m = keyboard.nextInt();
        p = keyboard.nextInt();
        Integer[][] list2 = new Integer[m][p];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < p; j++)
                list2[i][j] = keyboard.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(list2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(max(list2) + " is the max element");
        ArrayList<Integer> alist = new ArrayList<Integer>(linked);
        System.out.println(alist);
        alist = removeDuplicates(alist);
        System.out.println(alist);
        shuffle(alist);
        System.out.println(alist);
        System.out.println(max(alist) + " is the max element");
    }

    public static ArrayList removeDuplicates(ArrayList list) {
        ArrayList result = new ArrayList<>();
        for (Object o : list) {
            if (!result.contains(o))
                result.add(o);
        }

        return result;
    }

    public static void shuffle(ArrayList list) {
        Random rand = new Random(340L);
        int m, n;
        Object temp;

        for (int i = 1; i <= 30; i++) {
            m = rand.nextInt(list.size());
            n = rand.nextInt(list.size());
            temp = list.get(m);
            list.set(m, list.get(n));
            list.set(n, temp);
        }
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.size() == 0)
            return null;
        else {
            E maximum = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).compareTo(maximum) > 0)
                    maximum = list.get(i);
            }

            return maximum;

        }
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0)
            return null;
        else {
            E maximum = list[0];
            for (int i = 1; i < list.length; i++) {
                if (list[i].compareTo(maximum) > 0)
                    maximum = list[i];
            }

            return maximum;

        }

    }

    public static <E extends Comparable<E>> E max(E[][] list) {
        if (list == null || list.length == 0)
            return null;
        else {
            E maximum = list[0][0];
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list[i].length; j++) {
                    if (list[i][j].compareTo(maximum) > 0)
                        maximum = list[i][j];
                }
            }
            return maximum;

        }

    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(key))
                return i;
        }
        return -1;
    }


}