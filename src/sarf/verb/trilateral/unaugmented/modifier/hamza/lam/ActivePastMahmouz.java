package sarf.verb.trilateral.unaugmented.modifier.hamza.lam;

import java.util.*;
import sarf.verb.trilateral.unaugmented.modifier.hamza.*;
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
public class ActivePastMahmouz extends AbstractLamMahmouz {
    private List substitutions = new ArrayList();

    public ActivePastMahmouz() {
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (������� �����)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (������ ������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������ǡ)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (������ ��������� �������ǡ ������ ������ ������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (������ ��������� �������ǡ ������ ������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����ǡ ����� )
    }

    public List getSubstitutions() {
        return substitutions;
    }
}
