/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money09;

/**
 *
 * @author Andrew
 */
abstract class Money {
    
protected int amount;
protected String currency;

String currency() {
    return currency;
}
abstract Money times(int multiplier);

Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
}

static Money dollar(int amount){
    return new Dollar(amount, "USD");
}

static Money franc(int amount){
    return new Franc(amount, "CHF");
}

@Override
public boolean equals(Object object) {
    Money money = (Money)object;
    return amount == money.amount && getClass().equals(money.getClass());
}

}