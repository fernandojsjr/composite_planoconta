package planodecontas.main;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	protected String conta;
	protected String descricao;
	protected List<Conta> subConta = new ArrayList<>();

	public Conta() {
		
	}
	
	public Conta(String descricao) {
		this.descricao = descricao;
	}

	public Conta addConta(String descricao) {
		Conta conta = new Conta();
		conta.descricao = descricao;
		conta.conta = subConta.size() <= 0 ? "1" : "" + (subConta.size() + 1);
		this.subConta.add(conta);
		
		return conta;
	}

	/*
	public Conta addSubConta(String descricao) {
		Conta subConta = new Conta(descricao);
		subConta.conta =  this.conta + ".0" + this.subConta.size() + 1;
		
		return subConta;
	}
	*/

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
}
