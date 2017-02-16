package sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.unaugmented.ConjugationResult;
import sarf.verb.trilateral.unaugmented.modifier.vocalizer.*;
import sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.*;

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
public class ActivePresentAjwafWawiVocalizer extends AbstractAjwafWawiVocalizer {
    private List substitutions = new LinkedList();

    public ActivePresentAjwafWawiVocalizer() {
        substitutions.add(new ExpressionInfixSubstitution("���C3�", "��C3�")); // EX: (�������� ����� ����)
        substitutions.add(new ExpressionInfixSubstitution("���C3�", "��C3�")); // EX: (������ �� ������ ������ ������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�", "��C3�")); // EX: (������ �� ����� ������ ������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�", "�C3�")); // EX: (�������� �� ������� ������� ������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�", "�C3�")); // EX: (���� ������� ��� �����)
    }

    public List getSubstitutions() {
        return substitutions;
    }

}
