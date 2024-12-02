//@author: Daiane Tararam

package controller;
import model.estrutura.ArvoreArquivo;

public class ArvoreArquivoController {
	
	public ArvoreArquivoController(){
		super();
	}
	
	public String teste(String array[]) {
		ArvoreArquivo tree = new ArvoreArquivo();
		
		for(int i = 0; i < 7; i++){
			tree.inserir(array[i]);
		}
		
		return tree.toString();
		
	}
}
