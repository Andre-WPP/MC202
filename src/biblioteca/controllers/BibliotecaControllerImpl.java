package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;

import biblioteca.models.Items.MultimediaItemInterface;
import biblioteca.models.Members.MemberInterface;

public class BibliotecaControllerImpl implements BibliotecaController {
    private List<MultimediaItemInterface> itens;

    public BibliotecaControllerImpl() {
        itens = new ArrayList<>();
    }

    @Override
    public List<MultimediaItemInterface> consultarItensDisponiveis() {
        return itens;
    }

    @Override
    public boolean emprestarItem(MemberInterface membro, MultimediaItemInterface item) {
        // Lógica de empréstimo
        return true;
    }

    @Override
    public boolean devolverItem(MemberInterface membro, MultimediaItemInterface item) {
        // Lógica de devolução
        return true;
    }
}