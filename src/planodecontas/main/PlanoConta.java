package planodecontas.main;

public class PlanoConta {
	private String descricao;
	private Conta contas = new Conta();
	
	public Conta addConta(String descricao) {
		return this.getContas().addConta(descricao);
	}

	public Conta addSubConta(Conta contaMae, String descricao) {

		Conta conta = new Conta();
		conta.setDescricao(descricao);
		conta.setConta(contaMae.getConta() + ".0" + (contaMae.subConta.size() + 1));
		contaMae.subConta.add(conta);
		
		return conta;
		
	}
	
	
	public void listar(Conta conta) {
		if(conta.getDescricao() != null) System.out.println(conta.getConta() + " - " + conta.getDescricao());
		if(conta.subConta != null) {
			listarEstrutura(conta);			
		}
	}
	
	public void listarEstrutura(Conta conta) {
		if(conta.subConta != null) {
			for(Conta c : conta.subConta) {
				System.out.println(c.getConta() + " - " + c.descricao);
				listarEstrutura(c);
			}
		}
	}	

	public Conta getContas() {
		return contas;
	}
}
