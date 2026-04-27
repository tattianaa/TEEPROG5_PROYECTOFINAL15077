package logica;

import java.util.ArrayList;
import java.util.List;
import modelo.Proveedor;

public class ProveedorLogica {

    // Lista privada
    private List<Proveedor> proveedores;

    // Constructor
    public ProveedorLogica() {
        proveedores = new ArrayList<>();
    }

    // Obtener copia de la lista
    public List<Proveedor> getProveedores() {
        return new ArrayList<>(proveedores);
    }

    // Validar datos
    public String validar(String codigo, String nombre, String ruc, String telefono) {

        // Código: formato PRV001 (3 letras + 3 números)
        if (!codigo.matches("[A-Z]{3}[0-9]{3}")) {
            return "El código debe tener el formato ABC123 (3 letras y 3 números).";
        }

        // Código duplicado
        if (Gestionproveedor(codigo) != -1) { 
            return "Ese código de proveedor ya existe.";
        }

        // Nombre: solo letras y espacios
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            return "El nombre solo debe contener letras.";
        }

        // RUC: exactamente 11 dígitos
        if (!ruc.matches("\\d{11}")) {
            return "El RUC debe tener exactamente 11 dígitos numéricos.";
        }

        // Teléfono: exactamente 9 dígitos
        if (!telefono.matches("\\d{9}")) {
            return "El teléfono debe tener exactamente 9 dígitos numéricos.";
        }

        return "OK";
    }
    
    public int Gestionproveedor(String codigo) {
        for (int i = 0; i < proveedores.size(); i++) {
            if (proveedores.get(i).getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }
<<<<<<< HEAD

    // Validar datos
    public String validar(String codigo, String nombre, String ruc, String telefono) {

        // Código: formato PRV001 (3 letras + 3 números)
        if (!codigo.matches("[A-Z]{3}[0-9]{3}")) {
            return "El código debe tener el formato ABC123 (3 letras y 3 números).";
        }

        // Código duplicado
        if (buscarProveedor(codigo) != -1) {
            return "Ese código de proveedor ya existe.";
        }

        // Nombre: solo letras y espacios
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            return "El nombre solo debe contener letras.";
        }

        // RUC: exactamente 11 dígitos
        if (!ruc.matches("\\d{11}")) {
            return "El RUC debe tener exactamente 11 dígitos numéricos.";
        }

        // Teléfono: exactamente 9 dígitos
        if (!telefono.matches("\\d{9}")) {
            return "El teléfono debe tener exactamente 9 dígitos numéricos.";
        }

        return "OK";
=======
    
    public void Gestionproveedor(String codigo, String nombre, String ruc, String telefono) {
        Proveedor p = new Proveedor(codigo, nombre, ruc, telefono);
        proveedores.add(p);
>>>>>>> bb1c1d979ec4fa860ed65bcc4568d4dbef3145f1
    }

    // Devuelve lista de proveedores en formato "CODIGO - Nombre" para mostrar en combo
    public List<String> getProveedoresFormato() {
        List<String> lista = new ArrayList<>();
        for (Proveedor p : proveedores) {
            lista.add(p.getCodigo() + " - " + p.getNombre());
        }
        return lista;
    }
}
