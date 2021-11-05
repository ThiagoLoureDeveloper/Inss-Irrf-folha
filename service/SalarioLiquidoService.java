package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Inss;
import com.example.demo.entities.Irrf;
import com.example.demo.entities.SalarioLiquido;
import com.example.demo.repository.SalarioLiquidoRepository;

@Service
public class SalarioLiquidoService {

	@Autowired
	private SalarioLiquidoRepository repository;

	@Autowired
	private InssService inssService;

	@Autowired
	private IrrfService irrfService;

	// findAll retorna a lista completa do banco de dados
	public List<SalarioLiquido> findAll() {
		return repository.findAll();
	}

	public SalarioLiquido save(SalarioLiquido salarioLiquido) {
		return repository.save(salarioLiquido);
	}

	public SalarioLiquido calcularSalario(SalarioLiquido salarioLiquido) {

		List<Inss> listaInss = inssService.findAll();

		List<Irrf> listaIrrf = irrfService.findAll();

		Double aliquotaInssSelecionada = 0.00;

		Double aliquotaIrrfSelecionada = 0.00;

		Double valorAnterior = 0.00;

		Double valorDiaTrabalhadoFuncionario = (double) salarioLiquido.getSalarioBruto() / 30;

		Double valorSalarioTralhadoFuncionario = valorDiaTrabalhadoFuncionario * salarioLiquido.getDiasTrabalhados();

		for (int i = 0; i < listaInss.size(); i++) {

			valorAnterior = listaInss.get(i).getSalarioContribuinte();

			if (i == 0) {
				if (listaInss.get(i).getSalarioContribuinte() >= valorSalarioTralhadoFuncionario) {
					aliquotaInssSelecionada = listaInss.get(i).getAliquota();
				}
			} else {

				if (listaInss.get(i).getSalarioContribuinte() >= valorSalarioTralhadoFuncionario
						&& valorSalarioTralhadoFuncionario > valorAnterior) {
					aliquotaInssSelecionada = listaInss.get(i).getAliquota();
				}
			}
		}

		Double valorSalarioComDescontoDeInss = valorSalarioTralhadoFuncionario * aliquotaInssSelecionada;

		for (int j = 0; j < listaIrrf.size(); j++) {

			valorAnterior = listaIrrf.get(j).getBaseCalculo();

			if (j == 0) {
				if (listaIrrf.get(j).getBaseCalculo() >= valorSalarioComDescontoDeInss) {
					aliquotaIrrfSelecionada = listaIrrf.get(j).getAliquota();
				}
			} else {
				if (listaIrrf.get(j).getBaseCalculo() >= valorSalarioComDescontoDeInss
						&& valorSalarioComDescontoDeInss > valorAnterior) {
					aliquotaIrrfSelecionada = listaIrrf.get(j).getAliquota();
				}
			}
		}
		
		Double valorSalarioComDescontoIrrf = valorSalarioComDescontoDeInss * aliquotaIrrfSelecionada;
		

		return null;
	}

}