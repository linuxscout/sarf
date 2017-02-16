package sarf.gerund.modifier.trilateral.unaugmented.meem;

import java.util.*;

import sarf.noun.trilateral.unaugmented.modifier.*;
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
public class Geminator extends AbstractGeminator {
    List substitutions = new LinkedList();

    public Geminator() {
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3", "�C3�")); // EX: (������� )
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3", "�C3�")); // EX: (������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
