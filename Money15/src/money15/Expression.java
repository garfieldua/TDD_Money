package money15;

/**
 *
 * @author Andrew
 */
interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);
}
