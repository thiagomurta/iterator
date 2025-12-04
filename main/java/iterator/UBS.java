package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UBS implements Iterable<Pessoa>{
    private List<Pessoa> pessoas = new ArrayList<>();

    public UBS(Pessoa... pessoas) {
        this.pessoas = Arrays.asList(pessoas);
    }

    @Override
    public Iterator<Pessoa> iterator() {
        return pessoas.iterator();
    }
}
