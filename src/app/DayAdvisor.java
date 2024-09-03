package app;

public class DayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Будь продуктивним на роботі! Працюй над своїми цілями і задачами.");
            case FRIDAY ->
                    System.out.println("Happy Friday! Насолоджуйся закінченням робочого тижня.");
            case SATURDAY, SUNDAY ->
                    System.out.println("Це вихідні! Чудовий час відвідати парки, кіно або просто відпочити вдома.");
        }
    }

    public static void main(String[] args) {
        DayAdvisor advisor = new DayAdvisor();

        advisor.advise(Day.MONDAY);
        advisor.advise(Day.FRIDAY);
        advisor.advise(Day.SUNDAY);
    }
}