package it.unibo.ddd.exercises.money;

import it.unibo.ddd.exercises.money.currency.Currency;

public interface Money {

    int valueCents();

    Currency currency();

}
