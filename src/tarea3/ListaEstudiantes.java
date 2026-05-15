package tarea3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaEstudiantes {
    private List<Estudiante> lista = new ArrayList<>();

    public void agregar(Estudiante e) {
        lista.add(e);
    }

    public void eliminarPorCodigo(int codigo) {
        Iterator<Estudiante> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().getCodigo() == codigo) {
                it.remove();
            }
        }
    }

    public void mostrarTodos() {
        for (Estudiante e : lista) {
            System.out.println(e);
        }
    }
}