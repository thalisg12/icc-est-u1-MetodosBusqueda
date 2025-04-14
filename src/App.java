public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda metodos = new MetodosBusqueda();

        int[] datos = { 5, 10, 15, 20, 25, 30, 35 };

        int resultado = metodos.busquedaLineal(datos);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}
