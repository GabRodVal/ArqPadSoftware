
public class FundamentalEduc extends Educ{

	public FundamentalEduc(Educ educacao) {
		super(educacao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkEduc(Estudante est) {
		if(est.hasFundamental() == true) {
			System.out.println(est.getName()+" tem ensino fundamental completo!");
		}else {
			System.out.println(est.getName()+" não tem ensino fundamental completo, mas");
			super.checkEduc(est);
		}
	}

	
}
