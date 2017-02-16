package sarf.verb.trilateral.augmented.modifier.hamza.lam.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.hamza.lam.*;

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
public class ImperativeMahmouz extends AbstractLamMahmouz {

    private List substitutions = new LinkedList();

    public ImperativeMahmouz() {
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������ǡ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������ǡ )
        substitutions.add(new InfixSubstitution("��","��"));// EX: (��������� ������� ���������� ��������� ��������� ������������ ������� )
        substitutions.add(new InfixSubstitution("��","��"));// EX: (������ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������� )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������� ��������� �������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������ǡ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������ǡ )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (���������� ����������� )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (���������ǡ )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (����������ǡ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������ǡ )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
