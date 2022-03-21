import java.util.Objects;

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
    private String name;
    private WeeksDays workingDay;
//    public static final String HELLO_WORLD = "Hello World";


    public Human(String name, WeeksDays workingDay) {
        this.name = name;
        this.workingDay = workingDay;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;// сравниваем а == а
        if (o == null || getClass() != o.getClass()) return false; // если не равняется какие-то условия
        Human human = (Human) o;//приведение типов, приводится объект к классу human
        return Objects.equals(name, human.name) && workingDay == human.workingDay;
        // сравниваются значения полей, если условия выполняются
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, workingDay);
    }

}