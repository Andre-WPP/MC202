package biblioteca.views;

import java.util.List;

import biblioteca.models.Members.MemberInterface;

public interface RelatorioView {
    void mostrarListaMembros(List<MemberInterface> membros);
    void mostrarDetalhesMembro(MemberInterface membro);
}
