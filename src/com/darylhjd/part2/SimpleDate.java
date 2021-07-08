package com.darylhjd.part2;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void advance() {
        this.day++;
        // If the no. of days is 30 or less, then return.
        if (this.day <= 30) {
            return;
        }

        // If not, then we need to increment the month and reset day.
        this.day = 1;
        this.month++;
        if (this.month <= 12) {
            return;
        }

        this.month = 1;
        this.year++;
    }

    public void advance(int days) {
        for (int i = 0; i < days; i++) {
            this.advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (!(object instanceof SimpleDate)) {
            return false;
        }

        SimpleDate other = (SimpleDate) object;

        return this.day == other.day && this.month == other.month && this.year == other.year;
    }

    @Override
    public int hashCode() {
        return (this.year - 1900) * 2 + this.month + this.day;
    }
}
