package Server;

import javax.servlet.http.*;

/**
 *
 * @author Daniel
 */
public abstract class SendableObject {
    public abstract void loadObject(HttpServletRequest hsr);
}
