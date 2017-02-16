package sarf.gerund.trilateral.unaugmented;

import java.util.LinkedList;
import java.util.*;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class GerundDescription {
    private String symbol;
    private String pattern;
    private boolean feminine = false;

    private static List femininPatterns = new LinkedList();
    static {
        femininPatterns.add("�������");
        femininPatterns.add("�������");
        femininPatterns.add("�������");
        femininPatterns.add("����������");
    }

    public GerundDescription() {
    }

    public String getPattern() {
        return pattern;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isFeminine() {
        return feminine;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
//        if (pattern.endsWith("�") || pattern.endsWith("�") || pattern.endsWith("��"))
        if (pattern.endsWith("�"))
            feminine = true;
        else {
            Iterator iter = femininPatterns.iterator();
            while (iter.hasNext()) {
                String item = (String) iter.next();
                if (item.equals(pattern))
                    feminine = true;
            }
        }
    }

}
