package planodecontas.main;

public class Main {

	public static void main(String[] args) {
		
		PlanoConta planoConta = new PlanoConta();
		Conta despesas = planoConta.addConta("Despesas");
		
		Conta receitas = planoConta.addConta("Receitas");
		
		Conta despesasFixas = planoConta.addSubConta(despesas, "Despesas Fixas");
		
		planoConta.addSubConta(despesasFixas, "Agua");
		planoConta.addSubConta(despesasFixas, "Luz");
		
		Conta DespesasCarro = planoConta.addSubConta(despesasFixas, "Despesas com Carro");
		planoConta.addSubConta(DespesasCarro, "Prestação");
		
		Conta carroManutencao = planoConta.addSubConta(DespesasCarro, "Manutenção");
		planoConta.addSubConta(carroManutencao, "Troca de oleo");
		planoConta.addSubConta(carroManutencao, "Troca de Correa Dentada");
		
		Conta outrasDespesas = planoConta.addSubConta(despesas, "Outras Despesas");
		
		planoConta.addSubConta(outrasDespesas, "Cartão de Credito");
		
		planoConta.listar(planoConta.getContas());
//		planoConta.listar(despesasFixas);

	}

}
