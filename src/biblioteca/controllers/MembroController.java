package biblioteca.controllers;

import java.util.List;

import biblioteca.models.Members.MemberInterface;
import biblioteca.views.MembroView;

public interface MembroController {
    List<MemberInterface> listarMembros();
    MemberInterface buscarMembroPorIdentificacao(String identificacao);
}