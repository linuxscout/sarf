package sarf.verb.quadriliteral.modifier;

import sarf.verb.quadriliteral.ConjugationResult;
import java.util.*;
import sarf.*;
import sarf.verb.quadriliteral.substitution.SubstitutionsApplier;

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
public class Geminator {
    //�������  �  ������� ����� ����� �������� ������ ������ ����� �������� ������ ���
    private Map modifiersMap = new HashMap();

    public Geminator() {
        List activePastList = new LinkedList();
        List passivePastList = new LinkedList();
        List activePresentList = new LinkedList();
        List passivePresentList = new LinkedList();
        List imperativeList = new LinkedList();

        //��� �����  ������  ������� ������� ������� ������ �� ������ �������� ������
        modifiersMap.put(SystemConstants.PAST_TENSE + "true", activePastList);
        modifiersMap.put(SystemConstants.PRESENT_TENSE + "true", activePresentList);
        modifiersMap.put(SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE + "true", imperativeList);
        modifiersMap.put(SystemConstants.EMPHASIZED_IMPERATIVE_TENSE + "true", imperativeList);
        modifiersMap.put(SystemConstants.PAST_TENSE + "false", passivePastList);
        modifiersMap.put(SystemConstants.PRESENT_TENSE + "false", passivePresentList);

        //����� ������ ������ ������
        activePastList.add(new sarf.verb.quadriliteral.modifier.geminator.active.Past2Geminator());
        activePastList.add(new sarf.verb.quadriliteral.modifier.geminator.active.Past3Geminator());
        activePastList.add(new sarf.verb.quadriliteral.modifier.geminator.active.Past1Geminator());

        //����� ������ ������ ������
        passivePastList.add(new sarf.verb.quadriliteral.modifier.geminator.passive.Past2Geminator());
        passivePastList.add(new sarf.verb.quadriliteral.modifier.geminator.passive.Past3Geminator());
        passivePastList.add(new sarf.verb.quadriliteral.modifier.geminator.passive.Past1Geminator());

        //����� ������� ������ ������
        activePresentList.add(new sarf.verb.quadriliteral.modifier.geminator.active.Present2Geminator());
        activePresentList.add(new sarf.verb.quadriliteral.modifier.geminator.active.Present1Geminator());

        //����� ������� ������ ������
        passivePresentList.add(new sarf.verb.quadriliteral.modifier.geminator.passive.Present2Geminator());
        passivePresentList.add(new sarf.verb.quadriliteral.modifier.geminator.passive.Present1Geminator());

        //����� �����
        imperativeList.add(new sarf.verb.quadriliteral.modifier.geminator.active.Imperative2Geminator());
        imperativeList.add(new sarf.verb.quadriliteral.modifier.geminator.active.Imperative1Geminator());
    }

    /**
     * ����� ������� ��� ������ ���� �� ����� �� ��� ������� �� ������
     * �� �� ���� �� ��� �� �������
     * @param tense String
     * @param active boolean
     * @param conjResult ConjugationResult
     */
    public void apply(String tense, boolean active, ConjugationResult conjResult) {
        List modifiers = (List) modifiersMap.get(tense+active);
        Iterator iter = modifiers.iterator();
        while (iter.hasNext()) {
            IQuadrilateralModifier modifier = (IQuadrilateralModifier) iter.next();
            if (modifier.isApplied(conjResult)) {
                ((SubstitutionsApplier)modifier).apply(conjResult.getFinalResult(), conjResult.getRoot());
                break;
            }
        }
    }

}
