package sarf;

import java.util.*;

/**
 * <p>Title: </p>
 *
 * <p>Description: ����� ����� ����� ��������   </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class SeparatedPronounsContainer {
    private static SeparatedPronounsContainer instance = new SeparatedPronounsContainer();
    private List pronouns = new ArrayList(13);

    private SeparatedPronounsContainer() {
        pronouns.add("���");
        pronouns.add("���");
        pronouns.add("����");
        pronouns.add("����");
        pronouns.add("�����");
        pronouns.add("����");
        pronouns.add("������");
        pronouns.add("��");
        pronouns.add("��");
        pronouns.add("���(��)");
        pronouns.add("���(��)");
        pronouns.add("��");
        pronouns.add("����");
    }

    public static SeparatedPronounsContainer getInstance() {
        return instance;
    }

    public List getPronouns() {
        return pronouns;
    }

}
