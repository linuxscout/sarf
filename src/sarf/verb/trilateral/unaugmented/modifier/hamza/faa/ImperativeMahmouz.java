package sarf.verb.trilateral.unaugmented.modifier.hamza.faa;

import java.util.*;
import sarf.verb.trilateral.unaugmented.modifier.hamza.*;
import sarf.verb.trilateral.Substitution.*;

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
public class ImperativeMahmouz extends AbstractFaaMahmouz {
    private List substitutions = new ArrayList();

    public ImperativeMahmouz() {
        substitutions.add(new ExpressionInfixSubstitution("���C2�", "���C2�")); // EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("���C2�", "���C2�")); // EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("���C2�", "���C2�")); // EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("��C3","��C3"));// EX: (����)
        substitutions.add(new PrefixSubstitution("��", "��")); // EX: (���� ����� ���)
        substitutions.add(new PrefixSubstitution("��","��"));// EX: (���� �����)
    }

    public List getSubstitutions() {
        return substitutions;
    }
}
