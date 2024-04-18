/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tabla;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        ST2<Integer, String> st = new ST2<>();

        // Agregar elementos a la tabla
        st.put(5, "Cinco");
        st.put(3, "Tres");
        st.put(8, "Ocho");
        st.put(1, "Uno");
        st.put(4, "Cuatro");
        st.put(7, "Siete");
        st.put(9, "Nueve");

        // Mostrar el valor asociado a una clave
        System.out.println("Valor asociado a la clave 3: " + st.get(3));

        // Verificar si la tabla contiene una clave
        System.out.println("¿La tabla contiene la clave 6? " + st.contains(6));

        // Eliminar una clave de la tabla
        st.delete(4);
        System.out.println("Después de eliminar la clave 4, ¿la tabla contiene la clave 4? " + st.contains(4));

        // Mostrar el tamaño de la tabla
        System.out.println("Tamaño de la tabla: " + st.size());

        // Mostrar la clave mínima y máxima
        System.out.println("Clave mínima: " + st.min());
        System.out.println("Clave máxima: " + st.max());

        // Mostrar la clave más cercana menor o igual a una clave dada
        System.out.println("Clave más cercana menor o igual a 6: " + st.floor(6));

        // Mostrar la clave más cercana mayor o igual a una clave dada
        System.out.println("Clave más cercana mayor o igual a 6: " + st.ceiling(6));

        // Mostrar el número de claves menores que una clave dada
        System.out.println("Número de claves menores que 6: " + st.rank(6));

        // Mostrar la clave de rango k
        System.out.println("Clave de rango 2: " + st.select(2));

        // Eliminar la clave mínima y máxima
        st.deleteMin();
        st.deleteMax();

        // Mostrar el tamaño de la tabla después de eliminar la mínima y máxima
        System.out.println("Tamaño de la tabla después de eliminar la mínima y máxima: " + st.size());
    }
}

