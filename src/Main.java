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
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(fl));
        System.out.println(Arrays.toString(bt));
        System.out.println("Задача № 3");
        System.out.println("-----");
        for (int i = num.length; i > 0; i--) {
            System.out.println(num[i - 1]);

        }
        System.out.println("-----");
        for (int i1 = fl.length; i1 > 0; i1--) {
            System.out.println(fl[i1 - 1]);
        }
        System.out.println("-----");
        for (int i2 = bt.length; i2 > 0; i2--) {
            System.out.println(bt[i2 - 1]);
        }
        System.out.println("-----");
        System.out.println("Задача № 4");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                num[i]++;
            }
            System.out.println(num[i]);

        }

    }
}

