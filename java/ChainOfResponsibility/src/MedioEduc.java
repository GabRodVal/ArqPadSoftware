
public class MedioEduc extends Educ{

	public MedioEduc(Educ educacao) {
		super(educacao);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void checkEduc(Estudante est) {
		if(est.hasMedio() == true) {
			System.out.println(est.getName()+" tem ensino médio completo!");
		}else {
			System.out.println(est.getName()+" não tem ensino médio completo, mas");
			super.checkEduc(est);
		}
		
		
	}

}
