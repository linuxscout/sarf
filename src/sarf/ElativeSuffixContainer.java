package sarf.noun.trilateral.unaugmented.elative;

import java.util.*;
import sarf.noun.*;
import sarf.util.*;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohta\u00E6sseb Billah
 * @version 1.0
 */
public class ElativeSuffixContainer implements INounSuffixContainer{
    private static ElativeSuffixContainer instance = new ElativeSuffixContainer();
    //���� �������
    private ArrayList definiteSuffixList = new ArrayList(18);
    //���� ����� ��� ������� ������ ��� �����
    private ArrayList annexedDefiniteSuffixList = new ArrayList(18);

    // ���� ����� ��� ������� ������ ��� ����
    private ArrayList annexedIndefiniteSuffixList = new ArrayList(18);
    //���� ����� ��� ������� ��� ������
    //notAnnexedSuffixList is same as annexedIndefiniteSuffixList
    private ArrayList notAnnexedSuffixList = new ArrayList(18);

    //���� ��� ���� ����� ���� ������ �� �����
    private String prefix = "";
    //���� ������� �������� ����� ������
    private ArrayList currentSuffixList = annexedIndefiniteSuffixList ;

    private ElativeSuffixContainer() {
        annexedIndefiniteSuffixList.add(ArabCharUtil.DAMMA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.DAMMA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.DAMMA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.DAMMA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.DAMMA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.DAMMA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.FATHA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.FATHA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.FATHA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.FATHA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.FATHA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.FATHA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.KASRA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.KASRA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.KASRA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.KASRA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.KASRA);
        annexedIndefiniteSuffixList.add(ArabCharUtil.KASRA);

        definiteSuffixList.add("�");
        definiteSuffixList.add("��");
        definiteSuffixList.add("����");
        definiteSuffixList.add("������");
        definiteSuffixList.add("����");
        definiteSuffixList.add("������");
        definiteSuffixList.add("�");
        definiteSuffixList.add("��");
        definiteSuffixList.add("�����");
        definiteSuffixList.add("�������");
        definiteSuffixList.add("����");
        definiteSuffixList.add("������");
        definiteSuffixList.add("�");
        definiteSuffixList.add("��");
        definiteSuffixList.add("�����");
        definiteSuffixList.add("�������");
        definiteSuffixList.add("����");
        definiteSuffixList.add("������");


        annexedDefiniteSuffixList.add(ArabCharUtil.DAMMA);
        annexedDefiniteSuffixList.add("��");
        annexedDefiniteSuffixList.add("��");
        annexedDefiniteSuffixList.add("����");
        annexedDefiniteSuffixList.add("��");
        annexedDefiniteSuffixList.add("������");
        annexedDefiniteSuffixList.add(ArabCharUtil.FATHA);
        annexedDefiniteSuffixList.add("��");
        annexedDefiniteSuffixList.add("���");
        annexedDefiniteSuffixList.add("�����");
        annexedDefiniteSuffixList.add("��");
        annexedDefiniteSuffixList.add("������");
        annexedDefiniteSuffixList.add(ArabCharUtil.KASRA);
        annexedDefiniteSuffixList.add("��");
        annexedDefiniteSuffixList.add("���");
        annexedDefiniteSuffixList.add("�����");
        annexedDefiniteSuffixList.add("��");
        annexedDefiniteSuffixList.add("������");

        notAnnexedSuffixList.add(ArabCharUtil.DAMMA);
        notAnnexedSuffixList.add(ArabCharUtil.DAMMA);
        notAnnexedSuffixList.add(ArabCharUtil.DAMMA);
        notAnnexedSuffixList.add(ArabCharUtil.DAMMA);
        notAnnexedSuffixList.add(ArabCharUtil.DAMMA);
        notAnnexedSuffixList.add(ArabCharUtil.DAMMA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
        notAnnexedSuffixList.add(ArabCharUtil.FATHA);
    }

    /**
     * ������ ������ ���
     */
    public void selectDefiniteMode() {
        prefix = "��";
        currentSuffixList = definiteSuffixList;
    }

    /**
     * ������ ������ ��� ����
     */
    public void selectInDefiniteMode() {
        prefix = "";
        currentSuffixList = annexedIndefiniteSuffixList;
    }

    /**
     * ������ ����� ����
     */
    public void selectNotAnnexedMode() {
        prefix = "";
        currentSuffixList = notAnnexedSuffixList;
    }


    /**
     * ������ ������ ��� �����
     */
    public void selectAnnexedMode() {
        prefix = "";
        currentSuffixList = annexedDefiniteSuffixList;
    }

    public static ElativeSuffixContainer getInstance() {
        return instance;
    }

    public String getPrefix() {
        return prefix;
    }

    public String get(int index) {
        return (String) currentSuffixList.get(index);
    }

    public boolean isAnnexed() {
        return currentSuffixList == annexedDefiniteSuffixList;
    }

    public boolean isDefinite() {
        return currentSuffixList == definiteSuffixList;
    }

    public boolean isIndefinite() {
        return currentSuffixList == annexedIndefiniteSuffixList;
    }

    public boolean isNotAnnexed() {
        return currentSuffixList == notAnnexedSuffixList;
    }

}
