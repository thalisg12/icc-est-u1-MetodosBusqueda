public class MetodosBusqueda {
    public int busquedaLineal(int[] arreglo) {
        int num = 15;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
