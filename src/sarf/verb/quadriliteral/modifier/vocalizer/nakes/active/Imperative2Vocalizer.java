package sarf.verb.quadriliteral.modifier.vocalizer.nakes.active;

import java.util.*;
import sarf.verb.quadriliteral.substitution.*;
import sarf.verb.quadriliteral.modifier.*;
import sarf.verb.quadriliteral.*;

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
public class Imperative2Vocalizer extends SubstitutionsApplier implements IQuadrilateralModifier {

    private List substitutions = new LinkedList();

    public Imperative2Vocalizer() {
        substitutions.add(new SuffixSubstitution("��", "")); // EX: (��������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� ����������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� �����������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� �������������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        if (conjugationResult.getRoot().getC4() == '�' && conjugationResult.getFormulaNo() == 1) {
            return true;
        }
        return false;

    }
}
