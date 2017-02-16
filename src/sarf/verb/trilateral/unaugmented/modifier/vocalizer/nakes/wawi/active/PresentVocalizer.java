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
public class PresentVocalizer extends SubstitutionsApplier implements IUnaugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public PresentVocalizer() {

        substitutions.add(new SuffixSubstitution("���","��"));// EX: (���� ������� ���� ���� ���� )
        substitutions.add(new SuffixSubstitution("���","�"));// EX: (�� ������� �� ������� ������� ������� ����)
        substitutions.add(new InfixSubstitution("���","�"));// EX: (���� ����� ����� ����� ������� ���������)
        substitutions.add(new InfixSubstitution("����","���"));// EX: (���� ����� ����� ����� ����� �����)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (���� ����� ����� ����� ����� ����� )
        substitutions.add(new InfixSubstitution("����","��"));// EX: (���� ��������� )
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (���� ���� ���� )
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (�� ���� �� ���� �� ���� )
        substitutions.add(new SuffixSubstitution("���","�"));// EX: (�� ���� �� ������ �� ������)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (������ ���������� �� ����ǡ �� ����ǡ ������ )
        substitutions.add(new InfixSubstitution("����","���"));// EX: (���� ����� ���������� �� ��������� �� ��������� ���������� )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (���� ������� �����������)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (���� ������� ���������� �� ������ �� ����� �����)
        substitutions.add(new InfixSubstitution("����","���"));// EX: (���� �������� ���������� �� ������ǡ �� ������ǡ ����� )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (���� �������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());
        return ((kov == 21 || kov == 22 || kov == 23) && (noc == 1)) ||
                ((kov == 21 || kov == 23) && (noc == 5)) ||
                ((kov == 22 || kov == 23) && (noc == 3)) ||
                (kov == 23 && noc == 4);
    }
}
