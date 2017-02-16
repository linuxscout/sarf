
package sarf.verb.trilateral.unaugmented.modifier;

import sarf.verb.trilateral.unaugmented.ConjugationResult;
import java.util.*;
import sarf.*;
import sarf.verb.trilateral.Substitution.SubstitutionsApplier;

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
public class Vocalizer {
    //�������  �  ������� ����� ����� �������� ������ ������ ����� �������� ������ ���
    private Map vocalizerMap = new HashMap();

    public Vocalizer() {
        List activePastList = new LinkedList();
        List passivePastList = new LinkedList();
        List activePresentList = new LinkedList();
        List passivePresentList = new LinkedList();
        List imperativeList = new LinkedList();

        //��� �����  ������  ������� ������� ������� ������ �� ������ �������� ������
        vocalizerMap.put(SystemConstants.PAST_TENSE + "true", activePastList);
        vocalizerMap.put(SystemConstants.PRESENT_TENSE + "true", activePresentList);
        vocalizerMap.put(SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE + "true", imperativeList);
        vocalizerMap.put(SystemConstants.EMPHASIZED_IMPERATIVE_TENSE + "true", imperativeList);
        vocalizerMap.put(SystemConstants.PAST_TENSE + "false", passivePastList);
        vocalizerMap.put(SystemConstants.PRESENT_TENSE + "false", passivePresentList);

        //����� ������ ������ ������
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi.ActivePastAjwafWawiListedVocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi.ActivePastAjwafWawiVocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei.ActivePastAjwafYaeiListedVocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei.ActivePastAjwafYaeiVocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.active.Past1Vocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.active.Past2Vocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.active.Past3Vocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.active.Past4Vocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.yaei.active.Past1Vocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.yaei.active.Past2Vocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.connected.ActivePast1Vocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.connected.ActivePast2Vocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.ActivePast1Vocalizer());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.ActivePast2Vocalizer());

        //����� ������ ������ ������
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi.PassivePastAjwafWawiListedVocalizer());
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi.PassivePastAjwafWawiVocalizer());
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei.PassivePastAjwafYaeiListedVocalizer());
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei.PassivePastAjwafYaeiVocalizer());
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.passive.PastVocalizer());
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.yaei.passive.PastVocalizer());
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.connected.PassivePastVocalizer());
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.PassivePastVocalizer());

        //����� ������� ������ ������
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi.ActivePresentAjwafWawiListedVocalizer());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi.ActivePresentAjwafWawiVocalizer());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei.ActivePresentAjwafYaeiListedVocalizer());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei.ActivePresentAjwafYaeiVocalizer());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.active.PresentVocalizer());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.yaei.active.PresentVocalizer());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.connected.ActivePresentVocalizer());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.ActivePresent1Vocalizer());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.ActivePresent2Vocalizer());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.ActivePresent3Vocalizer());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.mithal.ActivePrenentVocalizer());

        //����� ������� ������ ������
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi.PassivePresentAjwafWawiListedVocalizer());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi.PassivePresentAjwafWawiVocalizer());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei.PassivePresentAjwafYaeiListedVocalizer());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei.PassivePresentAjwafYaeiVocalizer());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.passive.PresentVocalizer());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.yaei.passive.PresentVocalizer());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.connected.PassivePresentVocalizer());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.WawiPassivePresentVocalizer());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.YaeiPassivePresentVocalizer());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.mithal.WawiPassivePresentVocalizer());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.mithal.YaeiPassivePresentVocalizer());

        //����� �����
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi.ImperativeAjwafWawiListedVocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.wawi.ImperativeAjwafWawiVocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei.ImperativeAjwafYaeiListedVocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.yaei.ImperativeAjwafYaeiVocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.active.ImperativeVocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.yaei.active.ImperativeVocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.connected.ImperativeVocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.Imperative1Vocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.Imperative2Vocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted.Imperative3Vocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.mithal.Imperative1Vocalizer());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.vocalizer.mithal.Imperative2Vocalizer());
    }

    /**
     * ����� ������� ��� ������ ���� �� ����� �� ��� ������� �� ������
     * �� �� ���� �� ��� �� �������
     * @param tense String
     * @param active boolean
     * @param conjResult ConjugationResult
     */
    public void apply(String tense, boolean active, ConjugationResult conjResult) {
        List vocalizers = (List) vocalizerMap.get(tense+active);
        Iterator iter = vocalizers.iterator();
        while (iter.hasNext()) {
            IUnaugmentedTrilateralModifier vocalizer = (IUnaugmentedTrilateralModifier) iter.next();
            if (vocalizer.isApplied(conjResult)) {
                ((SubstitutionsApplier)vocalizer).apply(conjResult.getFinalResult(), conjResult.getRoot());
                break;
            }
        }
    }

}
