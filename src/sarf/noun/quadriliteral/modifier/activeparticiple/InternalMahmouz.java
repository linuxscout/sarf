package sarf.noun.quadriliteral.modifier.activeparticiple;

import java.util.*;

import sarf.noun.*;
import sarf.verb.quadriliteral.*;
import sarf.verb.quadriliteral.modifier.*;
import sarf.verb.quadriliteral.substitution.*;

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
public class InternalMahmouz extends QuadrilateralNounSubstitutionApplier implements IQuadrilateralModifier {
    List substitutions = new LinkedList();

    public InternalMahmouz() {
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (���������� ������������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (���������� ������������ �����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        return conjugationResult.getRoot().getC2() == '�' || conjugationResult.getRoot().getC3() == '�';
    }
}
