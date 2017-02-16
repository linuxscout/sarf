package sarf.noun.trilateral.unaugmented.assimilate.nonstandard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;
import sarf.noun.trilateral.unaugmented.assimilate.*;
import sarf.noun.INounSuffixContainer;

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
public class NounFormulaE1 extends NounFormula {

    public NounFormulaE1(UnaugmentedTrilateralRoot root, String suffixNo) {
        this.root = root;
        this.suffixNo = Integer.parseInt(suffixNo)+1;
        suffix = AssimilateFormulaE1SuffixContainer.getInstance().get(this.suffixNo-1).replaceAll(" ","");

    }

    //to be used in refection getting the formula name
    public NounFormulaE1() {
    }

    public String form() {
        switch (suffixNo) {
        case 1:
        case 3:
        case 7:
        case 9:
        case 13:
        case 15:
        case 2:
        case 4:
        case 8:
        case 10:
        case 14:
        case 16:
            return root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.SKOON+root.getC3()+ArabCharUtil.FATHA+"��"+suffix;
        }

        return "";
    }

    public String getFormulaName() {
        return "������� / ��������" ;
    }

    protected INounSuffixContainer getNounSuffixContainer() {
        return AssimilateFormulaE1SuffixContainer.getInstance();
    }

}
