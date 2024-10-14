package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ExampleTest {

    Example example = new Example();

    // 1. Test para sumar dos números
    @Test
    public void testSumar() {
        assertEquals(5, example.sumar(2, 3));
        assertEquals(-1, example.sumar(2, -3));
    }

    // 2. Test que lanza excepción si el número es negativo
    @Test
    public void testCheckPositivo() {
        assertTrue(example.checkPositivo(5));
        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(-1));
    }

    // 3. Test para contar el número de letras 'a' en una cadena
    @Test
    public void testContarLetrasA() {
        assertEquals(3, example.contarLetrasA("abracadabra"));
        assertEquals(0, example.contarLetrasA("xyz"));
    }

    // 4. Test para verificar si la lista contiene un elemento
    @Test
    public void testContieneElemento() {
        List<String> lista = Arrays.asList("manzana", "banana", "pera");
        assertTrue(example.contieneElemento(lista, "banana"));
        assertFalse(example.contieneElemento(lista, "uva"));
    }

    // 5. Test para revertir una cadena
    @Test
    public void testRevertirCadena() {
        assertEquals("edoc", example.revertirCadena("code"));
        assertEquals("avaJ", example.revertirCadena("Java"));
    }

    // 6. Test para calcular el factorial de un número
    @Test
    public void testFactorial() {
        assertEquals(120, example.factorial(5));
        assertEquals(1, example.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> example.factorial(-1));
    }

    // 7. Test para verificar si un número es primo
    @Test
    public void testEsPrimo() {
        assertTrue(example.esPrimo(7));
        assertFalse(example.esPrimo(4));
        assertFalse(example.esPrimo(1));
    }

    // 8. Test para el método con retraso
    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        assertEquals("Listo después de retraso", example.mensajeConRetraso());
    }

    // 9. Test para convertir una lista de enteros a lista de strings
    @Test
    public void testConvertirAString() {
        List<Integer> numeros = Arrays.asList(1, 2, 3);
        List<String> esperado = Arrays.asList("1", "2", "3");
        assertEquals(esperado, example.convertirAString(numeros));
    }

    // 10. Test para calcular la media de una lista de enteros
    @Test
    public void testCalcularMedia() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
        assertEquals(2.5, example.calcularMedia(numeros));
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(Collections.emptyList()));
    }

    // 11. Test para convertir lista de strings a un string con mayúsculas
    @Test
    public void testConvertirListaAString() {
        List<String> lista = Arrays.asList("apple", "banana", null, "pear");
        assertEquals("APPLE,BANANA,NULL,PEAR", example.convertirListaAString(lista));

        List<String> listaVacia = Collections.emptyList();
        assertEquals("", example.convertirListaAString(listaVacia));
    }
}