package sarf.verb.trilateral.unaugmented.modifier.hamza.faa;

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
public class ActivePresentMahmouz extends AbstractFaaMahmouz {
    private List substitutions = new ArrayList();

    public ActivePresentMahmouz() {
        substitutions.add(new InfixSubstitution("����", "�")); // EX: (����)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (��������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�����ȡ �������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (������ �������)
    }

    public List getSubstitutions() {
        return substitutions;
    }
}
