package money14;

/**
 *
 * @author Andrew
 */
interface Expression {

    Money reduce(Bank bank, String to);
}
