package calendar;

import java.time.LocalDate;
import java.util.ArrayList;

public class Calendar {
    // List of dates
    private ArrayList<Date> dates;

    // Constructor
    public Calendar(ArrayList<Date> dates) {
        this.dates = dates;
    }

    // get- and set-
    public ArrayList<Date> getDates() {
        return dates;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "dates=" + dates +
                '}';
    }

    public void setDates(ArrayList<Date> dates) {
        this.dates = dates;
    }

    public static class Date {
        // Local date
        private LocalDate localDate;

        // Type of date
        private DateType dateType;

        // Constructor
        public Date(LocalDate localDate, DateType dateType) {
            this.localDate = localDate;
            this.dateType = dateType;
        }

        // get- and set-
        public LocalDate getLocalDate() {
            return localDate;
        }

        public void setLocalDate(LocalDate localDate) {
            this.localDate = localDate;
        }

        public DateType getDateType() {
            return dateType;
        }

        public void setDateType(DateType dateType) {
            this.dateType = dateType;
        }

        @Override
        public String toString() {
            return "Date{" +
                    "localDate=" + localDate +
                    ", dateType=" + dateType +
                    '}';
        }
    }
}
