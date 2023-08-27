package uniderp.loo.escola;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Aluno A1 = new Aluno();
        A1.setCodigo(5);
        A1.setCpf("08348916113");
        A1.setEndereco("Rua Pedro Nicaretta");
        A1.setNome("João Vitor");
        A1.setDataNascimento(LocalDate.of(2003, 10, 17));
        A1.setRg("544014104");
        A1.setTelefone("67996937498");
        A1.setMatricula("129707613114");
        A1.setDataMatricula(LocalDate.of(2022, 03, 01));
        A1.setDataInsercao(LocalDate.now());
        
    }

}