package sarf.noun.trilateral.unaugmented.modifier.exaggeration.vocalizer;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.unaugmented.modifier.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.*;

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
public class I1Vocalizer extends TrilateralNounSubstitutionApplier implements IUnaugmentedTrilateralNounModificationApplier {
    List substitutions = new LinkedList();

    public I1Vocalizer() {
        substitutions.add(new InfixSubstitution("���","�"));// EX: (��� ����)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (����� �������)
        substitutions.add(new InfixSubstitution("���","�"));// EX: (����� ��� ����)
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (��� ������ )
        substitutions.add(new SuffixSubstitution("���","���"));// EX: (����� ������� )
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (����� ��� ������ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������� ������� )
        substitutions.add(new InfixSubstitution("���","�"));// EX: (������ )
        substitutions.add(new InfixSubstitution("���","�"));// EX: (������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        String nounFormula = conjugationResult.getNounFormula();
        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());

        return nounFormula.equals("�����") && (kov == 23 && (noc == 1 || noc == 3 || noc == 5));
    }

}
