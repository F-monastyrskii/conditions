//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1st task
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        //2nd task
        int temperature = 35;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        //3rd task
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //4th task
        int humanAge = 18;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить на работу");
        }
        //5th task
        int childAge = 14;
        if (childAge < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Можно кататься на аттракционе без сопровождения взрослого");
        }
        //6th task
        int numberOfPassengers = 60;
        if (numberOfPassengers < 60) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (numberOfPassengers >= 60 && numberOfPassengers < 102) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне не осталось мест");
        }
        //7th task
        int one = 3;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}