
public class App5 {
    enum Day {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(final String[] args) {
        Day day = Day. Saturday;
        switch (day) {
            case Monday:
                System.out.println("Start of the work week!");
                break;
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("Work in progress");
                break;
                case Saturday:
                case Sunday:
                System.out.println("Enjoy the weekend!");
                break;
            default:
                System.out.println("Unknown day");
        }
    }
}