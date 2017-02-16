package sarf.verb.trilateral.unaugmented.modifier;

import sarf.verb.trilateral.unaugmented.modifier.geminator.*;
import sarf.verb.trilateral.unaugmented.ConjugationResult;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description: This is the facade for gemination subsystem
 * �� ���� ������� �� ����� ������� ��� �������
 *��� ������ �� ������ �������� �� ���� �������
 * </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class Geminator {
    //����� �����
    private GenericGeminator genericGeminator = new GenericGeminator();
    //����� ������� ���� �����
    private NGeminator nGeminator = new NGeminator();
    //����� ������� ���� �����
    private TGeminator tGeminator = new TGeminator();

    public Geminator() {
    }

    /**
     * ����� ������� ��� ������ ���� �� ����� �� ��� ������� �� ������
     * �� �� ���� �� ��� �� �������
     * @param tense String
     * @param active boolean
     * @param conjResult ConjugationResult
     */
    public void apply(String tense, boolean active, ConjugationResult conjResult) {
        if (genericGeminator.isApplied(conjResult))
            genericGeminator.apply(tense, active, conjResult);
        //else
        if (tGeminator.isApplied(conjResult))
            tGeminator.apply(tense, active, conjResult);
        //else
        if (nGeminator.isApplied(conjResult))
            nGeminator.apply(tense, active, conjResult);
    }

}
