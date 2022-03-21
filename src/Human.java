public class Human {
 /*   public final static int AGE = 25; // с большой буквы константы
    public final static int B = 15;*/
//    private int D;

/*    public static void printHelloWorld(){
        System.out.println(("Hello World"));
    }*/

    /*    public class Human1 { // создаются для записи небольшого кода
            private int c;

            public Human1(int c) {
                this.c = c;
            }
            public int getC() {
                return c;
            }
            public int setC() {
                this.c = c;
                d = 5;
            }


        }*/
    public static final String HELLO_WORLD = "Hello World";
    private String name;
    private WeeksDays workingDay;

    public Human(String name, WeeksDays workingDay) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeeksDays getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(WeeksDays workingDay) {
        this.workingDay = workingDay;
    }

    public void printHelloWorld() {
        System.out.println("Hello World");
    }
}