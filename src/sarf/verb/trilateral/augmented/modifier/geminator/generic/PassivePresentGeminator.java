package sarf.verb.trilateral.augmented.modifier.geminator.generic;

import java.util.*;
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
public class PassivePresentGeminator extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public PassivePresentGeminator() {

        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (��������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (���������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (��������)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�","�C3��"));// EX: (�� �������)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�","�C3��"));// EX: (�� ��������� ���������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (����������� ������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (����������ǡ ������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (����������� ������)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�","�C3��"));// EX: (�� ���������� ������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (���������� ���������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (�� ��������� �� ��������� �� �������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (����������)

    }

    public List getSubstitutions() {
        return substitutions;
    }
}
