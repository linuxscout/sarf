package sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf;

import sarf.verb.trilateral.unaugmented.modifier.vocalizer.ListedVocalizer;
import java.util.List;
import java.util.LinkedList;
import sarf.verb.trilateral.Substitution.*;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description:��� ������ ��� �����
 * * ��� ��� ������� ������ ������ �� ��� ����� ������ ������������             </p>
 * </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public abstract class AbstractAjwafWawiListedVocalizer extends ListedVocalizer {
    private List appliedRoots = new LinkedList();

    public AbstractAjwafWawiListedVocalizer() {
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
