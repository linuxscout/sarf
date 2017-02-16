package sarf.ui.controlpane;

import javax.swing.*;
import sarf.ui.*;

import java.awt.*;
import java.awt.event.*;
import sarf.verb.trilateral.augmented.*;

import java.util.List;
import sarf.verb.trilateral.unaugmented.*;
import sarf.verb.quadriliteral.augmented.*;
import sarf.verb.quadriliteral.unaugmented.*;
import sarf.*;
import sarf.verb.quadriliteral.*;
import sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifierListener;

/**S
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
public class ActiveAllVerbSelectionUI extends JPanel implements IControlPane, AugmentedTrilateralModifierListener {
    private SelectionInfo selectionInfo;

    ToggleRenderedButton allBtn = new ToggleRenderedButton("«·ﬂ·");
    ToggleRenderedButton pastBtn = new ToggleRenderedButton("«·„«÷Ì");
    
    ToggleRenderedButton presentNominativeBtn = new ToggleRenderedButton("«·„÷«—⁄ «·„—›Ê⁄");
    ToggleRenderedButton presentAccusativeBtn = new ToggleRenderedButton("«·„÷«—⁄ «·„‰’Ê»");
    ToggleRenderedButton presentJussiveBtn = new ToggleRenderedButton("«·„÷«—⁄ «·„Ã“Ê„");
    ToggleRenderedButton presentEmphasizedBtn = new ToggleRenderedButton("«·„÷«—⁄ «·„ƒﬂœ");
    ToggleRenderedButton imperativeBtn = new ToggleRenderedButton("«·√„—");
    ToggleRenderedButton imperativeEmphasizedBtn = new ToggleRenderedButton("«·√„— «·„ƒﬂœ");


    public ActiveAllVerbSelectionUI() {
        super(new BorderLayout());
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel buttonsPanel = new APanel(new GridLayout(1, 8));

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(allBtn);
        buttonGroup.add(pastBtn);
        buttonGroup.add(presentNominativeBtn);
        buttonGroup.add(presentAccusativeBtn);
        buttonGroup.add(presentJussiveBtn);
        buttonGroup.add(presentEmphasizedBtn);
        buttonGroup.add(imperativeBtn);
        buttonGroup.add(imperativeEmphasizedBtn);

        buttonsPanel.add(allBtn);        
        buttonsPanel.add(pastBtn);
        buttonsPanel.add(presentNominativeBtn);
        buttonsPanel.add(presentAccusativeBtn);
        buttonsPanel.add(presentJussiveBtn);
        buttonsPanel.add(presentEmphasizedBtn);
        buttonsPanel.add(imperativeBtn);
        buttonsPanel.add(imperativeEmphasizedBtn);
        
        // passive
        ToggleRenderedButton passivePastBtn = new ToggleRenderedButton("«·„«÷Ì «·„ÃÂÊ· ");
        ToggleRenderedButton passivePresentNominativeBtn = new ToggleRenderedButton("«·„÷«—⁄ «·„—›Ê⁄ «·„ÃÂÊ· ");
        ToggleRenderedButton passivePresentAccusativeBtn = new ToggleRenderedButton("«·„÷«—⁄ «·„‰’Ê» «·„ÃÂÊ· ");
        ToggleRenderedButton passivePresentJussiveBtn = new ToggleRenderedButton("«·„÷«—⁄ «·„Ã“Ê„ «·„ÃÂÊ· ");
        ToggleRenderedButton passivePresentEmphasizedBtn = new ToggleRenderedButton("«·„÷«—⁄ «·„ƒﬂœ «·„ÃÂÊ· ");

        buttonGroup.add(passivePastBtn);
        buttonGroup.add(passivePresentNominativeBtn);
        buttonGroup.add(passivePresentAccusativeBtn);
        buttonGroup.add(passivePresentJussiveBtn);
        buttonGroup.add(passivePresentEmphasizedBtn);

        buttonsPanel.add(passivePastBtn);
        buttonsPanel.add(passivePresentNominativeBtn);
        buttonsPanel.add(passivePresentAccusativeBtn);
        buttonsPanel.add(passivePresentJussiveBtn);
        buttonsPanel.add(passivePresentEmphasizedBtn);
        add(buttonsPanel);
        
        // Past verb conjugation

        
        allBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List[] result = new List[12];
            	//boolean activevoice = true;
            	result[0]= pastConjugate(true);
            	result[1]= presentNominativeConjugate(true);
            	result[2]= presentAccusativeConjugate(true);
            	result[3]= presentJussiveConjugate(true);
            	result[4]= presentEmphasizedConjugate(true);
            	result[5]= imperativeConjugate();
            	result[6]= imperativeEmphasizedConjugate(); 
            	// passive
            	result[7]= passivePastConjugate();
            	result[8]= passivePresentNominativeConjugate();
            	result[9]= passivePresentAccusativeConjugate();
            	result[10]= passivePresentJussiveConjugate();
            	result[11]= passivePresentEmphasizedConjugate();            	
            	AllVerbConjugationUI ui = new AllVerbConjugationUI(result, "«·„«÷Ì");
                ControlPaneContainer.getInstance().openResult(ui);
            
            }
        });
        pastBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = pastConjugate(true);
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·„«÷Ì");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });

        presentNominativeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = presentNominativeConjugate(true);
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·„÷«—⁄ «·„—›Ê⁄");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });

        presentAccusativeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = presentAccusativeConjugate(true);
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·„÷«—⁄ «·„‰’Ê»");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });

        presentJussiveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = presentJussiveConjugate(true);
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·„÷«—⁄ «·„Ã“Ê„");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });

        presentEmphasizedBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = presentEmphasizedConjugate(true);
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·„÷«—⁄ «·„ƒﬂœ");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });

        imperativeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = imperativeConjugate();
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·√„—");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });

        imperativeEmphasizedBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = imperativeEmphasizedConjugate();
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·√„— «·„ƒﬂœ");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });
        
        
        passivePastBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = passivePastConjugate();
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·„«÷Ì «·„ÃÂÊ·");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });

        passivePresentNominativeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = passivePresentNominativeConjugate();
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·„÷«—⁄ «·„—›Ê⁄ «·„ÃÂÊ·");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });

        passivePresentAccusativeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = passivePresentAccusativeConjugate();
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·„÷«—⁄ «·„‰’Ê» «·„ÃÂÊ·");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });

        passivePresentJussiveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = passivePresentJussiveConjugate();
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·„÷«—⁄ «·„Ã“Ê„ «·„ÃÂÊ·");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });

        passivePresentEmphasizedBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	List result = passivePresentEmphasizedConjugate();
                VerbConjugationUI ui = new VerbConjugationUI(result, "«·„÷«—⁄ «·„ƒﬂœ «·„ÃÂÊ·");
                ControlPaneContainer.getInstance().openResult(ui);
            }
        });
    }

    public JComponent getComponent() {
        return this;
    }

    public void setInfo(SelectionInfo selectionInfo) {
        this.selectionInfo = selectionInfo;
        //to ask the user again for this new verb, reset the cashed user response
        cashedUserResponse = null;
        allBtn.doClick();
    }

    private boolean opened = false;
    public void controlPaneOpened() {
        opened = true;
    }


    public void controlPaneClosed() {
        opened = false;
    }

    Boolean cashedUserResponse = null;
    //to let the user select when there is two states for the verb: with vocalization and without
    public boolean doSelectVocalization() {
        if (cashedUserResponse != null) {
            return cashedUserResponse.booleanValue();
        }

        //it must select one of two states
        String msg = "·Â–« «·›⁄· Õ«· «‰ : «· ’ÕÌÕ Ê«·≈⁄·«·° «Œ — ≈ÕœÏ «·Õ«· Ì‰";
        Object[] options = {"«· ’ÕÌÕ", "«·≈⁄·«·"};
        int optionResult = JOptionPane.showOptionDialog(this, msg, "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        cashedUserResponse = new Boolean(optionResult == JOptionPane.NO_OPTION);
        return cashedUserResponse.booleanValue();
    }
    
    
    public List pastConjugate(boolean activevoice)
    {
    List result = null;
    String title = "";
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.active.past.AugmentedActivePastConjugator.getInstance().createVerbList((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.PAST_TENSE, activevoice, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();
        }
        else {
            result = sarf.verb.trilateral.unaugmented.active.ActivePastConjugator.getInstance().createVerbList((UnaugmentedTrilateralRoot) selectionInfo.getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result, SystemConstants.PAST_TENSE, true);
            result = conjResult.getFinalResult();
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.active.past.AugmentedActivePastConjugator.getInstance().createVerbList((AugmentedQuadriliteralRoot)
                    selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.active.ActivePastConjugator.getInstance().createVerbList((UnaugmentedQuadriliteralRoot) selectionInfo.getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result, SystemConstants.PAST_TENSE, true);
        result = conjResult.getFinalResult();
    }
    return result;
    }
    
    
    
    public List presentNominativeConjugate(boolean activevoice)
    {
    List result = null;
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.active.present.AugmentedActivePresentConjugator.getInstance().getNominativeConjugator().createVerbList((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.PRESENT_TENSE, activevoice, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();
        }
        else {
            result = sarf.verb.trilateral.unaugmented.active.ActivePresentConjugator.getInstance().createNominativeVerbList((UnaugmentedTrilateralRoot) selectionInfo.
                    getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, true);
            result = conjResult.getFinalResult();
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.active.present.AugmentedActivePresentConjugator.getInstance().getNominativeConjugator().createVerbList((
                    AugmentedQuadriliteralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.active.ActivePresentConjugator.getInstance().createNominativeVerbList((UnaugmentedQuadriliteralRoot)
                    selectionInfo.getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, true);
        result = conjResult.getFinalResult();

    }
    return result;
    }
    
    
    
    
    // presentAccusative
    public List presentAccusativeConjugate(boolean activevoice)
    {
    List result = null;

    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.active.present.AugmentedActivePresentConjugator.getInstance().getAccusativeConjugator().createVerbList((
                    AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.PRESENT_TENSE, activevoice, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();
        }
        else {
            result = sarf.verb.trilateral.unaugmented.active.ActivePresentConjugator.getInstance().createAccusativeVerbList((UnaugmentedTrilateralRoot) selectionInfo.
                    getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, true);
            result = conjResult.getFinalResult();
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.active.present.AugmentedActivePresentConjugator.getInstance().getAccusativeConjugator().createVerbList((
                    AugmentedQuadriliteralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.active.ActivePresentConjugator.getInstance().createAccusativeVerbList((UnaugmentedQuadriliteralRoot)
                    selectionInfo.getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, true);
        result = conjResult.getFinalResult();

    }
    return result;
    }    

    // presentJussive
    public List presentJussiveConjugate(boolean activevoice)
    {
    List result = null;
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.active.present.AugmentedActivePresentConjugator.getInstance().getJussiveConjugator().createVerbList((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.PRESENT_TENSE, activevoice, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();

            //testing for applying gemination or not is just for the verb that has c2 = c3
            //it will displayed in a different component
            AugmentedTrilateralRoot root = (AugmentedTrilateralRoot) selectionInfo.getRoot();
            if (root.getC2() == root.getC3()) {
                sarf.verb.trilateral.augmented.ConjugationResult notGeminatedConjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(),
                        selectionInfo.getAugmentationFormulaNo(),
                        conjResult.getOriginalResult(), SystemConstants.PRESENT_TENSE, true, false, ActiveAllVerbSelectionUI.this);
                List notGeminatedResult = notGeminatedConjResult.getFinalResult();

                //JussiveVerbConjugationUI ui = new JussiveVerbConjugationUI(result, notGeminatedResult, presentJussiveBtn.getText());
                //ControlPaneContainer.getInstance().openResult(ui);
                return result;
            }
        }
        else {
            result = sarf.verb.trilateral.unaugmented.active.ActivePresentConjugator.getInstance().createJussiveVerbList((UnaugmentedTrilateralRoot) selectionInfo.getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, true);
            result = conjResult.getFinalResult();
            //testing for applying gemination or not is just for the verb that has c2 = c3
            //it will displayed in a different component
            UnaugmentedTrilateralRoot root = (UnaugmentedTrilateralRoot) selectionInfo.getRoot();
            if (root.getC2() == root.getC3()) {
                sarf.verb.trilateral.unaugmented.ConjugationResult notGeminatedConjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(),
                        conjResult.getOriginalResult(),
                        SystemConstants.PRESENT_TENSE, activevoice, false);
                List notGeminatedResult = notGeminatedConjResult.getFinalResult();

                //JussiveVerbConjugationUI ui = new JussiveVerbConjugationUI(result, notGeminatedResult, presentJussiveBtn.getText());
                //ControlPaneContainer.getInstance().openResult(ui);
                return result;
            }
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.active.present.AugmentedActivePresentConjugator.getInstance().getJussiveConjugator().createVerbList((
                    AugmentedQuadriliteralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.active.ActivePresentConjugator.getInstance().createJussiveVerbList((UnaugmentedQuadriliteralRoot)
                    selectionInfo.getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, true);
        sarf.verb.quadriliteral.ConjugationResult notGeminatedConjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), conjResult.getOriginalResult(),
                SystemConstants.PRESENT_TENSE, true, false);

        //JussiveVerbConjugationUI ui = new JussiveVerbConjugationUI(conjResult.getFinalResult(), notGeminatedConjResult.getFinalResult(), presentJussiveBtn.getText());
        //ControlPaneContainer.getInstance().openResult(ui);
        return result;

    }
    return result;
    }    
    // confirmefPresent
    public List presentEmphasizedConjugate(boolean activevoice)
    {
    List result = null;
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.active.present.AugmentedActivePresentConjugator.getInstance().getEmphasizedConjugator().createVerbList((
                    AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.PRESENT_TENSE, true, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();
        }
        else {
            result = sarf.verb.trilateral.unaugmented.active.ActivePresentConjugator.getInstance().createEmphasizedVerbList((UnaugmentedTrilateralRoot) selectionInfo.
                    getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, true);
            result = conjResult.getFinalResult();
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.active.present.AugmentedActivePresentConjugator.getInstance().getEmphasizedConjugator().createVerbList((
                    AugmentedQuadriliteralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.active.ActivePresentConjugator.getInstance().createEmphasizedVerbList((UnaugmentedQuadriliteralRoot)
                    selectionInfo.getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, true);
        result = conjResult.getFinalResult();

    }
    return result;
    }    
    // imperative
    public List imperativeConjugate()
    {
    List result = null;
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.imperative.AugmentedImperativeConjugator.getInstance().getNotEmphsizedConjugator().createVerbList((
                    AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE, true, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();

            //testing for applying gemination or not is just for the verb that has c2 = c3
            //it will displayed in a different component
            AugmentedTrilateralRoot root = (AugmentedTrilateralRoot) selectionInfo.getRoot();
            if (root.getC2() == root.getC3()) {

                sarf.verb.trilateral.augmented.ConjugationResult notGeminatedConjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(),
                        selectionInfo.getAugmentationFormulaNo(),
                        conjResult.getOriginalResult(), SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE, true, false, ActiveAllVerbSelectionUI.this);
                List notGeminatedResult = notGeminatedConjResult.getFinalResult();

                //ImperativeVerbConjugationUI ui = new ImperativeVerbConjugationUI(result, notGeminatedResult, imperativeBtn.getText());
                //ControlPaneContainer.getInstance().openResult(ui);
                return result;
            }
        }
        else {
            result = sarf.verb.trilateral.unaugmented.UnaugmentedImperativeConjugator.getInstance().createVerbList((UnaugmentedTrilateralRoot) selectionInfo.getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result,
                    SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE, true);
            result = conjResult.getFinalResult();

            //testing for applying gemination or not is just for the verb that has c2 = c3
            //it will displayed in a different component
            UnaugmentedTrilateralRoot root = (UnaugmentedTrilateralRoot) selectionInfo.getRoot();
            if (root.getC2() == root.getC3()) {
                sarf.verb.trilateral.unaugmented.ConjugationResult notGeminatedConjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(),
                        conjResult.getOriginalResult(),
                        SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE, true, false);
                List notGeminatedResult = notGeminatedConjResult.getFinalResult();

                //ImperativeVerbConjugationUI ui = new ImperativeVerbConjugationUI(result, notGeminatedResult, imperativeBtn.getText());
                //ControlPaneContainer.getInstance().openResult(ui);
                return result;
            }
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.imperative.AugmentedImperativeConjugator.getInstance().getNotEmphsizedConjugator().createVerbList((
                    AugmentedQuadriliteralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.UnaugmentedImperativeConjugator.getInstance().createVerbList((UnaugmentedQuadriliteralRoot) selectionInfo.
                    getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result,
                SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE, true);

        sarf.verb.quadriliteral.ConjugationResult notGeminatedConjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result,
                SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE, true, false);

        //ImperativeVerbConjugationUI ui = new ImperativeVerbConjugationUI(conjResult.getFinalResult(), notGeminatedConjResult.getFinalResult(), imperativeBtn.getText());
        //ControlPaneContainer.getInstance().openResult(ui);
        return result;
    }
    return result;
    }    
    // confirmedImperative
    public List imperativeEmphasizedConjugate()
    {
    List result = null;
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.imperative.AugmentedImperativeConjugator.getInstance().getEmphsizedConjugator().createVerbList((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.EMPHASIZED_IMPERATIVE_TENSE, true, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();

            //testing for applying gemination or not is just for the verb that has c2 = c3
            //it will displayed in a different component
            AugmentedTrilateralRoot root = (AugmentedTrilateralRoot) selectionInfo.getRoot();
            if (root.getC2() == root.getC3()) {
                sarf.verb.trilateral.augmented.ConjugationResult notGeminatedConjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(),
                        selectionInfo.getAugmentationFormulaNo(),
                        conjResult.getOriginalResult(), SystemConstants.EMPHASIZED_IMPERATIVE_TENSE, true, false, ActiveAllVerbSelectionUI.this);
                List notGeminatedResult = notGeminatedConjResult.getFinalResult();

                //ImperativeVerbConjugationUI ui = new ImperativeVerbConjugationUI(result, notGeminatedResult, imperativeEmphasizedBtn.getText());
                //ControlPaneContainer.getInstance().openResult(ui);
                return result;
            }
        }
        else {
            result = sarf.verb.trilateral.unaugmented.UnaugmentedImperativeConjugator.getInstance().createEmphasizedVerbList((UnaugmentedTrilateralRoot) selectionInfo.getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result,
                    SystemConstants.EMPHASIZED_IMPERATIVE_TENSE, true);
            result = conjResult.getFinalResult();

            //testing for applying gemination or not is just for the verb that has c2 = c3
            //it will displayed in a different component
            UnaugmentedTrilateralRoot root = (UnaugmentedTrilateralRoot) selectionInfo.getRoot();
            if (root.getC2() == root.getC3()) {
                sarf.verb.trilateral.unaugmented.ConjugationResult notGeminatedConjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(),
                        conjResult.getOriginalResult(),
                        SystemConstants.EMPHASIZED_IMPERATIVE_TENSE, true, false);
                List notGeminatedResult = notGeminatedConjResult.getFinalResult();

                //ImperativeVerbConjugationUI ui = new ImperativeVerbConjugationUI(result, notGeminatedResult, imperativeEmphasizedBtn.getText());
                //ControlPaneContainer.getInstance().openResult(ui);
                return result;
            }
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.imperative.AugmentedImperativeConjugator.getInstance().getEmphsizedConjugator().createVerbList((
                    AugmentedQuadriliteralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.UnaugmentedImperativeConjugator.getInstance().createEmphasizedVerbList((UnaugmentedQuadriliteralRoot)
                    selectionInfo.getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result,
                SystemConstants.EMPHASIZED_IMPERATIVE_TENSE, true);
        sarf.verb.quadriliteral.ConjugationResult notGeminatedConjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result,
                SystemConstants.EMPHASIZED_IMPERATIVE_TENSE, true, false);

        //ImperativeVerbConjugationUI ui = new ImperativeVerbConjugationUI(conjResult.getFinalResult(), notGeminatedConjResult.getFinalResult(), imperativeEmphasizedBtn.getText());
        //ControlPaneContainer.getInstance().openResult(ui);
        return result;

    } 
    return result;
    }   

    
//// passive conjugate verbs
    public List passivePastConjugate() {
    List result = null;
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.passive.past.AugmentedPassivePastConjugator.getInstance().createVerbList((AugmentedTrilateralRoot) selectionInfo.
                    getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((
                    AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.PAST_TENSE, false, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();
        }
        else {
            result = sarf.verb.trilateral.unaugmented.passive.PassivePastConjugator.getInstance().createVerbList((UnaugmentedTrilateralRoot) selectionInfo.getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((
                    UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result, SystemConstants.PAST_TENSE, false);
            result = conjResult.getFinalResult();
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.passive.past.AugmentedPassivePastConjugator.getInstance().createVerbList((AugmentedQuadriliteralRoot)
                    selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.passive.PassivePastConjugator.getInstance().createVerbList((UnaugmentedQuadriliteralRoot) selectionInfo.
                    getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot)
                selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result, SystemConstants.PAST_TENSE, false);
        result = conjResult.getFinalResult();

    }
   return result;
}
public List passivePresentNominativeConjugate() {
    List result = null;
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.passive.present.AugmentedPassivePresentConjugator.getInstance().getNominativeConjugator().createVerbList((
                    AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((
                    AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.PRESENT_TENSE, false, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();
        }
        else {
            result = sarf.verb.trilateral.unaugmented.passive.PassivePresentConjugator.getInstance().createNominativeVerbList((UnaugmentedTrilateralRoot) selectionInfo.
                    getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((
                    UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, false);
            result = conjResult.getFinalResult();
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.passive.present.AugmentedPassivePresentConjugator.getInstance().getNominativeConjugator().createVerbList((
                    AugmentedQuadriliteralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.passive.PassivePresentConjugator.getInstance().createNominativeVerbList((UnaugmentedQuadriliteralRoot)
                    selectionInfo.getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot)
                selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, false);
        result = conjResult.getFinalResult();

    }
    return result;
}



public List passivePresentAccusativeConjugate() {
    List result = null;
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.passive.present.AugmentedPassivePresentConjugator.getInstance().getAccusativeConjugator().createVerbList((
                    AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((
                    AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.PRESENT_TENSE, false, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();
        }
        else {
            result = sarf.verb.trilateral.unaugmented.passive.PassivePresentConjugator.getInstance().createAccusativeVerbList((UnaugmentedTrilateralRoot) selectionInfo.
                    getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((
                    UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, false);
            result = conjResult.getFinalResult();
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.passive.present.AugmentedPassivePresentConjugator.getInstance().getAccusativeConjugator().createVerbList((
                    AugmentedQuadriliteralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.passive.PassivePresentConjugator.getInstance().createAccusativeVerbList((UnaugmentedQuadriliteralRoot)
                    selectionInfo.getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot)
                selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, false);
        result = conjResult.getFinalResult();

    }
    return result;
}

public List passivePresentJussiveConjugate() {
    List result = null;
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.passive.present.AugmentedPassivePresentConjugator.getInstance().getJussiveConjugator().createVerbList((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.PRESENT_TENSE, false, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();
            //testing for applying gemination or not is just for the verb that has c2 = c3
            //it will displayed in a different component
            AugmentedTrilateralRoot root = (AugmentedTrilateralRoot) selectionInfo.getRoot();
            if (root.getC2() == root.getC3()) {
                sarf.verb.trilateral.augmented.ConjugationResult notGeminatedConjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(),
                        selectionInfo.getAugmentationFormulaNo(),
                        conjResult.getOriginalResult(), SystemConstants.PRESENT_TENSE, false, false, ActiveAllVerbSelectionUI.this);
                List notGeminatedResult = notGeminatedConjResult.getFinalResult();

                return result;
            }
        }
        else {
            result = sarf.verb.trilateral.unaugmented.passive.PassivePresentConjugator.getInstance().createJussiveVerbList((UnaugmentedTrilateralRoot) selectionInfo.getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, false);
            result = conjResult.getFinalResult();

            //testing for applying gemination or not is just for the verb that has c2 = c3
            //it will displayed in a different component
            UnaugmentedTrilateralRoot root = (UnaugmentedTrilateralRoot) selectionInfo.getRoot();
            if (root.getC2() == root.getC3()) {
                sarf.verb.trilateral.unaugmented.ConjugationResult notGeminatedConjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(),
                        conjResult.getOriginalResult(),
                        SystemConstants.PRESENT_TENSE, false, false);
                List notGeminatedResult = notGeminatedConjResult.getFinalResult();

                return result;
            }
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.passive.present.AugmentedPassivePresentConjugator.getInstance().getJussiveConjugator().createVerbList((
                    AugmentedQuadriliteralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.passive.PassivePresentConjugator.getInstance().createJussiveVerbList((UnaugmentedQuadriliteralRoot)
                    selectionInfo.getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, false);
        sarf.verb.quadriliteral.ConjugationResult notGeminatedConjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), conjResult.getOriginalResult(),
                SystemConstants.PRESENT_TENSE, false, false);

        return result;


    }
    return result;
}

public List passivePresentEmphasizedConjugate() {
    List result = null;
    if (selectionInfo.isTrilateral()) {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.trilateral.augmented.passive.present.AugmentedPassivePresentConjugator.getInstance().getEmphasizedConjugator().createVerbList((
                    AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
            sarf.verb.trilateral.augmented.ConjugationResult conjResult = sarf.verb.trilateral.augmented.modifier.AugmentedTrilateralModifier.getInstance().build((
                    AugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), selectionInfo.getAugmentationFormulaNo(), result,
                    SystemConstants.PRESENT_TENSE, false, ActiveAllVerbSelectionUI.this);
            result = conjResult.getFinalResult();
        }
        else {
            result = sarf.verb.trilateral.unaugmented.passive.PassivePresentConjugator.getInstance().createEmphasizedVerbList((UnaugmentedTrilateralRoot) selectionInfo.
                    getRoot());
            sarf.verb.trilateral.unaugmented.ConjugationResult conjResult = sarf.verb.trilateral.unaugmented.modifier.UnaugmentedTrilateralModifier.getInstance().build((
                    UnaugmentedTrilateralRoot) selectionInfo.getRoot(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, false);
            result = conjResult.getFinalResult();
        }
    }
    else {
        if (selectionInfo.isAugmented()) {
            result = sarf.verb.quadriliteral.augmented.passive.present.AugmentedPassivePresentConjugator.getInstance().getEmphasizedConjugator().createVerbList((
                    AugmentedQuadriliteralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo());
        }
        else {
            result = sarf.verb.quadriliteral.unaugmented.passive.PassivePresentConjugator.getInstance().createEmphasizedVerbList((UnaugmentedQuadriliteralRoot)
                    selectionInfo.getRoot());
        }
        sarf.verb.quadriliteral.ConjugationResult conjResult = sarf.verb.quadriliteral.modifier.QuadrilateralModifier.getInstance().build((QuadrilateralRoot) selectionInfo.getRoot(), selectionInfo.getAugmentationFormulaNo(), selectionInfo.getKov(), result, SystemConstants.PRESENT_TENSE, false);
        result = conjResult.getFinalResult();

    }
    return result;
}

    
    
}
