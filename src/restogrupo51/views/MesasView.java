
package restogrupo51.views;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import restogrupo51.accesoAdatos.MesaData;
import restogrupo51.entidades.Mesa;

public class MesasView extends javax.swing.JInternalFrame {
    MesaData mesa = new MesaData();
    Principal principal;
    
    private DefaultTableModel modelo = new DefaultTableModel() {
        
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
   
    public MesasView(Principal principal) {
        this.principal = principal;
        initComponents();
        armarCabecera();
        cargarTabla();
        getContentPane().setBackground(new Color(255,205,110));
            
        // Cambiar el color de fondo de las cabeceras de columna
        JTableHeader header = jtblMesa.getTableHeader();
        header.setDefaultRenderer(new CustomHeaderRenderer());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
      regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesActiva = new javax.swing.ButtonGroup();
        grupoBotonesLibre = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblMesa = new javax.swing.JTable();
        jbtnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jtxtNumero = new javax.swing.JTextField();
        jtxtCapacidad = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jtxtBuscarId = new javax.swing.JTextField();
        jbtnBuscarPorId = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jradbtnLibre = new javax.swing.JRadioButton();
        jradbtnOcupada = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jtxtBuscarNumero = new javax.swing.JTextField();
        jbtnBuscarPorNumero = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gestor de Mesas");
        setPreferredSize(new java.awt.Dimension(785, 500));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesaIcon2.png"))); // NOI18N
        jLabel1.setText("Mesas");
        jLabel1.setPreferredSize(new java.awt.Dimension(108, 48));

        jtblMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtblMesaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtblMesa);

        jbtnEliminar.setBackground(new java.awt.Color(255, 205, 110));
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setPreferredSize(new java.awt.Dimension(85, 26));
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 205, 110));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Formulario Mesas");

        jLabel3.setText("ID");

        jLabel4.setText("Número");

        jLabel5.setText("Capacidad");

        jLabel6.setText("Disponibilidad");

        jtxtId.setEditable(false);
        jtxtId.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtIdCaretUpdate(evt);
            }
        });

        jbtnGuardar.setBackground(new java.awt.Color(255, 205, 110));
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jLabel9.setText("Buscar por ID");

        jtxtBuscarId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtBuscarIdMouseClicked(evt);
            }
        });

        jbtnBuscarPorId.setBackground(new java.awt.Color(255, 205, 110));
        jbtnBuscarPorId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar16px.png"))); // NOI18N
        jbtnBuscarPorId.setText("ID");
        jbtnBuscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarPorIdActionPerformed(evt);
            }
        });

        jbtnLimpiar.setBackground(new java.awt.Color(255, 205, 110));
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnModificar.setBackground(new java.awt.Color(255, 205, 110));
        jbtnModificar.setText("Modificar");
        jbtnModificar.setEnabled(false);
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        grupoBotonesLibre.add(jradbtnLibre);
        jradbtnLibre.setText("Libre");

        grupoBotonesLibre.add(jradbtnOcupada);
        jradbtnOcupada.setText("Ocupada");

        jLabel10.setText("Buscar por Número");

        jtxtBuscarNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtBuscarNumeroMouseClicked(evt);
            }
        });

        jbtnBuscarPorNumero.setBackground(new java.awt.Color(255, 205, 110));
        jbtnBuscarPorNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar16px.png"))); // NOI18N
        jbtnBuscarPorNumero.setText("#");
        jbtnBuscarPorNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarPorNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jbtnGuardar)
                .addGap(20, 20, 20)
                .addComponent(jbtnModificar)
                .addGap(20, 20, 20)
                .addComponent(jbtnLimpiar)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jradbtnLibre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jradbtnOcupada))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                        .addComponent(jtxtId)
                                        .addComponent(jtxtNumero)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jtxtBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnBuscarPorId))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtBuscarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnBuscarPorNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtxtBuscarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnBuscarPorId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnBuscarPorNumero)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jradbtnOcupada, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jradbtnLibre)))
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnModificar)
                    .addComponent(jbtnLimpiar))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        MesaData mesaData = new MesaData();
         
        if (jtblMesa.getSelectedRow() > -1) {
            String idString = jtblMesa.getValueAt(jtblMesa.getSelectedRow(), 0).toString();
            int idMesa = Integer.parseInt(idString);
            Mesa mesaBuscar = mesaData.buscarMesaPorId(idMesa);
            if (mesaBuscar.isEstadoMesa())
                mesaData.eliminarMesa(mesaBuscar.getIdMesa());
            else{
                mesaData.restaurarMesa(mesaBuscar.getIdMesa());
                jbtnEliminar.setText("Eliminar");
            }
        } else {
            try{
                Mesa mesaBuscada = mesaData.buscarMesaPorId(Integer.parseInt(jtxtId.getText()));
                if (mesaBuscada != null) {
                    if (mesaBuscada.isEstadoMesa())
                        mesaData.eliminarMesa(mesaBuscada.getIdMesa());
                    else{
                        mesaData.restaurarMesa(mesaBuscada.getIdMesa());
                        jbtnEliminar.setText("Eliminar");
                    }
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Debe buscar una mesa o seleccionar una mesa de la tabla");
            }
        }
        borrarFilas();
        cargarTabla();
        borrarDatos();
        principal.ActualizarPantallaPrincipal();
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        
        try{
            int numero = Integer.parseInt(jtxtNumero.getText());
            int capacidad = Integer.parseInt(jtxtCapacidad.getText());
            
            boolean disponibilidad = true;
            if(grupoBotonesLibre.isSelected(jradbtnOcupada.getModel())){
                disponibilidad = false;
            }
                        
            Mesa mesa = new Mesa(numero,capacidad,disponibilidad,true);
            MesaData mesaData = new MesaData();
            
            if (mesaData.cantidadMesa()<=8){
                if (mesa != null) {
                    mesaData.guardarMesa(mesa);
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "No se pueden Agregar mas de 8 Mesas. Restaure Mesas Eliminadas si nececita.");
            }
 
            borrarFilas();
            cargarTabla();
            borrarDatos();
            
            principal.ActualizarPantallaPrincipal();
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un número entero de Número o Capacidad");
            jtxtCapacidad.setText("");
            jtxtNumero.setText("");            
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Debe completar los campos TODOS");
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnBuscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarPorIdActionPerformed
    
        try{
            Mesa mesa = new Mesa();
            MesaData mesaData = new MesaData();
            
            mesa = mesaData.buscarMesaPorId(Integer.parseInt(jtxtBuscarId.getText()));
            if (mesa != null) {
                jtxtId.setText(String.valueOf(mesa.getIdMesa()));
                jtxtNumero.setText(String.valueOf(mesa.getNumeroMesa()));
                jtxtCapacidad.setText(String.valueOf(mesa.getCapacidad()));
                if(mesa.isEstadoMesa()){
                    jbtnEliminar.setText("Eliminar");
                }else{
                    jbtnEliminar.setText("Restaurar");
                }
                if(mesa.isDisponibilidad() == true){
                    grupoBotonesLibre.setSelected(jradbtnLibre.getModel(), true);
                }else{
                    grupoBotonesLibre.setSelected(jradbtnOcupada.getModel(), true);
                }
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un número entero");
        }
    }//GEN-LAST:event_jbtnBuscarPorIdActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        borrarDatos();
        if (jtblMesa.getSelectedRow() ==-1)
            jbtnEliminar.setText("Eliminar");
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        
        try{
            int idMesa = Integer.parseInt(jtxtId.getText());
            int numero = Integer.parseInt(jtxtNumero.getText());
            int capacidad = Integer.parseInt(jtxtCapacidad.getText());
            
            boolean disponibilidad = true;
            if(grupoBotonesLibre.isSelected(jradbtnOcupada.getModel())){
                disponibilidad = false;
            }
                        
            MesaData mesaData = new MesaData();
            Mesa mesa = mesaData.buscarMesaPorId(idMesa);
            
            if (mesa!= null) {
                idMesa = mesa.getIdMesa();
                mesa = new Mesa(idMesa, numero, capacidad, disponibilidad, mesa.isEstadoMesa());
                mesaData.modificarMesa(mesa);
            }
            borrarFilas();
            cargarTabla();
            
            principal.ActualizarPantallaPrincipal();
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero entero");
            jtxtCapacidad.setText("");
            jtxtNumero.setText("");
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Debe completar los campos");
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jtxtBuscarIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtBuscarIdMouseClicked
        borrarDatos();
        borrarFilas();
        cargarTabla();
    }//GEN-LAST:event_jtxtBuscarIdMouseClicked

    private void jtblMesaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblMesaMousePressed
        borrarDatos();
        if (jtblMesa.getSelectedRow() > -1) {
            String idString = jtblMesa.getValueAt(jtblMesa.getSelectedRow(), 0).toString();
            int idMesa = Integer.parseInt(idString);        
        
            Mesa mesa = new Mesa();
            MesaData mesaData = new MesaData();
            
            mesa = mesaData.buscarMesaPorId(idMesa);
            if (mesa != null) {
                jtxtId.setText(String.valueOf(mesa.getIdMesa()));
                jtxtNumero.setText(String.valueOf(mesa.getNumeroMesa()));
                jtxtCapacidad.setText(String.valueOf(mesa.getCapacidad()));
                
                if(mesa.isDisponibilidad() == true){
                    grupoBotonesLibre.setSelected(jradbtnLibre.getModel(), true);
                }else{
                    grupoBotonesLibre.setSelected(jradbtnOcupada.getModel(), true);
                }
                
                if(mesa.isEstadoMesa() == true){
                    jbtnEliminar.setText("Eliminar");
                }else{
                    jbtnEliminar.setText("Restaurar");
                }
            }
        }
        else
            jbtnEliminar.setText("Eliminar");
    }//GEN-LAST:event_jtblMesaMousePressed

    private void jtxtBuscarNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtBuscarNumeroMouseClicked
        borrarDatos();
        borrarFilas();
        cargarTabla();
    }//GEN-LAST:event_jtxtBuscarNumeroMouseClicked

    private void jbtnBuscarPorNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarPorNumeroActionPerformed
        try{
            Mesa mesa = new Mesa();
            MesaData mesaData = new MesaData();
            
            mesa = mesaData.buscarMesaPorNumero(Integer.parseInt(jtxtBuscarNumero.getText()));
            if (mesa != null) {
                jtxtId.setText(String.valueOf(mesa.getIdMesa()));
                jtxtNumero.setText(String.valueOf(mesa.getNumeroMesa()));
                jtxtCapacidad.setText(String.valueOf(mesa.getCapacidad()));
                if(mesa.isEstadoMesa()){
                    jbtnEliminar.setText("Eliminar");
                }else{
                    jbtnEliminar.setText("Restaurar");
                }
                if(mesa.isDisponibilidad() == true){
                    grupoBotonesLibre.setSelected(jradbtnLibre.getModel(), true);
                }else{
                    grupoBotonesLibre.setSelected(jradbtnOcupada.getModel(), true);
                }
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un número entero");
        }
    }//GEN-LAST:event_jbtnBuscarPorNumeroActionPerformed

    private void jtxtIdCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtIdCaretUpdate
        // TODO add your handling code here:
        if (!"".equals(jtxtId.getText())){
            jbtnGuardar.setEnabled(false);
            jbtnModificar.setEnabled(true);
        }
        else{
            jbtnGuardar.setEnabled(true);
            jbtnModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jtxtIdCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoBotonesActiva;
    private javax.swing.ButtonGroup grupoBotonesLibre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscarPorId;
    private javax.swing.JButton jbtnBuscarPorNumero;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JRadioButton jradbtnLibre;
    private javax.swing.JRadioButton jradbtnOcupada;
    private javax.swing.JTable jtblMesa;
    private javax.swing.JTextField jtxtBuscarId;
    private javax.swing.JTextField jtxtBuscarNumero;
    private javax.swing.JTextField jtxtCapacidad;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtNumero;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Número");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Disponibilidad");
        modelo.addColumn("Estado");
        jtblMesa.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jtblMesa.getRowCount() - 1; 
        for (; f >= 0; f--) { 
            modelo.removeRow(f);
        }
    }
    
    private void cargarTabla(){
        String disp="", act="";
        
        for (Mesa mesa : mesa.listarMesas()) {
            if (mesa.isDisponibilidad()) {
                disp = "Libre";
            } else {
                disp = "Ocupada";
            }
            if (mesa.isEstadoMesa()) {
                act = "Activa";
            } else {
                act = "Eliminada";
            }
            modelo.addRow(new Object[]{mesa.getIdMesa(), mesa.getNumeroMesa(), mesa.getCapacidad(), disp, act});
        }
    }
    
    class CustomHeaderRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Cambiar el color de fondo de la cabecera de columna
            c.setBackground(new java.awt.Color(255,205,110)); // Cambia este color según tus preferencias

            return c;
        }
    }
    
    private void borrarDatos(){
        //borrar los datos
        jtxtBuscarId.setText("");
        jtxtBuscarNumero.setText("");
        jtxtId.setText("");
        jtxtNumero.setText("");
        jtxtCapacidad.setText("");
        grupoBotonesLibre.clearSelection();
    }
}
