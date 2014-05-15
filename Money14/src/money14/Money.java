/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money14;

/**
 *
 * @author Andrew
 */
class Money implements Expression {
    
protected int amount;
protected String currency;

Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
}

String currency() {
    return currency;
}

Money times (int multiplier){
    return new Money(amount * multiplier, currency);
}

Expression plus (Money addend) {
    return new Sum(this, addend);
}

public Money reduce(Bank bank, String to) {
    int rate  = bank.rate(currency, to);
    return new Money(amount/rate, to);
}

@Override
public String toString() {
    return amount + " " + currency;
}

static Money dollar(int amount){
    return new Money(amount, "USD");
}

static Money franc(int amount){
    return new Money(amount, "CHF");
}

@Override
public boolean equals(Object object) {
    Money money = (Money)object;
    return amount == money.amount && currency().equals(money.currency());
}

}
