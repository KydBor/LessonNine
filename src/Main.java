public class Main {
    public static void main(String[] args) {//const бывают публичные и приватные,
        // public если используем в нескольких местах,
        // private только в рамках этого класса
 /*       System.out.println(Human.age);
        Human.printHelloWorld();*/

 //       Human.Human1 human1 = new Human.Human1();

        Human human = new Human("Petya", WeeksDays.FRIDAY);
        System.out.println(human.getWorkingDay());
        System.out.println(human.getWorkingDay().getCode());
    }

}
