public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa = summa + arr[i];
        }
        System.out.println("Сумма расходов " + summa + " через обычный цикл");
        int summEach = 0;
        for (int element : arr) {
            summEach = summEach + element;
        }
        System.out.println("Сумма расходов " + summEach + " через цикл for each");
    }

    public static void task2() {
        int [] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        int minSumma = arr[0];
        int maxSumma = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSumma) ;{
                maxSumma = arr[i];
            }
        }
        System.out.println("Минимальная сумма затрат за день " + minSumma + " рублей");
        System.out.println("Максимальная сумма затрат за день " + maxSumma + " рублей");
    }
    public static void task3(){
        int [] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        int totalSumm = 0;
        int kolDney = arr.length;
        for (int element : arr){
            totalSumm = totalSumm + element;
        }
        System.out.println("Средняя сумма в день составляет " + (totalSumm / kolDney) +
                " рублей за " + kolDney + " дней");
    }
}

