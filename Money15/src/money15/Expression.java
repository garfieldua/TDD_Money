/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money15;

/**
 *
 * @author Andrew
 */
interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
}
