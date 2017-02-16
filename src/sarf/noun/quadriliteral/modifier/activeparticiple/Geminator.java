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
public class Geminator extends QuadrilateralNounSubstitutionApplier implements IQuadrilateralModifier {
    List substitutions = new LinkedList();

    public Geminator() {
        substitutions.add(new ExpressionInfixSubstitution("�C4�C4","�C4�"));// EX: (�� �����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        if (conjugationResult.getFormulaNo() == 3)
            return true;
        return false;
    }
}
