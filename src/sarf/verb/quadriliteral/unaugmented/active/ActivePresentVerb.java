package sarf.verb.quadriliteral.unaugmented.active;

import sarf.util.*;
import sarf.verb.quadriliteral.*;
import sarf.verb.quadriliteral.unaugmented.*;


/**
 *����� ������� ������� ������
 * <p>Title: Sarf</p>
 * <p>Description: ������ �������</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: </p>
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class ActivePresentVerb {
    private UnaugmentedQuadriliteralRoot root;

    //��� �������
    private String cp;
    //���� ��� ����� ��� ������
    private String lastDpr;

    //������ ������� ������ ����� ��� ������
    private String connectedPronoun;

    public ActivePresentVerb(UnaugmentedQuadriliteralRoot root, String cp, String lastDpr, String connectedPronoun) {
        this.root = root;
        this.cp = cp;
        this.lastDpr = lastDpr;
        this.connectedPronoun = connectedPronoun;
    }

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public UnaugmentedQuadriliteralRoot getRoot() {
        return root;
    }

    public String getlastDpr() {
        return lastDpr;
    }

    public String getCp() {
        return cp;
    }

    public String toString() {
        return cp+ArabCharUtil.DAMMA+root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.SKOON+root.getC3()+ArabCharUtil.KASRA+root.getC4()+lastDpr+connectedPronoun;
    }

}
