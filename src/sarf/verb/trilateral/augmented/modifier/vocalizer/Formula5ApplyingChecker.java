package sarf.verb.trilateral.augmented.modifier.vocalizer;

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
public class Formula5ApplyingChecker extends IFormulaApplyingChecker{
    private List twoStateList = new LinkedList();
    private List notVocalizedList = new LinkedList();

    public Formula5ApplyingChecker() {
        twoStateList.add("���");
        twoStateList.add("���");
        twoStateList.add("���");

        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
    }

    public List getNotVocalizedList() {
        return notVocalizedList;
    }

    public List getTwoStateList() {
        return twoStateList;
    }
}
