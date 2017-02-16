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
public class LamMahmouz extends AbstractLamMahmouz {
    List substitutions = new LinkedList();

    public LamMahmouz() {
        substitutions.add(new InfixSubstitution("����","���"));// EX: (������� )
        substitutions.add(new InfixSubstitution("����","��"));// EX: (������ʡ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (����ɡ ������� )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�����ɡ )
        substitutions.add(new InfixSubstitution("�����","�����"));// EX: (��������� )
        substitutions.add(new InfixSubstitution("��","��"));// EX: (����ġ )
        substitutions.add(new SuffixSubstitution("����","����"));// EX: (������)
        substitutions.add(new SuffixSubstitution("����","����"));// EX: (������)
        substitutions.add(new SuffixSubstitution("����","����"));// EX: (������)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (������)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (������ǡ ������)
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
