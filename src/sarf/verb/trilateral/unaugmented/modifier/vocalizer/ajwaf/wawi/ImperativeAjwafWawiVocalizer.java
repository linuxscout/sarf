package sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.unaugmented.*;
import sarf.verb.trilateral.unaugmented.modifier.*;
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
public class ImperativeAjwafWawiVocalizer extends AbstractAjwafWawiVocalizer {
    private List substitutions = new LinkedList();

    public ImperativeAjwafWawiVocalizer() {
        substitutions.add(new ExpressionInfixSubstitution("�C1���C3�","C1��C3�"));// EX: (������ǡ �������� ����ǡ �����)
        substitutions.add(new ExpressionInfixSubstitution("�C1���C3�","C1��C3�"));// EX: (����� ������� ���� ����)
        substitutions.add(new ExpressionInfixSubstitution("�C1���C3�","C1��C3�"));// EX: (���ǡ ������� ���ǡ ����)
        substitutions.add(new ExpressionInfixSubstitution("�C1���C3�","C1�C3�"));// EX: (����� ����������� ����� ����)
        substitutions.add(new ExpressionInfixSubstitution("�C1���C3�","C1�C3�"));// EX: (���� �����)
    }

    public List getSubstitutions() {
        return substitutions;
    }

}
