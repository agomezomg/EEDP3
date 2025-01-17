/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eeddproject;

import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.*;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import org.graphstream.graph.Edge;
import org.graphstream.ui.view.*;

/**
 *
 * @author lana
 */
public class Front extends javax.swing.JFrame {

    /**
     * Creates new form Front
     */
    public Front() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        graph = new MultiGraph("Travel");
        //friggin' christ, this doesn't actually work like I expected to
        graph.setAutoCreate(true);
        viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        jbView.setEnabled(false);
        jb_shortestPath.setEnabled(false);
        jb_cheapestPath.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_cheapPath = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_fromCh = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cb_toCh = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jb_findCh = new javax.swing.JButton();
        jf_shortPath = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cb_fromSh = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cb_toSh = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jb_findSh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbLoad = new javax.swing.JButton();
        jbView = new javax.swing.JButton();
        jb_shortestPath = new javax.swing.JButton();
        jb_cheapestPath = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 243, 118));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Cheapest Path");

        cb_fromCh.setBackground(new java.awt.Color(255, 153, 0));
        cb_fromCh.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("From:");

        cb_toCh.setBackground(new java.awt.Color(255, 153, 0));
        cb_toCh.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("To:");

        jb_findCh.setBackground(new java.awt.Color(255, 153, 0));
        jb_findCh.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jb_findCh.setForeground(new java.awt.Color(255, 255, 255));
        jb_findCh.setText("GO!");
        jb_findCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_findChActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(49, 49, 49)
                                .addComponent(cb_fromCh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_toCh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jb_findCh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_fromCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_toCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jb_findCh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jf_cheapPathLayout = new javax.swing.GroupLayout(jf_cheapPath.getContentPane());
        jf_cheapPath.getContentPane().setLayout(jf_cheapPathLayout);
        jf_cheapPathLayout.setHorizontalGroup(
            jf_cheapPathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jf_cheapPathLayout.setVerticalGroup(
            jf_cheapPathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 243, 118));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Shortest Path!");

        cb_fromSh.setBackground(new java.awt.Color(255, 153, 0));
        cb_fromSh.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        cb_fromSh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_fromShItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("From:");

        cb_toSh.setBackground(new java.awt.Color(255, 153, 0));
        cb_toSh.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("To:");

        jb_findSh.setBackground(new java.awt.Color(255, 153, 0));
        jb_findSh.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jb_findSh.setForeground(new java.awt.Color(255, 255, 255));
        jb_findSh.setText("GO!");
        jb_findSh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_findShActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49)
                                .addComponent(cb_fromSh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_toSh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jb_findSh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(85, 85, 85))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_fromSh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_toSh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jb_findSh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jf_shortPathLayout = new javax.swing.GroupLayout(jf_shortPath.getContentPane());
        jf_shortPath.getContentPane().setLayout(jf_shortPathLayout);
        jf_shortPathLayout.setHorizontalGroup(
            jf_shortPathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jf_shortPathLayout.setVerticalGroup(
            jf_shortPathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        jPanel1.setBackground(new java.awt.Color(255, 243, 118));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Air Travel");

        jbLoad.setBackground(new java.awt.Color(255, 153, 0));
        jbLoad.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbLoad.setForeground(new java.awt.Color(255, 255, 255));
        jbLoad.setText("Load from file");
        jbLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoadActionPerformed(evt);
            }
        });

        jbView.setBackground(new java.awt.Color(255, 153, 0));
        jbView.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbView.setForeground(new java.awt.Color(255, 255, 255));
        jbView.setText("View available routes");
        jbView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbViewActionPerformed(evt);
            }
        });

        jb_shortestPath.setBackground(new java.awt.Color(255, 153, 0));
        jb_shortestPath.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jb_shortestPath.setForeground(new java.awt.Color(255, 255, 255));
        jb_shortestPath.setText("Shortest Route");
        jb_shortestPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_shortestPathActionPerformed(evt);
            }
        });

        jb_cheapestPath.setBackground(new java.awt.Color(255, 153, 0));
        jb_cheapestPath.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jb_cheapestPath.setForeground(new java.awt.Color(255, 255, 255));
        jb_cheapestPath.setText("Cheapest Route");
        jb_cheapestPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cheapestPathActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jbLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb_shortestPath, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_cheapestPath, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbView, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_shortestPath, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_cheapestPath, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoadActionPerformed
        // TODO add your handling code here:
        if (loaded) {
            JOptionPane.showMessageDialog(this, "But...you already loaded the file!");
        } else {
            String fileName = "./routes.txt";

            // This will reference one line at a time
            String line;

            /*try {
                JFileChooser fc = new JFileChooser();
                fc.setBackground(Color.orange);
                fc.setForeground(Color.orange);
                int op = fc.showOpenDialog(this);
                if (op == JFileChooser.APPROVE_OPTION) {
                    in_file = fc.getSelectedFile();
                    fileName = in_file.getPath();
                }
            } catch (HeadlessException e) {
            }*/
            try {
                // FileReader reads text files in the default encoding.
                FileReader fileReader = new FileReader(fileName);
                try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    String[] parsedLine;
                    String edgeID = "";
                    while ((line = bufferedReader.readLine()) != null) {
                        parsedLine = line.split(",");
                        edgeID += parsedLine[0];
                        edgeID += parsedLine[1];
                        //these two conditionals help me determine whether a
                        //node needs to be created, or whether it exists already
                        //in which case, I can set an edge directly.
                        if (graph.getNode(parsedLine[0]) == null) {
                            graph.addNode(parsedLine[0]);
                        }
                        if (graph.getNode(parsedLine[1]) == null) {
                            graph.addNode(parsedLine[1]);
                        }
                        //I set the edges per parsed line
                        graph.addEdge(edgeID, parsedLine[0], parsedLine[1], true);
                        graph.getEdge(edgeID).addAttribute("Airline", parsedLine[2]);
                        graph.getEdge(edgeID).addAttribute("Price", parsedLine[3]);
                        graph.getEdge(edgeID).addAttribute("Distance", parsedLine[4]);
                    }
                }
                JOptionPane.showMessageDialog(this, "Added Successfully: "
                        + "\n Cities have been loaded. \n");
                loaded = true;
                jbView.setEnabled(true);
                jb_shortestPath.setEnabled(true);
                jb_cheapestPath.setEnabled(true);
            } catch (FileNotFoundException ex) {
                System.out.println(
                        "Unable to open file '"
                        + fileName + "'");
            } catch (IOException ex) {
                System.out.println(
                        "Error reading file '"
                        + fileName + "'");
            }
        }

    }//GEN-LAST:event_jbLoadActionPerformed

    private void jbViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbViewActionPerformed
        // TODO add your handling code here:
        if (loaded) {
            graph.addAttribute("ui.quality");
            graph.addAttribute("ui.stylesheet",
                    "node {size: 30px;"
                    + " fill-color: WhiteSmoke;"
                    + " stroke-mode: plain;"
                    + " stroke-color: Lavender;"
                    + " shadow-mode: plain;"
                    + " shadow-width: 3px;"
                    + " shadow-color: Gainsboro;"
                    + " shadow-offset: 0px;}"
                    + "graph { fill-mode: gradient-vertical;"
                    + " fill-color: PowderBlue, LightSteelBlue, LightBlue, SkyBlue, LightSkyBlue, DodgerBlue; }"
                    + "edge {"
                    + "	shape: line;\n"
                    + " fill-color: OliveDrab;\n"
                    + " arrow-size: 6px, 5px;"
                    + "}");
            graph.addAttribute("ui.antialias");

            for (Node node : graph) {
                node.addAttribute("ui.label", node.getId());
            }

            viewer = graph.display();

            viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER);
        } else {
            JOptionPane.showMessageDialog(this, "You must load the routes first!");
        }
    }//GEN-LAST:event_jbViewActionPerformed

    private void jb_shortestPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_shortestPathActionPerformed
        // TODO add your handling code here:
        if (loaded) {
            jf_shortPath.pack();
            jf_shortPath.setResizable(false);
            jf_shortPath.setLocationRelativeTo(this);
            jf_shortPath.setVisible(true);
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for (Node node : graph) {
                model.addElement(node.getId());
            }
            cb_fromSh.setModel(model);

            model = new DefaultComboBoxModel();
            for (Node node : graph) {
                model.addElement(node.getId());
            }
            cb_toSh.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this, "You must load the routes first!");
        }
    }//GEN-LAST:event_jb_shortestPathActionPerformed

    private void jb_cheapestPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cheapestPathActionPerformed
        // TODO add your handling code here:
        if (loaded) {
            jf_cheapPath.pack();
            jf_cheapPath.setResizable(false);
            jf_cheapPath.setLocationRelativeTo(this);
            jf_cheapPath.setVisible(true);
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for (Node node : graph) {
                model.addElement(node.getId());
            }
            cb_fromCh.setModel(model);

            model = new DefaultComboBoxModel();
            for (Node node : graph) {
                model.addElement(node.getId());
            }
            cb_toCh.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this, "You must load the routes first!");
        }
    }//GEN-LAST:event_jb_cheapestPathActionPerformed

    private void jb_findChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_findChActionPerformed
        // TODO add your handling code here:
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "Price");
        dijkstra.init(graph);
        String from = cb_fromCh.getSelectedItem().toString();
        String to = cb_toCh.getSelectedItem().toString();
        if (from == null ? to != null : !from.equals(to)) {
            dijkstra.setSource(graph.getNode(from));
            dijkstra.compute();

            Graph result = new MultiGraph("Cheapests Path", false, true);
            //I'm suddenly wondering if my classmates commented their code
            for (Node node : dijkstra.getPathNodes(graph.getNode(to))) {
                //node.addAttribute("ui.style", "fill-color: blue;");
                result.addNode(node.getId());
            }

            //do people read these?
            for (Edge edge : dijkstra.getPathEdges(graph.getNode(to))) {
                //edge.addAttribute("ui.style", "fill-color: red;");
                result.addEdge(edge.getId(), (Node) edge.getNode0(), (Node) edge
                        .getNode1(), true);
                result.getEdge(edge.getId()).addAttribute("Price",
                        edge.getAttribute("Price").toString());
                //System.out.println(edge.getAttribute("Distance").toString());
            }

            if (result.getNodeCount() == 0) {
                JOptionPane.showMessageDialog(this, "No routes available.");
            } else {
                result.addAttribute("ui.quality");
                result.addAttribute("ui.stylesheet",
                        "node {size: 30px;"
                        + " fill-color: WhiteSmoke;"
                        + " stroke-mode: plain;"
                        + " stroke-color: Lavender;"
                        + " shadow-mode: plain;"
                        + " shadow-width: 3px;"
                        + " shadow-color: Gainsboro;"
                        + " shadow-offset: 0px;}"
                        + "graph { fill-mode: gradient-vertical;"
                        + " fill-color: PowderBlue, LightSteelBlue, LightBlue, SkyBlue, LightSkyBlue, DodgerBlue; }"
                        + "edge {"
                        + "	shape: line;\n"
                        + " fill-color: OliveDrab;\n"
                        + " arrow-size: 6px, 5px;"
                        + "}");
                result.addAttribute("ui.antialias");

                for (Node node : result) {
                    node.addAttribute("ui.label", node.getId());
                }

                for (Edge edge : result.getEachEdge()) {
                    edge.addAttribute("ui.label", "$" + edge.getAttribute("Price").toString());
                }
                Viewer resDisplay = result.display();
                resDisplay.setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER);

            }
        } else {
            JOptionPane.showMessageDialog(this, "You shouldn't compare same elements."
                    + "\nYou can, but you shouldn't.", "Nope", 0);
        }
        dijkstra.clear();
    }//GEN-LAST:event_jb_findChActionPerformed

    private void jb_findShActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_findShActionPerformed
        // TODO add your handling code here:
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "Distance");
        dijkstra.init(graph);
        String from = cb_fromSh.getSelectedItem().toString();
        String to = cb_toSh.getSelectedItem().toString();
        if (from == null ? to != null : !from.equals(to)) {
            dijkstra.setSource(graph.getNode(from));
            dijkstra.compute();

            Graph result = new MultiGraph("Shortest Path", false, true);
            //I'm suddenly wondering if my classmates commented their code
            for (Node node : dijkstra.getPathNodes(graph.getNode(to))) {
                //node.addAttribute("ui.style", "fill-color: blue;");
                result.addNode(node.getId());
            }

            //do people read these?
            for (Edge edge : dijkstra.getPathEdges(graph.getNode(to))) {
                //edge.addAttribute("ui.style", "fill-color: red;");
                result.addEdge(edge.getId(), (Node) edge.getNode0(), (Node) edge
                        .getNode1(), true);
                result.getEdge(edge.getId()).addAttribute("Distance",
                        edge.getAttribute("Distance").toString());
                //System.out.println(edge.getAttribute("Distance").toString());
            }

            if (result.getNodeCount() == 0) {
                JOptionPane.showMessageDialog(this, "No routes available.");
            } else {
                result.addAttribute("ui.quality");
                result.addAttribute("ui.stylesheet",
                        "node {size: 30px;"
                        + " fill-color: WhiteSmoke;"
                        + " stroke-mode: plain;"
                        + " stroke-color: Lavender;"
                        + " shadow-mode: plain;"
                        + " shadow-width: 3px;"
                        + " shadow-color: Gainsboro;"
                        + " shadow-offset: 0px;}"
                        + "graph { fill-mode: gradient-vertical;"
                        + " fill-color: PowderBlue, LightSteelBlue, LightBlue, SkyBlue, LightSkyBlue, DodgerBlue; }"
                        + "edge {"
                        + "	shape: line;\n"
                        + " fill-color: OliveDrab;\n"
                        + " arrow-size: 6px, 5px;"
                        + "}");
                result.addAttribute("ui.antialias");

                for (Node node : result) {
                    node.addAttribute("ui.label", node.getId());
                }

                for (Edge edge : result.getEachEdge()) {
                    edge.addAttribute("ui.label", edge.getAttribute("Distance").toString() + " km");
                }
                Viewer resDisplay = result.display();
                resDisplay.setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER);

            }
        } else {
            JOptionPane.showMessageDialog(this, "You shouldn't compare same elements."
                    + "\nYou can, but you shouldn't.", "Nope", 0);
        }
        dijkstra.clear();
    }//GEN-LAST:event_jb_findShActionPerformed

    private void cb_fromShItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fromShItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_fromShItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Front().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_fromCh;
    private javax.swing.JComboBox<String> cb_fromSh;
    private javax.swing.JComboBox<String> cb_toCh;
    private javax.swing.JComboBox<String> cb_toSh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbLoad;
    private javax.swing.JButton jbView;
    private javax.swing.JButton jb_cheapestPath;
    private javax.swing.JButton jb_findCh;
    private javax.swing.JButton jb_findSh;
    private javax.swing.JButton jb_shortestPath;
    private javax.swing.JFrame jf_cheapPath;
    private javax.swing.JFrame jf_shortPath;
    // End of variables declaration//GEN-END:variables
    Graph graph;
    Viewer viewer;
    boolean loaded = false;
    File in_file;
}
