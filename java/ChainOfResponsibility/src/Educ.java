
public abstract class Educ {
	
	private Educ educacao;
	
	public Educ(Educ educacao) {
		this.educacao = educacao;
	}
	
	public void checkEduc(Estudante est) {
		if(this.educacao != null) {
			this.educacao.checkEduc(est);
		}else {
			System.out.println(est.getName()+" precisa estudar!");
		}
	}
}
