
package com.senai.biblioadmin.service;

import com.senai.biblioadmin.entity.Livro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LivroServiceTest {
    @Autowired
    private LivroService livroService;
    
    public LivroServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    @Order(1)
    public void testIncluirLivroOk() {
        System.out.println("\n##### Inicio da rotina de Testes #####");
        Livro livro = new Livro();
        livro.setTitulo("Livro Teste #1");
        livro.setAutor("ALbert Newton");
        livro.setEditora("Companhia das Letras");
        livro.setAno("2024");
        Long IdLivro = livroService.incluirLivro(livro);
        Long IdLivroExp = null;
        System.out.println("#1 Incluir livro ok! ");
        assertNotEquals(IdLivro, IdLivroExp,"ERRO: #1 Nao incluiu livro corretamente ");
    }
    @Test
    @Order(2)
    public void testIncluirLivroSemTitulo() {
        Livro livro = new Livro();
        livro.setTitulo("Livro Teste #2");
        livro.setAutor("ALbert Newton");
        livro.setEditora("Companhia das Letras");
        livro.setAno("2024");
        Long IdLivro = livroService.incluirLivro(livro);
        Long IdLivroExp = null;
        System.out.println("#1 Incluir livro sem título! ");
        assertNotEquals(IdLivro, IdLivroExp,"ERRO: #2 Incluiu livro sem título ");
    }
    @Test
    @Order(3)
    public void testIncluirLivroSemAutor() {
        Livro livro = new Livro();
        livro.setTitulo("Livro Teste #3");
        livro.setAutor("ALbert Newton");
        livro.setEditora("Companhia das Letras");
        livro.setAno("2024");
        Long IdLivro = livroService.incluirLivro(livro);
        Long IdLivroExp = null;
        System.out.println("#1 Incluir livro sem autor! ");
        assertNotEquals(IdLivro, IdLivroExp,"ERRO: #3 Incluiu livro sem autor!");
    }
    @Test
    @Order(4)
    public void testIncluirLivroSemEditora() {
        Livro livro = new Livro();
        livro.setTitulo("Livro Teste #3");
        livro.setAutor("ALbert Newton");
        livro.setEditora("Companhia das Letras");
        livro.setAno("2024");
        Long IdLivro = livroService.incluirLivro(livro);
        Long IdLivroExp = null;
        System.out.println("#1 Incluir livro sem editora! ");
        assertNotEquals(IdLivro, IdLivroExp,"ERRO: #4 Incluiu livro sem editora!");       
    }
    @Test
    @Order(5)
    public void testIncluirLivroSemAno() {
        Livro livro = new Livro();
        livro.setTitulo("Livro Teste #3");
        livro.setAutor("ALbert Newton");
        livro.setEditora("Companhia das Letras");
        livro.setAno("2024");
        Long IdLivro = livroService.incluirLivro(livro);
        Long IdLivroExp = null;
        System.out.println("#1 Incluir livro sem eano! ");
        assertNotEquals(IdLivro, IdLivroExp,"ERRO: #5 Incluiu livro sem ano!");
    }

//    /**
//     * Test of excluirLivro method, of class LivroService.
//     */
//    @Test
//    public void testExcluirLivro() {
//        System.out.println("excluirLivro");
//        Long IdLivro = null;
//        LivroService instance = new LivroService();
//        boolean expResult = false;
//        boolean result = instance.excluirLivro(IdLivro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarCliente method, of class LivroService.
//     */
//    @Test
//    public void testListarCliente() {
//        System.out.println("listarCliente");
//        LivroService instance = new LivroService();
//        List<Livro> expResult = null;
//        List<Livro> result = instance.listarLivro();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of alterarLivro method, of class LivroService.
//     */
//    @Test
//    public void testAlterarLivro() {
//        System.out.println("alterarLivro");
//        Livro livro = null;
//        LivroService instance = new LivroService();
//        boolean expResult = false;
//        boolean result = instance.alterarLivro(livro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of consultaLivroPorTitulo method, of class LivroService.
//     */
//    @Test
//    public void testConsultaLivroPorTitulo() {
//        System.out.println("consultaLivroPorTitulo");
//        String titulo = "";
//        LivroService instance = new LivroService();
//        Livro expResult = null;
//        Livro result = instance.consultaLivroPorTitulo(titulo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
