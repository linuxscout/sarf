package sarf;

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
public class NounLamAlefModifier extends SubstitutionsApplier{
    protected static List appliedProunounsIndecies = new ArrayList(13);
    static {
        for (int i=0; i<18; i++) {
            appliedProunounsIndecies.add(i+1 +"");
        }
    }


    List substitutions = new LinkedList();

    private NounLamAlefModifier() {

        substitutions.add(new InfixSubstitution("���","��"));// EX: (����)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (���������)
        substitutions.add(new InfixSubstitution("���","��"));// EX: (����� �������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�����)

    }

    private static NounLamAlefModifier instance = new NounLamAlefModifier();

    public static NounLamAlefModifier getInstance() {
        return instance;
    }

    public void apply(sarf.verb.trilateral.unaugmented.ConjugationResult conjResult) {
        apply(conjResult.getFinalResult(), null);
        //�� ���� ��� ��� ���� ������ �� ����� ���
        apply(conjResult.getFinalResult(), null);
    }

    public void apply(sarf.verb.trilateral.augmented.ConjugationResult conjResult) {
        apply(conjResult.getFinalResult(), null);
        //�� ���� ��� ��� ���� ������ �� ����� ���
        apply(conjResult.getFinalResult(), null);
    }


    public void apply(sarf.verb.quadriliteral.ConjugationResult conjResult) {
        apply(conjResult.getFinalResult(), null);
        //�� ���� ��� ��� ���� ������ �� ����� ���
        apply(conjResult.getFinalResult(), null);
    }

    public List getSubstitutions() {
        return substitutions;
    }

    protected List getAppliedPronounsIndecies() {
        return appliedProunounsIndecies;
    }


}
