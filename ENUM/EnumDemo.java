
enum MonthWithDays {
    January(31), February(28), March(31);

    int days;

    MonthWithDays(int a) {
        days = a;
    }
}

public class EnumDemo {
    protected enum season {
        SUMMER, WINTER, SPRING, RAINY
    }

    private enum days {
        MONDAY, TUESDAY, WEDNESDAY, THRUSDAY,
    }

    public static void main(String[] args) {
        for (season s : season.values()) {
            System.out.println(s);
        }
        for (days s : days.values()) {
            System.out.println(s);
        }
        System.out.println(days.valueOf("MONDAY"));
    }
}
