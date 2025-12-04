package iterator;

import java.util.Iterator;

public class Cidade {
    public static Integer contarPessoasCadastroAtualizadoUBS(UBS ubs){
        int count = 0;
        for(Pessoa pessoa : ubs){
            if(pessoa.isAtualizado()){
                count++;
            }
        }
        return count;
    }

    public static Integer contarTotalPessoasUBS(UBS ubs){
        int count = 0;
        for(Iterator p = ubs.iterator(); p.hasNext();){
            count++;
            p.next();
        }
        return count;
    }
}
