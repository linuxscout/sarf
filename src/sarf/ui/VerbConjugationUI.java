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
public class VerbConjugationUI extends JPanel implements IHtmlContentSaver {
    List dataFieldsList;
    public static final Font FONT = new Font("Traditional Arabic", Font.PLAIN, 30);
    public static final Border BORDER = BorderFactory.createEtchedBorder();
    private String title;


    public VerbConjugationUI(List verbConjugationList, String title) {
        super(new GridLayout(7, 4));
        this.title = title;
        dataFieldsList = verbConjugationList;
        setFont(FONT);
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        List pronounsList = SeparatedPronounsContainer.getInstance().getPronouns();
        JLabel lbl = null;
        for (int i = 0; i < 6; i++) {
            //����� �� ���� ������
            add(lbl = new JLabel((String) pronounsList.get(i)));
            decorateLabel(lbl);
            //����� �� ���� �����
            add(lbl = new JLabel(verbConjugationList.get(i) + ""));
            decorateVerbLabel(lbl);
            //����� �� ���� ������
            add(lbl = new JLabel((String) pronounsList.get(i + 7)));
            decorateLabel(lbl);
            //����� �� ���� �����
            add(lbl = new JLabel(verbConjugationList.get(i + 7) + ""));
            decorateVerbLabel(lbl);
        }
        //����� �� ���� ������
        add(lbl = new JLabel((String) pronounsList.get(6)));
        decorateLabel(lbl);
        //����� �� ���� �����
        add(lbl = new JLabel(verbConjugationList.get(6) + ""));
        decorateVerbLabel(lbl);

        add(lbl = new JLabel(" "));
        decorateLabel(lbl);
        add(lbl = new JLabel(" "));
        decorateVerbLabel(lbl);
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
        String content = FileUtil.getContents(new File("db/verbs.html"));

        String docTitle = "����� "+ " ( "+ title + " ) " +" ����� "+ " ( "+ ControlPaneContainer.getInstance().getVerbTxtFld().getText() +" )";
        //put the title
        content = content.replaceFirst("DocTitle", docTitle);

        for (int i = 0; i < 6; i++) {
            Object result = dataFieldsList.get(i);
            //vri verb right position
            String vri = result == null ? "&nbsp;" : result.toString();

            result = dataFieldsList.get(i+7);
            //vli verb left position
            String vli = result == null ? "&nbsp;" : result.toString();

            content = content.replaceFirst("vr" + i, vri);
            content = content.replaceFirst("vl" + (i), vli);
        }
        Object result = dataFieldsList.get(6);
        String vr6 = result == null ? "&nbsp;" : result.toString();
        content = content.replaceFirst("vr6" , vr6);

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
        return "����� "+ " "+ title + " " +" ����� "+ "  "+ ControlPaneContainer.getInstance().getVerbTxtFld().getText();
    }

}
