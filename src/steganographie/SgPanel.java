/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package steganographie;

import a.util.ImageFileFilter;
import a.util.JSFileChooser;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JToggleButton;
import javax.swing.JViewport;

/**
 *
 * @author p1002873
 */
public class SgPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public SgPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        encodeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textContent = new javax.swing.JTextPane();
        openImg = new javax.swing.JButton();
        tolerenceSlide = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        decodeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        imgPane = new steganographie.SgImgPanel(true);
        jScrollPane3 = new javax.swing.JScrollPane();
        imgPane1 = new steganographie.SgImgPanel(false);
        saveNew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        encodeButton.setText("Encoder");
        encodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeButtonActionPerformed(evt);
            }
        });

        textContent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textContentKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(textContent);

        openImg.setText("Ouvrir image");
        openImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openImgActionPerformed(evt);
            }
        });

        tolerenceSlide.setMaximum(8);
        tolerenceSlide.setMinimum(2);
        tolerenceSlide.setValue(2);
        tolerenceSlide.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tolerenceSlideStateChanged(evt);
            }
        });

        jLabel1.setText("Tolérence : 2");

        decodeButton.setText("Décoder");
        decodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeButtonActionPerformed(evt);
            }
        });

        imgPane.setBackground(new java.awt.Color(153, 153, 153));
        imgPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout imgPaneLayout = new javax.swing.GroupLayout(imgPane);
        imgPane.setLayout(imgPaneLayout);
        imgPaneLayout.setHorizontalGroup(
            imgPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        imgPaneLayout.setVerticalGroup(
            imgPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(imgPane);

        imgPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgPane1.setPreferredSize(new java.awt.Dimension(364, 327));

        javax.swing.GroupLayout imgPane1Layout = new javax.swing.GroupLayout(imgPane1);
        imgPane1.setLayout(imgPane1Layout);
        imgPane1Layout.setHorizontalGroup(
            imgPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        imgPane1Layout.setVerticalGroup(
            imgPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(imgPane1);

        saveNew.setText("Enregistrer");
        saveNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewActionPerformed(evt);
            }
        });

        jLabel2.setText("[A] Image contenante");

        jLabel3.setText("[B] Résultat de la stéganographie avec le texte caché");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(openImg, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(tolerenceSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(encodeButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(decodeButton))))))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addComponent(saveNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decodeButton)
                    .addComponent(encodeButton)
                    .addComponent(openImg)
                    .addComponent(saveNew))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tolerenceSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void openImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openImgActionPerformed
        JSFileChooser ofc = new JSFileChooser();

        ofc.removeChoosableFileFilter(ofc.getAcceptAllFileFilter());
        ofc.addChoosableFileFilter(new ImageFileFilter(".bmp", "Fichier image au format Bitmap"));

        if (ofc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = new File(ofc.getSelectedFile().getAbsolutePath());
            this.openImage(file);

        }



    }//GEN-LAST:event_openImgActionPerformed

    /*
     * A partir d'ici on gère l'ouverture de fichier grâce au Drag And Drop
     */
    /**
     * Ouvre une image donnée en paramètre
     *
     * @param file image à ouvrir
     */
    public void openImage(File file) {

        try {

            FileImageInputStream fis = new FileImageInputStream(file);
            BufferedImage tmp = ImageIO.read(fis);
            steganographie.SgImgPanel p = (SgImgPanel) imgPane;
            p.setImageB(tmp);


        } catch (FileNotFoundException excep) {
            excep.printStackTrace();
        } catch (java.io.IOException excep) {
            excep.printStackTrace();
        }

    }

    private void textContentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContentKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textContentKeyReleased

    private void encodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeButtonActionPerformed



        SgText texte = new SgText(textContent.getText(), tolerenceSlide.getValue());
        SgImage image = new SgImage(((SgImgPanel) imgPane).getImageB(), tolerenceSlide.getValue());

        image.encodeText(texte, false);

        texte.showMaxByte();
        texte.showFirstByte();
        //texte.showSchema();


        ((SgImgPanel) imgPane1).setImageB(image.getImageOut());


    }//GEN-LAST:event_encodeButtonActionPerformed

    private void tolerenceSlideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tolerenceSlideStateChanged

        if (tolerenceSlide.getValue() == 3) {
            tolerenceSlide.setValue(4);
        }

        if (tolerenceSlide.getValue() >= 5) {
            tolerenceSlide.setValue(8);
        }

        jLabel1.setText("Tolérence : " + tolerenceSlide.getValue());



    }//GEN-LAST:event_tolerenceSlideStateChanged

    private void decodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeButtonActionPerformed

        SgImage image = new SgImage(((SgImgPanel) imgPane).getImageB(), tolerenceSlide.getValue());

        if (image != null){
            image.showMaxBytes();

            textContent.setText(image.decodeText());
        }
    }//GEN-LAST:event_decodeButtonActionPerformed

    private void saveNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewActionPerformed
        JSFileChooser fc = new JSFileChooser();

        fc.removeChoosableFileFilter(fc.getAcceptAllFileFilter());
        fc.addChoosableFileFilter(new ImageFileFilter(".bmp", "Fichier image au format Bitmap"));

        if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {

            try {

                String ext = fc.getFileFilter().getDescription();
                File file = new File(fc.getSelectedFile().getAbsolutePath() + ext);
                FileImageOutputStream fios = new FileImageOutputStream(file);
                BufferedImage tmpBuf = ((SgImgPanel) imgPane1).getImageB();
                ImageIO.write(tmpBuf, ext.substring(1, ext.length()), fios);
                fios.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_saveNewActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decodeButton;
    private javax.swing.JButton encodeButton;
    private javax.swing.JPanel imgPane;
    private javax.swing.JPanel imgPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton openImg;
    private javax.swing.JButton saveNew;
    private javax.swing.JTextPane textContent;
    private javax.swing.JSlider tolerenceSlide;
    // End of variables declaration//GEN-END:variables

    public JButton getDecodeButton() {
        return decodeButton;
    }

    public JButton getEncodeButton() {
        return encodeButton;
    }

    public JButton getOpenImg() {
        return openImg;
    }

    public JButton getSaveNew() {
        return saveNew;
    }
}
