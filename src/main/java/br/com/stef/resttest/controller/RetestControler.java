package br.com.stef.resttest.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetestControler {

	
	private static final int QUNT_ANOS = 8;
	
	@RequestMapping(value="/rjporano", method = RequestMethod.GET, produces = {"application/json"})
	public List<String> getGrafico(){
		return getLables(QUNT_ANOS);
	}
	
	
	private static List<String> getLables(int quantidadeAnos){
		
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		
		List<String> labels = new ArrayList<>();
		
		for(int i = anoAtual; i > (anoAtual - quantidadeAnos); i--) {
			labels.add(0,String.valueOf(i));
		}
		
		return labels;
		
	}
	
	
	
	
	
}
