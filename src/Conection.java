

/**
 * TODO description
 */
public class Conection {
private boolean coneccao;
	
	public Conection() {
		coneccao = true;
	}
	
	public boolean RealizarPostagem() {
		if(coneccao) {
			return true;
		}
		return false;
	}

}