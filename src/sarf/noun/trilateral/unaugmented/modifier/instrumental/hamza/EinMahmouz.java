package sarf.noun.trilateral.unaugmented.modifier.instrumental.hamza;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.noun.trilateral.unaugmented.modifier.*;

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

        substitutions.add(new InfixSubstitution("�����","����"));// EX: (�������)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (�����)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (������ȡ ��������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�����ϡ ������ɡ ������)

    }


    public List getSubstitutions() {
        return substitutions;
    }
}
