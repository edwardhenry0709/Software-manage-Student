/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import bean.DanhMucBean;
import view.HocVienJPanel;
import view.QuanLyHocVienJPanel;
import view.QuanLyKhoaHocJPanel;
import view.QuanLyLopHocJPanel;
import view.ThongKeDuLieuJPanel;
import view.TrangChuJPanel;

/**
 *
 * @author Conroy Dang
 */
public class ChuyenManHinhController {

    private String kindSelected = "";
    private JPanel root;
    private List<DanhMucBean> listItem = null;
    private String kind;

    public ChuyenManHinhController(JPanel root) {
        this.root = root;
    }

    public void setView(JPanel jpnItem, JLabel lblItem) {
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(98, 102, 196));
        lblItem.setBackground(new Color(98, 102, 196));
        JPanel node = new TrangChuJPanel();
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();

    }

    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;

        for (DanhMucBean item : listItem) {
            item.getLbl().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getLbl()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel lblItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel lblItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.lblItem = lblItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChuJPanel();
                    break;
                case "HocVien": {
                    node = new HocVienJPanel();
                    break;
                }
                case "QuanLyKhoaHoc": {
                    node = new QuanLyKhoaHocJPanel();
                    break;
                }
                case "QuanLyLopHoc": {
                    node = new QuanLyLopHocJPanel();
                    break;
                }
                case "ThongKeDuLieu": {
                    node = new ThongKeDuLieuJPanel();
                    break;
                }
                default:
                    node = new TrangChuJPanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(97, 102, 196));

            lblItem.setBackground(new Color(97, 102, 196));

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(97, 102, 196));

            lblItem.setBackground(new Color(97, 102, 196));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(78,174,76));
                lblItem.setBackground(new Color(78,174,76));

            }

        }

    }

    private void setChangeBackground(String kind) {
        for (DanhMucBean item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(78,174,76));
                item.getLbl().setBackground(new Color(78,174,76));

            } else {
                item.getJpn().setBackground(new Color(90, 122, 96));
                item.getLbl().setBackground(new Color(90, 122, 96));
            }
        }
    }

}
