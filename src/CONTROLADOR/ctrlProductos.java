/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.PRODUCTO;
import VISTA.frmProductos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Estudiante
 */
public class ctrlProductos  implements MouseListener{
//1- MANDAR A LLAMAR A LAS PANTALLAS SIONO MACS //
private frmProductos Vista;
private PRODUCTO Modelo;

    public ctrlProductos(frmProductos a, PRODUCTO b) {
       this.Vista = a;
       this.Modelo = b;
       
       a.btnAgregar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == Vista.btnAgregar){
          Modelo.setNombre(Vista.txtNombre.getText());
          Modelo.setPrecio(Double.parseDouble(Vista.txtPrecio.getText()));
           Modelo.setCategoria(Vista.txtCategoria.getText());
          
         Modelo.Guardar();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
