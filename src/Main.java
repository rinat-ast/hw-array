import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1 ");
        int[] num = new int[]{1, 2, 3};
        float[] fl = new float[]{1.57f, 7.654f, 9.986f};
        byte[] bt = new byte[]{2, 3, 5};
        System.out.println("Задача № 2 ");
        for (int i = 1; i <= num.length; i++) {
            if (i == num.length) {
                System.out.println(num[i - 1]);
            } else {
                System.out.print(num[i - 1] + ", ");
            }
        }
        for (int i = 1; i <= fl.length; i++) {
            if (i == fl.length) {
                System.out.println(fl[i - 1]);
            } else {
                System.out.print(fl[i - 1] + ", ");
            }
        }
        for (int i = 1; i <= bt.length; i++) {
            if (i == bt.length) {
                System.out.println(bt[i - 1]);
            } else {
                System.out.print(bt[i - 1] + ", ");
            }
        }
        System.out.println("Задача № 3");
        System.out.println("-----");
        for (int i = num.length; i > 0; i--) {
            if (i == 1) {
                System.out.println(num[i - 1]);
            } else {
                System.out.print(num[i - 1] + ", ");
            }
        }
        System.out.println("-----");
        for (int i = fl.length; i > 0; i--) {
            if (i == 1) {
                System.out.println(fl[i - 1]);
            } else {
                System.out.print(fl[i - 1] + ", ");
            }
        }
        System.out.println("-----");
        for (int i = bt.length; i > 0; i--) {
            if (i == 1) {
                System.out.println(bt[i - 1]);
            } else {
                System.out.print(bt[i - 1] + ", ");
            }
        }
        System.out.println("-----");
        System.out.println("Задача № 4");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                num[i]++;
            }
            System.out.println(num[i]);

        }
        String[] word = new String[]{"Mama", "Papa", "sister", "brother"};
        for (int i = word.length; i > 0; i--) {
            System.out.print(word[i - 1] + " ");

        }
        System.out.println(word[1]);
        System.out.println(Arrays.toString(word));

    }
}

