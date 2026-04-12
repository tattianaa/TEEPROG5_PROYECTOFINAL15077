package gui;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class InventarioLogica {
	// es el método que hará el trabajo de borrar en los dos lados
    public void eliminarPrenda(int fila, DefaultTableModel modelo, JPanel grid) {
        if (fila >= 0) {
            // 1. Borra de la tabla (Panel Gestión)
            if (fila < modelo.getRowCount()) {
                modelo.removeRow(fila);
            }      
            // 2. Borra la tarjeta (Panel Inicio)
            if (fila < grid.getComponentCount()) {
                grid.remove(fila);
                grid.revalidate();
                grid.repaint();
            } 
            JOptionPane.showMessageDialog(null, "Se eliminó de la tabla y del catálogo.");
        }
    }
    
    //???falta
    //  mover aquí toda la lógica del JDialog y los JTextField
    public void editarPrenda(int fila, DefaultTableModel modelo) { //poner pamaetros) {
        // Aquí deben investigar cómo abrir el diálogo de edición
        // y actualizar los datos usando modelo.setValueAt(...) 
        // y refrescando la tarjeta en el grid.
        
        System.out.println("El equipo está trabajando en la edición de la fila: " + fila);
        JOptionPane.showMessageDialog(null, "Método de edición en desarrollo por el equipo.");
    }

}
