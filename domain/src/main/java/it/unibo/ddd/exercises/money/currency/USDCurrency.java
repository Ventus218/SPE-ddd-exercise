package it.unibo.ddd.exercises.money.currency;

public record USDCurrency(
                String name,
                String symbol,
                String acronym) implements Currency {

}
