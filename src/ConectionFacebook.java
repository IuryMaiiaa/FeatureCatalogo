

/**
 * TODO description
 */
public class ConectionFacebook {
	private boolean coneccao;
	
	public ConectionFacebook() {
		coneccao = true;
	}
	
	public boolean RealizarPostagem() {
		if(coneccao) {
			return true;
		}
		return false;
	}

}