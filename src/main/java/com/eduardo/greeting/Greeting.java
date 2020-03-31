package com.eduardo.greeting;

/**
 * @author EduardoGiacomini <carloseduardo.diasgiacomini@gmail.com>
 *
 */
public class Greeting {
    private final int MINIMUM_HOUR_OF_DAY;
    private final int MAXIMUM_HOUR_OF_DAY;

    private final int MINIMUM_HOUR_OF_MORNING;
    private final int MAXIMUM_HOUR_OF_MORNING;

    private final int MINIMUM_HOUR_OF_AFTERNOON;
    private final int MAXIMUM_HOUR_OF_AFTERNOON;

    public Greeting() {
        this.MINIMUM_HOUR_OF_DAY = 0;
        this.MAXIMUM_HOUR_OF_DAY = 23;

        this.MINIMUM_HOUR_OF_MORNING = 6;
        this.MAXIMUM_HOUR_OF_MORNING = 12;

        this.MINIMUM_HOUR_OF_AFTERNOON = 13;
        this.MAXIMUM_HOUR_OF_AFTERNOON = 18;
    }

    public String getGreeting(int hourOfDay) {
        if (!this.isHourOfDayValid(hourOfDay)) {
            throw new IllegalArgumentException("Sorry. This hour sounds invalid to me!");
        }
        if (this.isMorning(hourOfDay)) {
            return "Good Morning";
        }
        if (this.isAfternoon(hourOfDay)) {
            return "Good Afternoon";
        }
        return "Good Night";
    }

    private boolean isHourOfDayValid(int hourOfDay) {
        boolean isValid = ((hourOfDay >= this.MINIMUM_HOUR_OF_DAY) && (hourOfDay <= MAXIMUM_HOUR_OF_DAY));
        return isValid;
    }

    private boolean isMorning(int hourOfDay) {
        boolean isMorning = ((hourOfDay >= this.MINIMUM_HOUR_OF_MORNING) && (hourOfDay <= this.MAXIMUM_HOUR_OF_MORNING));
        return isMorning;
    }

    private boolean isAfternoon(int hourOfDay) {
        boolean isAfternoon = ((hourOfDay >= this.MINIMUM_HOUR_OF_AFTERNOON) && (hourOfDay <= this.MAXIMUM_HOUR_OF_AFTERNOON));
        return isAfternoon;
    }
}
