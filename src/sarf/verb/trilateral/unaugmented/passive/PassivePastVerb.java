package sarf.verb.trilateral.unaugmented.passive;

import sarf.util.ArabCharUtil;
import sarf.verb.trilateral.unaugmented.*;

/**
 * ���� ��� ���� ����� �� ���� ������ ������ ������� ������� ������ �������
 * �������� �� ������ ������� ������� ����� ��� ������
 * <p>Title: Sarf</p>
 * <p>Description: ������ �������</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: </p>
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class PassivePastVerb {
    private UnaugmentedTrilateralRoot root;

    //���� ��� ����� ��� ������  ���
    private static final String dpa1 = ArabCharUtil.DAMMA;

    //���� ��� ����� ��� ������ ����
    private static final String dpa2 = ArabCharUtil.KASRA;

    //���� ��� ����� ��� ������
    private String lastDpa;

    //������ ������� ������ ����� ��� ������
    private String connectedPronoun;

    public PassivePastVerb(UnaugmentedTrilateralRoot root, String lastDpa, String connectedPronoun) {
        this.root = root;
        this.lastDpa = lastDpa;
        this.connectedPronoun = connectedPronoun;
    }

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public UnaugmentedTrilateralRoot getRoot() {
        return root;
    }

    public String getLastDpa() {
        return lastDpa;
    }

    public String toString() {
        return root.getC1()+dpa1+root.getC2()+dpa2+root.getC3()+lastDpa+connectedPronoun;
    }

}
