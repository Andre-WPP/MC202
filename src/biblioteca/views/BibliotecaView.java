package biblioteca.views;

import java.util.List;

import biblioteca.models.Items.MultimediaItemInterface;

public interface BibliotecaView {
    void mostrarItensDisponiveis(List<MultimediaItemInterface> itens);
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
}