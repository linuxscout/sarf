package sarf.gerund.modifier.trilateral.augmented.standard.hamza;

import java.util.*;

import sarf.noun.trilateral.augmented.modifier.*;
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
public class EinMahmouz extends AbstractEinMahmouz {
    List substitutions = new LinkedList();

    public EinMahmouz() {
        substitutions.add(new InfixSubstitution("����","����"));// EX: (��������)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (����ȡ �������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (����������)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (���� ������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (����� �����̡ �����ӡ ������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (����ӡ ������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (����� �����)
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
