public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int wastes = 0;
        for (int i = 0; i < arr.length; i++) {
            int wWastes = arr[i];
            wastes = wastes + wWastes;
        }
        System.out.println("Сумма трат за месяц составила " + wastes + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxArr = -1;
        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int wWastes = arr[i];
            maxArr = maxArr + wWastes;
            if (wWastes > maxArr) {
                maxArr = wWastes;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxArr + " рублей");

        for (int i = 0; i < arr.length; i++) {
            int wWastes = arr[i];
            minArr = minArr + wWastes;
            if (wWastes < minArr) {
                minArr = wWastes;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int wastes = 0;
        for (int i = 0; i < arr.length; i++) {
            int wWastes = arr[i];
            wastes = wastes + wWastes;
            double middleWastes = wastes / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + wastes + " рублей");
    }


    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i] + " ");
            }
            System.out.println();

        }
    }
