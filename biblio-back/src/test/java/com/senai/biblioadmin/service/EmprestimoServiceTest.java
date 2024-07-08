//
//package com.senai.biblioadmin.service;
//
//import com.senai.biblioadmin.entity.Emprestimo;
//import com.senai.biblioadmin.entity.Estudante;
//import com.senai.biblioadmin.entity.Livro;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import static java.time.Instant.now;
//import java.util.List;
//import java.util.Locale;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class EmprestimoServiceTest {
//    
//    @Autowired
//    private EmprestimoService emprestimoService;
//    
//    @Autowired
//    private EstudanteService estudanteService;
//    
//    @Autowired
//    private LivroService livroService;
//    
//    public EmprestimoServiceTest() {
//    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
//
//    
//    @Test
//    public void testIncluirEmprestimo() throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.of("PT", "BR")); 
//        System.out.println("incluirEmprestimo");
//        Emprestimo emprestimo = new Emprestimo();
//        emprestimo.setDataEmprestimo(sdf.parse("31/10/2006"));
//        emprestimo.setDataEntrega(sdf.parse("06/11/2006"));
//        emprestimo.setDevolucao("nok");
//        List<Estudante> lista = estudanteService.listarEstudantes();
//        emprestimo.setEstudante(lista.get(0));
//        List<Livro> listaLivro = livroService.listarLivro();
//        emprestimo.setLivro(listaLivro.get(0));
//        Long idEmprestimo = emprestimoService.incluirEmprestimo(emprestimo);
//        Long expResult = null;
//        assertNotEquals(idEmprestimo, expResult, "Erro: Não incluiu emprestimo correto!");
//    }
//
//    /**
//     * Test of excluirEmprestimo method, of class EmprestimoService.
//     */
////    @Test
////    public void testExcluirEmprestimo() {
////        System.out.println("excluirEmprestimo");
////        Long IdEmprestimo = null;
////        EmprestimoService instance = new EmprestimoService();
////        boolean expResult = false;
////        boolean result = instance.excluirEmprestimo(IdEmprestimo);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of consultaEmprestimoPorId method, of class EmprestimoService.
//     */
////    @Test
////    public void testConsultaEmprestimoPorId() {
////        System.out.println("consultaEmprestimoPorId");
////        Long IdEmprestimo = null;
////        EmprestimoService instance = new EmprestimoService();
////        Emprestimo expResult = null;
////        Emprestimo result = instance.consultaEmprestimoPorId(IdEmprestimo);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of consultaEmprestimoPorEstudante method, of class EmprestimoService.
////     */
////    @Test
////    public void testConsultaEmprestimoPorEstudante() {
////        System.out.println("consultaEmprestimoPorEstudante");
////        Estudante estudante = null;
////        EmprestimoService instance = new EmprestimoService();
////        Emprestimo expResult = null;
////        Emprestimo result = instance.consultaEmprestimoPorEstudante(estudante);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of consultaEmprestimoPorLivro method, of class EmprestimoService.
////     */
////    @Test
////    public void testConsultaEmprestimoPorLivro() {
////        System.out.println("consultaEmprestimoPorLivro");
////        Livro livro = null;
////        EmprestimoService instance = new EmprestimoService();
////        Emprestimo expResult = null;
////        Emprestimo result = instance.consultaEmprestimoPorLivro(livro);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of listarEmprestimos method, of class EmprestimoService.
////     */
////    @Test
////    public void testListarEmprestimos() {
////        System.out.println("listarEmprestimos");
////        EmprestimoService instance = new EmprestimoService();
////        List<Emprestimo> expResult = null;
////        List<Emprestimo> result = instance.listarEmprestimos();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of alterarEmprestimo method, of class EmprestimoService.
////     */
////    @Test
////    public void testAlterarEmprestimo() {
////        System.out.println("alterarEmprestimo");
////        Emprestimo emprestimo = null;
////        EmprestimoService instance = new EmprestimoService();
////        boolean expResult = false;
////        boolean result = instance.alterarEmprestimo(emprestimo);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//    
//}