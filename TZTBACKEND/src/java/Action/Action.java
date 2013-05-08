/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author kevinvandommele
 */
public abstract class Action {
    
    public abstract void load(HttpServletRequest hsr);
    
    public abstract Object get();
    
    public abstract boolean set();
}
