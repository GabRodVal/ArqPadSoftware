
public class GraduacaoEduc extends Educ{

	public GraduacaoEduc(Educ educacao) {
		super(educacao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkEduc(Estudante est) {
		if(est.hasGraduacao() == true) {
			System.out.println(est.getName()+" tem graduação!");
		}else {
			System.out.println(est.getName()+" não tem graduação, mas");
			super.checkEduc(est);
		}
		
		
	}
}
