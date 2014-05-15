/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package money14;

/**
 *
 * @author Andrew
 */
class Pair {
    
    private String from;
    private String to;
    
    Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }
    
    @Override
    public boolean equals(Object object) {
        Pair pair = (Pair) object;
        return from.equals(pair.from) && to.equals(pair.to);
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
}
