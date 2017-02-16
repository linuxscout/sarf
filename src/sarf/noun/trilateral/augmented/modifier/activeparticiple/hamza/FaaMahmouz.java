package sarf.noun.trilateral.augmented.modifier.activeparticiple.hamza;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.augmented.modifier.*;

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
public class FaaMahmouz extends AbstractFaaMahmouz {
    List substitutions = new LinkedList();

    public FaaMahmouz() {

        substitutions.add(new InfixSubstitution("����","��"));// EX: (��������)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (����������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (����������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (�������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (�������� ��������� ���������)

    }


    public List getSubstitutions() {
        return substitutions;
    }
}
