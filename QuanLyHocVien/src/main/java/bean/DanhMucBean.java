/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Conroy Dang
 */
public class DanhMucBean {
    private String kind;
    private JPanel jpn;
    private JLabel lbl;

    public DanhMucBean(String kind, JPanel jpn, JLabel lbl) {
        this.kind = kind;
        this.jpn = jpn;
        this.lbl = lbl;
    }
    public DanhMucBean()
    {
        
    }
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }

    public JLabel getLbl() {
        return lbl;
    }

    public void setLbl(JLabel lbl) {
        this.lbl = lbl;
    }
}
