//@author: Daiane Tararam

package view;

import controller.ArvoreArquivoController;

public class ArvoreArquivoPrincipal {

    public static void main(String[] args) {
        
        ArvoreArquivoController controller = new ArvoreArquivoController();
        String[] array = {"Documents/prova_ed.odt", "Documents/hino_BOTAFOGO.mp3", 
                          "Documents/prova_ihc.odt", "Documents/prova_ed_mais_top.odt",
                          "Images/AlunosFelizes.png", "Images/CachorroCaramelo.png", 
                          "Downloads/Debian12.8.img"};
        try {
            String resultado = controller.teste(array);
            System.out.println("Impressão da árvore em ordem:\n " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

