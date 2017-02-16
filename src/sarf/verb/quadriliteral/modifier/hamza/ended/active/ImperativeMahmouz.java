package sarf.verb.quadriliteral.modifier.hamza.ended.active;

import java.util.*;

import sarf.verb.quadriliteral.substitution.*;

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
public class ImperativeMahmouz extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public ImperativeMahmouz() {
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (��������� �����������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (���� ����������� )
        substitutions.add(new SuffixSubstitution("���", "���")); // EX: (���� ����������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����� ����������ǡ )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� ������������ )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� �����������ǡ )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
