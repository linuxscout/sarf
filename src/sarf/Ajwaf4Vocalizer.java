package sarf.noun.trilateral.unaugmented.modifier.activeparticiple.vocalizer;

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
public class Ajwaf4Vocalizer extends TrilateralNounSubstitutionApplier implements IUnaugmentedTrilateralNounModificationApplier {
    List substitutions = new LinkedList();

    public Ajwaf4Vocalizer() {

        substitutions.add(new InfixSubstitution("�����","���"));// EX: (��� ����)
        substitutions.add(new InfixSubstitution("�����","���"));// EX: (����� ��� ����)
        substitutions.add(new SuffixSubstitution("�����","����"));// EX: (��� ������� )
        substitutions.add(new SuffixSubstitution("�����","����"));// EX: (����� ��� ������� )
        substitutions.add(new InfixSubstitution("�����","���"));// EX: (������� )
        substitutions.add(new InfixSubstitution("�����","���"));// EX: (������� )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (������ �������� ����ɡ �����ǡ ����� ��������)

    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());

        return kov == 19 && (noc == 2 || noc == 4);
    }
}
