package sarf.noun.trilateral.unaugmented.assimilate;

import java.util.*;
import sarf.noun.*;

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
public class AssimilateFormulaCSuffixContainer implements INounSuffixContainer{
    private static AssimilateFormulaCSuffixContainer instance = new AssimilateFormulaCSuffixContainer();
    //���� ������
    private ArrayList indefiniteSuffixList = new ArrayList(18);
    //���� �������
    private ArrayList definiteSuffixList = new ArrayList(18);
    //���� �������
    private ArrayList annexedSuffixList = new ArrayList(18);

    //���� ��� ���� ����� ���� ������ �� �����
    private String prefix = "";
    //���� ������� �������� ����� ������
    private ArrayList currentSuffixList = indefiniteSuffixList ;

    private AssimilateFormulaCSuffixContainer() {
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("����");
        indefiniteSuffixList.add("����");
        indefiniteSuffixList.add("�������");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("����");
        indefiniteSuffixList.add("�����");
        indefiniteSuffixList.add("��������");
        indefiniteSuffixList.add("��");
        indefiniteSuffixList.add("��");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("����");
        indefiniteSuffixList.add("�����");
        indefiniteSuffixList.add("��������");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("�");


        definiteSuffixList.add("�");
        definiteSuffixList.add("����");
        definiteSuffixList.add("����");
        definiteSuffixList.add("�������");
        definiteSuffixList.add("�");
        definiteSuffixList.add("�");
        definiteSuffixList.add("�");
        definiteSuffixList.add("����");
        definiteSuffixList.add("�����");
        definiteSuffixList.add("��������");
        definiteSuffixList.add("�");
        definiteSuffixList.add("�");
        definiteSuffixList.add("�");
        definiteSuffixList.add("����");
        definiteSuffixList.add("�����");
        definiteSuffixList.add("��������");
        definiteSuffixList.add("�");
        definiteSuffixList.add("�");



        annexedSuffixList.add("�");
        annexedSuffixList.add("����");
        annexedSuffixList.add("��");
        annexedSuffixList.add("�����");
        annexedSuffixList.add("�");
        annexedSuffixList.add("�");
        annexedSuffixList.add("�");
        annexedSuffixList.add("����");
        annexedSuffixList.add("���");
        annexedSuffixList.add("������");
        annexedSuffixList.add("�");
        annexedSuffixList.add("�");
        annexedSuffixList.add("�");
        annexedSuffixList.add("����");
        annexedSuffixList.add("���");
        annexedSuffixList.add("������");
        annexedSuffixList.add("�");
        annexedSuffixList.add("�");

    }

    public void selectDefiniteMode() {
        prefix = "��";
        currentSuffixList = definiteSuffixList;
    }

    public void selectInDefiniteMode() {
        prefix = "";
        currentSuffixList = indefiniteSuffixList;
    }

    public void selectAnnexedMode() {
        prefix = "";
        currentSuffixList = annexedSuffixList;
    }

    public static AssimilateFormulaCSuffixContainer getInstance() {
        return instance;
    }

    public String getPrefix() {
        return prefix;
    }

    public String get(int index) {
        return (String) currentSuffixList.get(index);
    }

}
