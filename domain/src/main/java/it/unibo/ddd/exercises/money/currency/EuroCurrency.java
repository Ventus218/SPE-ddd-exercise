package it.unibo.ddd.exercises.money.currency;

public record EuroCurrency(
        String name,
        String symbol,
        String acronym) implements Currency {

}
