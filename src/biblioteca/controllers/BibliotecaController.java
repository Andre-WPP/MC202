package biblioteca.controllers;

import java.util.List;

import biblioteca.models.Items.MultimediaItemInterface;
import biblioteca.models.Members.MemberInterface;
import biblioteca.views.BibliotecaView;

public interface BibliotecaController {
    List<MultimediaItemInterface> consultarItensDisponiveis();
    boolean emprestarItem(MemberInterface membro, MultimediaItemInterface item);
    boolean devolverItem(MemberInterface membro, MultimediaItemInterface item);
}