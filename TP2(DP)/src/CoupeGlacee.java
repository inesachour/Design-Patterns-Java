

import java.util.Iterator;
import java.util.List;

public abstract class CoupeGlacee implements Snacks{
    protected List parfums;
    protected CoupeGlacee() {}
    public String description() {
        StringBuffer sb = new StringBuffer("");
        for(Iterator it = parfums.iterator(); it.hasNext();) {
            sb.append(it.next().toString());
            sb.append(" ");
        }
        return sb.toString();
    }
}
