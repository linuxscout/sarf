package sarf.verb.trilateral.augmented.imperative.formula;

import sarf.verb.trilateral.augmented.*;
import sarf.util.ArabCharUtil;
import sarf.verb.trilateral.augmented.imperative.*;

/**
 * <p>Title: Sarf</p>
 *
 * <p>Description: ������ �������</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: </p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class AugmentedImperativeVerb8 extends AugmentedImperativeVerb {
    public AugmentedImperativeVerb8(AugmentedTrilateralRoot root,  String lastDim, String connectedPronoun) {
        super(root, lastDim, connectedPronoun);
    }

    /**
     * form
     *
     * @return String
     * @todo Implement this sarf.trilingual.augmented.imperative.AugmentedImperativeVerb
     *   method
     */
    public String form() {
        return "�"+ArabCharUtil.FATHA+root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.SHADDA+ArabCharUtil.FATHA+root.getC3()+lastDim+connectedPronoun;
    }
}
