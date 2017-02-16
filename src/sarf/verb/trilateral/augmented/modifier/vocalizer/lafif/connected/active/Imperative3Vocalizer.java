package sarf.verb.trilateral.augmented.modifier.vocalizer.lafif.connected.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;
import sarf.verb.trilateral.augmented.*;

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
public class Imperative3Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Imperative3Vocalizer() {
        substitutions.add(new SuffixSubstitution("��", "")); // EX: (����� ����� ������� �������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� ��������� ��������� ���������� ���������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� ��������ǡ ���������ǡ ���������ǡ ����������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (���� ����������� ���������� ������������ ������������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();
        AugmentedTrilateralRoot root = conjugationResult.getRoot();
        return (root.getC2() == '�' || root.getC2() == '�') && root.getC3() == '�' && (kov == 27 || kov == 28) && (formulaNo == 7 || formulaNo == 8);
    }
}
