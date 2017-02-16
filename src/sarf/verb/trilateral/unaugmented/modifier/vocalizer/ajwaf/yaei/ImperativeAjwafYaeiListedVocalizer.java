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
public class ImperativeAjwafYaeiListedVocalizer extends AbstractAjwafYaeiListedVocalizer {
    private List substitutions = new LinkedList();

    public ImperativeAjwafYaeiListedVocalizer() {
        substitutions.add(new ExpressionInfixSubstitution("�C1���C3�", "C1��C3�"));
        substitutions.add(new ExpressionInfixSubstitution("�C1���C3�", "C1��C3�"));
        substitutions.add(new ExpressionInfixSubstitution("�C1���C3�", "C1��C3�"));
        substitutions.add(new ExpressionInfixSubstitution("�C1���C3�", "C1�C3�"));
    }

    public List getSubstitutions() {
        return substitutions;
    }


}
