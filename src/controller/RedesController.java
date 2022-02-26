package controller;

import java.io.BufferedReader;

import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {

	public RedesController() {
		super();
	
		
	}
	public String os() {
	String os = System.getProperty("os.name");
	return os;
	}
	
	
	
	public void readProcess(String process) {
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream leFluxo = p.getInputStream();
			InputStreamReader converteString = new InputStreamReader(leFluxo);
			BufferedReader buffer = new BufferedReader(converteString);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			converteString.close();
			leFluxo.close();

		} catch (Exception e) {
			System.err.println("Chamada inválida");
		}
	}
}
int i = 9;

/*
public void readTraceRoute(String process) {
	try {
		Process p = Runtime.getRuntime().exec(process);
		InputStream fluxo = p.getInputStream();
		InputStreamReader convString = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(convString);
		String linha = buffer.readLine();
		linha = buffer.readLine();
		linha = buffer.readLine();
		linha = buffer.readLine();
		linha = buffer.readLine();
		while (linha != null) {
			String[] vetLinha = linha.split("ms");
			int tamanho = vetLinha.length;
			String ip = vetLinha[tamanho - 1];
			
			if (ip.contains("[")) {
				String[] vetIp = ip.split("\\[");
				String newIp = vetIp[1].replace("]", "");
				System.out.println(newIp);
			} else {
				if (!ip.contains("tempo limite")) {
					System.out.println(ip.trim());
				}
			}
			
			linha = buffer.readLine();
			
		}
	} catch (IOException e) {
		System.err.println("Chamada inválida");
	}
}
*/
