package sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf;

import java.util.*;
import sarf.verb.trilateral.unaugmented.modifier.vocalizer.*;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description:��� ������ ��� �����
 * ��� ��� ������� ������ ������ �� ��� ����� ������ ������������             </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public abstract class AbstractAjwafYaeiListedVocalizer extends ListedVocalizer {
    private List appliedRoots = new LinkedList();

    public AbstractAjwafYaeiListedVocalizer() {
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
        appliedRoots.add("���");
    }

    protected List getAppliedRoots() {
        return appliedRoots;
    }

    protected int getNoc() {
        return 4;
    }

}
