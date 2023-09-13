package biblioteca.views;

import java.util.List;

import biblioteca.models.Members.MemberInterface;

public interface MembroView {
    void mostrarListaMembros(List<MemberInterface> membros);
    void mostrarDetalhesMembro(MemberInterface membro);
}