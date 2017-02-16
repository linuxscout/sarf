package sarf.ui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;
import sarf.*;
import javax.swing.border.*;
import java.awt.color.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import sarf.util.*;
import java.net.*;

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
public class AllVerbConjugationUI extends JPanel implements IHtmlContentSaver {
    List[] dataFieldsList = new List[8];
    public static final Font FONT = new Font("Traditional Arabic", Font.PLAIN, 20);
    public static final Border BORDER = BorderFactory.createEtchedBorder();
    private String title;


    public AllVerbConjugationUI(List[] verbConjugationList, String title) {
        super(new GridLayout(14, 13));
        this.title = title;
        int k=0;

        dataFieldsList = verbConjugationList;
        setFont(FONT);
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        List pronounsList = SeparatedPronounsContainer.getInstance().getPronouns();
        JLabel lbl = null;
        for (int i = 0; i < 13; i++) {
            //ÅÖÇÝÉ äÕ íãËá ÇáÖãíÑ
            add(lbl = new JLabel((String) pronounsList.get(i)));
            decorateLabel(lbl);

            for (int j = 0; j< 12; j++)
            {
            //ÅÖÇÝÉ äÕ íãËá ÇáÝÚá
            add(lbl = new JLabel(verbConjugationList[j].get(i) + ""));
            decorateVerbLabel(lbl);
            }
        }

    }

    private void decorateLabel(JLabel lbl) {
        lbl.setFont(FONT);
        lbl.setBorder(BORDER);
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        if (lbl.getText().equals("null")) {
            lbl.setText("");
        }

        //lbl.setOpaque(true);
        //lbl.setBackground(backgroundcolor2);
    }

    static final Color backgroundcolor2 = new Color(250, 231, 226);
    private void decorateVerbLabel(JLabel lbl) {
        decorateLabel(lbl);
        lbl.setOpaque(true);
        lbl.setBackground(backgroundcolor2);
    }

    public boolean saveToHtml(File file) {
        String content = FileUtil.getContents(new File("db/allverbs.txt"));

        String docTitle = "ÊÕÑíÝ " + " ááÝÚá "+ " ( "+ ControlPaneContainer.getInstance().getVerbTxtFld().getText() +" )";
        //put the title
        content = content.replaceFirst("DocTitle", docTitle);
        //int k = 0;
        for(int k=0; k<12; k++)
        for (int i = 0; i < 13; i++) {
            Object result = dataFieldsList[k].get(i);
            //vr verb conjugation
            String vri = result == null ? "" : result.toString();
            content = content.replaceFirst("v" +i+'-'+ k, vri);

        }

        try {
            FileUtil.saveContents(file, content);
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public String getSavedFileNameTitle() {
        return "ÊÕÑíÝ "+ "  " +" ÇáÝÚá"+ "  "+ ControlPaneContainer.getInstance().getVerbTxtFld().getText();
    }

}
