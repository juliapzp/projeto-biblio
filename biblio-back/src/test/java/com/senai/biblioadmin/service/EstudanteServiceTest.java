
//package com.senai.biblioadmin.service;
//
//import com.senai.biblioadmin.entity.Estudante;
//import java.util.List;
//import java.util.Random;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//
//@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class EstudanteServiceTest {
//    @Autowired
//    private EstudanteService estudanteService;
//    
//    private final Random random = new Random();
//    
//    private final String nomes[] = { "Ana", "Anita", "Anabela", "Aroldo",
//                       "Braulio", "Carlos", "Diogo", "Fernando","Arnaldo", "Antonio","Abel",
//                       "Giuliano", "Gary", "James", "Steave", "Drauzio", "Denis", "Evandro", "Ester",
//                       "Michel", "Joe", "John", "Pedro", "Eva", "Fábio", "Gil",
//                       "Taylor", "Marcos","Nora", "Yolanda", "Gilson", "Heitor", "Helio" };
//    
//    private final String sobrenome[] = { "Braga", "Velasques", "Gomes", "Costa",
//                       "Silva", "Santos", "Biden", "Deere", "Pires", "Pereira", "Teixeira", "Trevor",
//                       "Cintra", "Magalhães", "Melo", "Ribeiro","Santana", "Carvalho", "Mestieri",
//                       "Oliveira", "Ferreira", "Marchi", "Rocha", "Sauro", "Mendes", "Leite", "Vilani",
//                       "Santos", "Benedetti","Statan", "Collin", "Vieira", "Fernandes", "Pinheiro" };
//    
//    
//    public EstudanteServiceTest() {
//    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {        
//        System.out.println("\n#########  Fim dos Testes #############");
//        System.out.println("#######################################");
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
//    @Test
//    @Order(0)
//    public void testIncluirEstudantes(){
//        int qtdEstu = 120;
//        System.out.println("\n# Incluindo " + qtdEstu + " estudantes aleatorios...");
//        for(int i=1;i<=qtdEstu;i++){
//            Estudante estud = new Estudante();
//            estud.setNome(geraNomes());
//            estud.setEmail( estud.getNome().replace(" ","_").toLowerCase() + "@email.com" );
//            estud.setSenha("senha");
//            String mat = this.geraRandomico(6);
//            estud.setMatricula( Long.valueOf(mat) );
//            estud.setTelefone("48" + geraRandomico(9));
//            estud.setIsBiblio(false);
//            estudanteService.incluirEstudante(estud);            
//            assertTrue(true,"#0 Erro: Erro ao inserir estudantes, verifique... ");
//        }
//    }
//    @Test
//    @Order(2)
//    public void testIncluirEstudanteSemNome() {
//
//        Estudante estudante = new Estudante();
//        //estudante.setNome("Estudante Teste #2");
//        estudante.setEmail("estudante_2@gmail.com");
//        estudante.setSenha("senha");
//        estudante.setTelefone("48999995878");
//        String mat = this.geraRandomico(6);
//        estudante.setMatricula( Long.valueOf(mat) );
//        Long IdEstudante = estudanteService.incluirEstudante(estudante);
//        Long IdEstudanteExp = null;
//        System.out.println("#2 Incluir estudante sem nome ");
//        assertEquals(IdEstudante, IdEstudanteExp,"ERRO: #2 Incluiu estudante sem nome! ");
//    }
//    @Test
//    @Order(3)
//    public void testIncluirEstudanteSemMatricula() {
//        Estudante estudante = new Estudante();
//        estudante.setNome("Estudante Teste #3");
//        estudante.setEmail("estudante_3@gmail.com");
//        estudante.setSenha("senha");
//        estudante.setTelefone("48999995878");
//        estudante.setMatricula(null);
//        Long IdEstudante = estudanteService.incluirEstudante(estudante);
//        Long IdEstudanteExp = null;
//        System.out.println("#3 Incluir estudante sem matricula ");
//        assertEquals(IdEstudante, IdEstudanteExp,"ERRO: #3 Incluiu estudante sem matricula! ");
//    }
//    @Test
//    @Order(4)
//    public void incluirEstudanteMatriculaCadastrada(){
//        System.out.println("\n#######################################");
//        System.out.println("#######  Inicio dos Testes ############\n");
//        System.out.println("#4 Incluir estudante com matricula cadastrada");
//        Estudante estud = new Estudante();
//        estud.setEmail("estudante@email.com");
//        estud.setNome("Nome Estudante#4");
//        estud.setSenha("senha");
//        estud.setTelefone("48 99999999");
//        List<Estudante> listaEstud = estudanteService.listarEstudantes();
//        Long matricula = listaEstud.get(0).getMatricula();
//        estud.setMatricula(matricula);
//        Long IdEstudante = estudanteService.incluirEstudante(estud);
//        Long idEsperado = null;
//        assertEquals(IdEstudante, idEsperado,"#4 ERRO: Foi inserido Estudante com matricula duplicada...");        
//    }
//    @Test
//    @Order(5)
//    public void testIncluirEstudanteSemEmail() {
//        Estudante estudante = new Estudante();
//        estudante.setNome("Estudante Teste #3");
//        //estudante.setEmail("estudante_3@gmail.com");
//        estudante.setSenha("senha");
//        estudante.setTelefone("48999995878");
//        String mat = this.geraRandomico(6);
//        estudante.setMatricula( Long.valueOf(mat) );
//        Long IdEstudante = estudanteService.incluirEstudante(estudante);
//        Long IdEstudanteExp = null;
//        System.out.println("#5 Incluir estudante sem email ");
//        assertEquals(IdEstudante, IdEstudanteExp,"ERRO: #5 Incluiu estudante sem email! ");
//    }
//    @Test
//    @Order(6)
//    public void testIncluirEstudanteSemTelefone() {
//        Estudante estudante = new Estudante();
//        estudante.setNome("Estudante Teste #6");
//        estudante.setEmail("estudante_6@gmail.com");
//        estudante.setSenha("senha");
//        //estudante.setTelefone("48999995878");
//        String mat = this.geraRandomico(6);
//        estudante.setMatricula( Long.valueOf(mat) );
//        Long IdEstudante = estudanteService.incluirEstudante(estudante);
//        Long IdEstudanteExp = null;
//        System.out.println("#6 Incluir estudante sem telefone ");
//        assertNotEquals(IdEstudante, IdEstudanteExp,"ERRO: #6 Nao incluiu estudante sem telefone! ");
//    }
//    @Test
//    @Order(7)
//    public void testIncluirEstudanteSemSenha() {
//        Estudante estudante = new Estudante();
//        estudante.setNome("Estudante Teste #7");
//        estudante.setEmail("estudante_7@gmail.com");
//        //estudante.setSenha("senha");
//        estudante.setTelefone("48999995878");
//        String mat = this.geraRandomico(6);
//        estudante.setMatricula( Long.valueOf(mat) );
//        Long IdEstudante = estudanteService.incluirEstudante(estudante);
//        Long IdEstudanteExp = null;
//        System.out.println("#7 Incluir estudante sem senha ");
//        assertEquals(IdEstudante, IdEstudanteExp,"ERRO: #7 Incluiu estudante sem senha! ");
//    }
//    @Test
//    @Order(8)
//    public void testLoginEstudante() {
//        List<Estudante> listaEstudante = estudanteService.listarEstudantes();
//        if( ! listaEstudante.isEmpty() ){
//            Long matriculaBD = listaEstudante.get(1).getMatricula();
//            String senha = "senha";
//            Estudante estudante = estudanteService.loginEstudante(matriculaBD, senha);
//            Long IdEstudanteExp = null;
//            System.out.println("#8 Login estudante cadastrado! ");
//            assertNotEquals(estudante, IdEstudanteExp,"ERRO: #8 Falha de Login do estudante! ");
//        } else {
//            assertFalse(true,"#8 ERRO: Sem estudantes para testar Login! ");
//        }        
//    }
//    @Test
//    @Order(9)
//    public void testLoginEstudanteMatriculaInexistente() {
//         List<Estudante> listaEstudante = estudanteService.listarEstudantes();
//        if( ! listaEstudante.isEmpty() ){
//            Long matriculaBD = Long.valueOf("12312");
//            String senha = "senha";
//            Estudante estudante = estudanteService.loginEstudante(matriculaBD, senha);
//            Long IdEstudanteExp = null;
//            System.out.println("#9 Login estudante matricula inexistente! ");
//            assertEquals(estudante, IdEstudanteExp,"ERRO: #8 Falha de Login do estudante matricula inexistente! ");
//        } else {
//            assertFalse(true,"#8 ERRO: Sem estudantes para testar Login! ");
//        } 
//    }
//
//    @Test
//    @Order(10)
//    public void testExcluirEstudanteMatriculaCadastrada() {
//        List<Estudante> listEstudante = estudanteService.listarEstudantes();
//        if( ! listEstudante.isEmpty() ){
//            Long IdEstudante = listEstudante.get(1).getIdEstudante();
//            Boolean result = estudanteService.excluirEstudante(IdEstudante);
//            Boolean resultExp = true;
//            System.out.println("#10 Excluir estudante com matricula cadastrada");
//            assertEquals(result, resultExp,"ERRO: #10 Nao Excluiu estudante com matricula cadastrada! ");
//        } else {
//            assertFalse(true,"#10 ERRO: Sem estudante para testar exclusao!");
//        }        
//    }        
//    @Test
//    @Order(11)
//    public void testAleterarEstudante(){
//        List<Estudante> listEstudante = estudanteService.listarEstudantes();
//        System.out.println("#11 Alterar estudante ");
//        Estudante estud = estudanteService.listarEstudantes().get(0);
//        estud.setMatricula(listEstudante.get(0).getMatricula());
//        estud.setNome("Nome Alterado #1");
//        estud.setEmail(listEstudante.get(0).getEmail());
//        estud.setSenha(listEstudante.get(0).getSenha());
//        estud.setTelefone("48" + geraRandomico(9));
//        Boolean result = estudanteService.alterarEstudante(estud);
//        Boolean resultEsperado = false;
//        assertNotEquals(result,resultEsperado,"#11 Erro: Foi alterado Estudante ..."); 
//    }
//    @Test
//    @Order(12)
//    public void testAleterarEstudanteSemNome(){
//        List<Estudante> listEstudante = estudanteService.listarEstudantes();
//        System.out.println("#11 Alterar estudante ");
//        Estudante estud = estudanteService.listarEstudantes().get(0);
//        estud.setMatricula(listEstudante.get(0).getMatricula());
//        estud.setNome(null);
//        estud.setEmail("email@alterado.com");
//        estud.setSenha(listEstudante.get(0).getSenha());
//        estud.setTelefone("48" + geraRandomico(9));
//        Boolean result = estudanteService.alterarEstudante(estud);
//        Boolean resultEsperado = false;
//        assertEquals(result,resultEsperado,"#11 Erro: Foi alterado Estudante sem nome ..."); 
//    }
//    @Test
//    @Order(13)
//    public void testAlterarEstudanteSemMatricula(){
//        List<Estudante> listEstudante = estudanteService.listarEstudantes();
//        System.out.println("#13 Alterar estudante sem matricula");
//        Estudante estud = estudanteService.listarEstudantes().get(0);
//        estud.setMatricula(null);
//        estud.setIsBiblio(false);
//        estud.setNome("Nome Alterado #2");
//        estud.setEmail(listEstudante.get(0).getEmail());
//        estud.setSenha(listEstudante.get(0).getSenha());
//        estud.setTelefone("48" + geraRandomico(9));
//        Boolean result = estudanteService.alterarEstudante(estud);
//        Boolean resultEsperado = false;
//        assertEquals(result,resultEsperado,"#13 Erro: Foi alterado Estudante sem matricula...");   
//    }
//    @Test
//    @Order(14)
//    public void testAlterarEstudanteMatriculaCadastrada(){
//        List<Estudante> listEstudante = estudanteService.listarEstudantes();
//        System.out.println("#14 Alterar estudante com matricula cadastrada");
//        Estudante estud = estudanteService.listarEstudantes().get(0);
//       estud.setMatricula(listEstudante.get(0).getMatricula());
//        estud.setNome("Nome Alterado #1");
//        estud.setEmail(listEstudante.get(0).getEmail());
//        estud.setSenha(listEstudante.get(0).getSenha());
//        estud.setTelefone("48" + geraRandomico(9));
//        Boolean result = estudanteService.alterarEstudante(estud);
//        Boolean resultEsperado = false;
//        assertEquals(result,resultEsperado,"#14 Erro: Foi alterado Estudante com matricula cadastrada");   
//    }
//    @Test
//    @Order(15)
//    public void alterarEstudanteSemEmail(){
//        List<Estudante> listEstudante = estudanteService.listarEstudantes();
//        System.out.println("#15 Alterar estudante com Sem email");
//        Estudante estud = estudanteService.listarEstudantes().get(0);
//        estud.setMatricula(listEstudante.get(0).getMatricula());
//        estud.setNome("Nome Alterado #1");
//        estud.setEmail(null);
//        estud.setSenha(listEstudante.get(0).getSenha());
//        estud.setTelefone("48" + geraRandomico(9));
//        Boolean result = estudanteService.alterarEstudante(estud);
//        Boolean resultEsperado = false;
//        assertEquals(result,resultEsperado,"#15 Erro: Foi alterado Estudante sem email");   
//    }
//    @Test
//    @Order(16)
//    public void alterarEstudanteSemTelefone(){
//        List<Estudante> listEstudante = estudanteService.listarEstudantes();
//        System.out.println("#16 Alterar estudante sem telefone");
//        Estudante estud = estudanteService.listarEstudantes().get(0);
//       estud.setMatricula(listEstudante.get(0).getMatricula());
//        estud.setNome(listEstudante.get(0).getNome());
//        estud.setEmail(listEstudante.get(0).getEmail());
//        estud.setSenha(listEstudante.get(0).getSenha());
//        estud.setTelefone(null);
//        Boolean result = estudanteService.alterarEstudante(estud);
//        Boolean resultEsperado = true;
//        assertNotEquals(result,resultEsperado,"#16 Erro: Foi alterado Estudante sem telefone");   
//    }
//    @Test
//    @Order(17)
//    public void alterarEstudanteSemSenha(){
//        List<Estudante> listEstudante = estudanteService.listarEstudantes();
//        System.out.println("#16 Alterar estudante sem senha");
//        Estudante estud = estudanteService.listarEstudantes().get(0);
//         estud.setMatricula(listEstudante.get(0).getMatricula());
//        estud.setNome(listEstudante.get(0).getNome());
//        estud.setEmail(listEstudante.get(0).getEmail());
//        estud.setSenha(null);
//        estud.setTelefone("48" + geraRandomico(9));
//        Boolean result = estudanteService.alterarEstudante(estud);
//        Boolean resultEsperado = false;
//        assertEquals(result,resultEsperado,"#16 Erro: Foi alterado Estudante sem senha");   
//    }
//
////    
////
////    @Test
////    public void testLoginEstudante() {
////        System.out.println("loginEstudante");
////        Long matricula = null;
////        String senha = "";
////        EstudanteService instance = new EstudanteService();
////        Estudante expResult = null;
////        Estudante result = instance.loginEstudante(matricula, senha);
////        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
////    }
////
////    @Test
////    public void testHashSenha() {
////        System.out.println("hashSenha");
////        String passwd = "";
////        EstudanteService instance = new EstudanteService();
////        String expResult = "";
////        String result = instance.hashSenha(passwd);
////        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
////    }
////
////    @Test
////    public void testAlterarEstudante() {
////        System.out.println("alterarEstudante");
////        Estudante estudante = null;
////        EstudanteService instance = new EstudanteService();
////        boolean expResult = false;
////        boolean result = instance.alterarEstudante(estudante);
////        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
////    }
////
////    @Test
////    public void testExcluirEstudantePorId() {
////        System.out.println("excluirEstudantePorId");
////        Long IdEstudante = null;
////        EstudanteService instance = new EstudanteService();
////        boolean expResult = false;
////        boolean result = instance.excluirEstudantePorId(IdEstudante);
////        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
////    }
////
////    @Test
////    public void testExcluirEstudantePorMatricula() {
////        System.out.println("excluirEstudantePorMatricula");
////        Long matricula = null;
////        EstudanteService instance = new EstudanteService();
////        boolean expResult = false;
////        boolean result = instance.excluirEstudantePorMatricula(matricula);
////        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
////    }
////
////    @Test
////    public void testConsultaEstudantePorId() {
////        System.out.println("consultaEstudantePorId");
////        Long IdEstudante = null;
////        EstudanteService instance = new EstudanteService();
////        Estudante expResult = null;
////        Estudante result = instance.consultaEstudantePorId(IdEstudante);
////        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
////    }
////
////    @Test
////    public void testConsultaEstudantePorMatricula() {
////        System.out.println("consultaEstudantePorMatricula");
////        Long matricula = null;
////        EstudanteService instance = new EstudanteService();
////        Estudante expResult = null;
////        Estudante result = instance.consultaEstudantePorMatricula(matricula);
////        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
////    }
////
////    @Test
////    public void testConsultaEstudantePorEmail() {
////        System.out.println("consultaEstudantePorEmail");
////        String email = "";
////        EstudanteService instance = new EstudanteService();
////        Estudante expResult = null;
////        Estudante result = instance.consultaEstudantePorEmail(email);
////        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
////    }
////
////    @Test
////    public void testConsultaEstudantePorNome() {
////        System.out.println("consultaEstudantePorNome");
////        String nome = "";
////        EstudanteService instance = new EstudanteService();
////        List<Estudante> expResult = null;
////        List<Estudante> result = instance.consultaEstudantePorNome(nome);
////        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
////    }
////
////    @Test
////    public void testListarEstudante() {
////        System.out.println("listarEstudante");
////        Integer pagina = null;
////        EstudanteService instance = new EstudanteService();
////        List<Estudante> expResult = null;
////        List<Estudante> result = instance.listarEstudante(pagina);
////        assertEquals(expResult, result);
////        fail("The test case is a prototype.");
////    }
//    
//    public String geraRandomico(int qtd){
//         
//        String qtdNum = "";
//        for(int i=1;i<=qtd;i++){
//             qtdNum = qtdNum + "9";
//        }
//        int numero = random.nextInt(Integer.valueOf(qtdNum));
//        String snumero = String.valueOf(numero);
//        Integer dif = qtd - snumero.length();
//        if( dif > 0 ){
//            return (snumero+qtdNum).substring(0,qtd);            
//        }
//        return snumero;
//    }      
//    public String geraNomes(){
//        int idxnome = random.nextInt(nomes.length -1);
//        int idxsobre = random.nextInt(sobrenome.length -1);
//        return nomes[idxnome] + " " + sobrenome[idxsobre];
//    }
//    
//    
//
//}
