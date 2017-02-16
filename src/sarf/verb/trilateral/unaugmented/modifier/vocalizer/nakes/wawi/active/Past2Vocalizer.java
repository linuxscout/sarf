package sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.unaugmented.ConjugationResult;

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
public class Past2Vocalizer extends SubstitutionsApplier implements IUnaugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Past2Vocalizer() {
        substitutions.add(new SuffixSubstitution("���", "��")); // EX: (��� ��� )
        substitutions.add(new InfixSubstitution("�����", "����")); // EX: (�����ǡ �����)
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (����� ����ǡ ����� �����)

    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());
        return (kov == 22) && (noc == 1 || noc == 3);
    }
}
