//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Task1
        System.out.println("Task 1");

        int[] salaries = new int[] {70_000, 80_000, 120_000, 140_000, 50_000};
        int sum = 0;

        for (int i = 0; i < salaries.length ; i++) {
            sum += salaries[i];
        }
        System.out.println("«Сумма трат за месяц составила " + sum + " рублей»");

        //Task 2
        System.out.println("Task 2");

        int min = salaries[0];
        int max = salaries[1];

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] < min){
                min = salaries[i];
            }
            if (salaries[i] > max){
                max = salaries[i];
            }
        }
        System.out.println(" «Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная " +
                "сумма трат за неделю составила " + max + " рублей»");

        //Task 3
        System.out.println("Task 3");

        double average = (double) sum / salaries.length;
        System.out.println(" Средняя сумма трат за месяц составила " + average + " рублей ");

        //Task 4
        System.out.println("Task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2 ; i++) {

            int leftIndex = i;
            int rightIndex = reverseFullName.length - i - 1;

            char temp = reverseFullName[leftIndex];
            reverseFullName[leftIndex] = reverseFullName[rightIndex];
            reverseFullName[rightIndex] = temp;
        }
        for (int i = 0; i < reverseFullName.length ; i++) {
            System.out.print(reverseFullName[i]);

        }

    }
}