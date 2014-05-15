/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money08;

/**
 *
 * @author Andrew
 */
abstract class Money {
    
protected int amount;

abstract Money times(int multiplier);

static Money dollar(int amount){
    return new Dollar(amount);
}

static Money franc(int amount){
    return new Franc(amount);
}

@Override
public boolean equals(Object object) {
    Money money = (Money)object;
    return amount == money.amount && getClass().equals(money.getClass());
}

}
