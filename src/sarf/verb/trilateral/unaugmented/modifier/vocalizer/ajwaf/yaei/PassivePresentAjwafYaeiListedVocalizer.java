package sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei;

import sarf.verb.trilateral.unaugmented.modifier.vocalizer.ListedVocalizer;
import java.util.List;
import java.util.LinkedList;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.AbstractAjwafYaeiListedVocalizer;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description:��� ������ ��� �����    </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class PassivePresentAjwafYaeiListedVocalizer extends AbstractAjwafYaeiListedVocalizer {
    private List substitutions = new LinkedList();

    public PassivePresentAjwafYaeiListedVocalizer() {
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (����ڡ ����ʡ �� �������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (��������� ������� �� ������ )
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (������� ������� �� ������ ���������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (�������� �������� �� ������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (���� ������� �� �������)
    }


    public List getSubstitutions() {
        return substitutions;
    }


}
