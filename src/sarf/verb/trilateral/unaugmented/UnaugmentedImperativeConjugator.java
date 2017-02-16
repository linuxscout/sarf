package sarf.verb.trilateral.unaugmented;

import java.util.*;

import sarf.*;

/**
 * ���� ��� ���� ������ ������� �������� ������� �� ���� �����
 * <p>Title: Sarf</p>
 * <p>Description: ������ �������</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: </p>
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class UnaugmentedImperativeConjugator {

    private static UnaugmentedImperativeConjugator instance = new UnaugmentedImperativeConjugator();

    public static UnaugmentedImperativeConjugator getInstance() {
        return instance;
    }

    private UnaugmentedImperativeConjugator() {
    }

    /**
     * ����� ���� ����� ����� ��� ������
     * @param pronounIndex int
     * @param root TrilateralVerb
     * @return PresentConjugation
     */
    public ImperativeVerb createVerb(int pronounIndex, UnaugmentedTrilateralRoot root) {
        String dpr2 = PresentConjugationDataContainer.getInstance().getDpr2(root);
        String lastDim = ImperativeConjugationDataContainer.getInstance().getLastDim(pronounIndex);
        String connectedPronoun = ImperativeConjugationDataContainer.getInstance().getConnectedPronoun(pronounIndex);
        if (lastDim == "" && connectedPronoun == "") return null;

        return new ImperativeVerb(root, dpr2, lastDim, connectedPronoun);
    }

    /**
     * ����� ���� ����� �����  ������
     * @param pronounIndex int
     * @param root TrilateralVerb
     * @return PresentConjugation
     */
    public ImperativeVerb createEmphasizedVerb(int pronounIndex, UnaugmentedTrilateralRoot root) {
        String dpr2 = PresentConjugationDataContainer.getInstance().getDpr2(root);
        String lastDim = ImperativeConjugationDataContainer.getInstance().getEmphasizedLastDim(pronounIndex);
        String connectedPronoun = ImperativeConjugationDataContainer.getInstance().getEmphasizedConnectedPronoun(pronounIndex);
        if (lastDim == "" && connectedPronoun == "") return null;

        return new ImperativeVerb(root, dpr2, lastDim, connectedPronoun);
    }



    /**
     * ����� ����� ����� ��� ��� ����� ����� ��� �������
     * ����� ��� ������
     * @param root TripleVerb
     * @return List
     */
    public List createVerbList(UnaugmentedTrilateralRoot root) {
        List result = new LinkedList();
        for (int i = 0; i < 13; i++) {
            ImperativeVerb conj = createVerb(i, root);
            result.add(conj);
        }

        return result;
    }

    /**
    * ����� ����� ����� ��� ��� ����� ����� ��� �������
    * �����  ������
    * @param root TripleVerb
    * @return List
    */
   public List createEmphasizedVerbList(UnaugmentedTrilateralRoot root) {
       List result = new LinkedList();
       for (int i = 0; i < 13; i++) {
           ImperativeVerb conj = createEmphasizedVerb(i, root);
           result.add(conj);
       }

       return result;
   }


}
