/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money08;

/**
 *
 * @author Andrew
 */

class Dollar extends Money {
    
Dollar (int amount) {
    this.amount = amount;
}

Money times (int multiplier){
    return new Dollar(amount * multiplier);
}
}