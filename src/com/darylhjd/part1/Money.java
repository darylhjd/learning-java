package com.darylhjd.part1;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        int euros = this.euros + addition.euros;
        int cents = this.cents + addition.cents;

        euros += cents / 100;
        cents += cents % 100;
        return new Money(euros, cents);
    }

    public Money minus(Money decreaser) {
        int result = Math.max((this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents), 0);

        int euros = result / 100;
        int cents = result % 100;
        return new Money(euros, cents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros > compared.euros) {
            return false;
        } else {
            return this.cents < compared.cents;
        }
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}
