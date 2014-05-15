/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money14;

import java.util.Hashtable;

/**
 *
 * @author Andrew
 */
class Bank {
    
    private Hashtable rates = new Hashtable();
    
    int rate(String from, String to) {
        if (from.equals(to))
            return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
    
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }
    
    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from,to), new Integer(rate));
    }
}
