package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;

import biblioteca.models.Members.MemberInterface;

public class MembroControllerImpl implements MembroController {
    private List<MemberInterface> membros;

    public MembroControllerImpl() {
        membros = new ArrayList<>();
    }

    @Override
    public List<MemberInterface> listarMembros() {
        return membros;
    }

    @Override
    public MemberInterface buscarMembroPorIdentificacao(String identificacao) {
        // Lógica de busca
        return null;
    }
}