package br.com.semantix.datalab.exerc02.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import br.com.semantix.datalab.exerc02.entity.Produto;

public class Exercicio_02 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);


		//Produto obj1 = new Produto("Positivo", "2Ghz", "1GB", "Magazine");
		//System.out.println(gravarArqTxt(obj1));

		//Produto obj2 = new Produto("Dell", "10Ghz", "10Gb", "Saraiva");
		//System.out.println(gravarArqCsv(obj2));

		System.out.println("Digite o caminho do arquivo: ");
		String nomeArq = scan.nextLine();

		if(nomeArq.endsWith(".txt")){
			Produto resultado = lerArqTxt();
			System.out.println(resultado.getNome() + "\n" + resultado.getVelocidade() + "\n" +
					resultado.getMemoria() + "\n" + resultado.getRevendedor());
		}else
			if(nomeArq.endsWith(".csv")){
				Produto resultado = lerArqCsv();
				System.out.println(resultado.getNome() + "\n" + resultado.getVelocidade() + "\n" +
						resultado.getMemoria() + "\n" + resultado.getRevendedor());
			}
			else{
				System.out.println("Erro!");
			}




		scan.close();
	}

	static String gravarArqTxt(Produto p) throws Exception{

		FileOutputStream txt = new FileOutputStream("C:/Users/vogue_000/Desktop/dataLab/processa.txt");
		ObjectOutputStream stream = new ObjectOutputStream(txt);
		stream.writeObject(p);
		stream.flush();
		stream.close();
		return "Objeto gravado";
	}

	static String gravarArqCsv(Produto p) throws Exception{

		FileOutputStream csv = new FileOutputStream("C:/Users/vogue_000/Desktop/dataLab/processa.csv");
		ObjectOutputStream stream = new ObjectOutputStream(csv);
		stream.writeObject(p);
		stream.flush();
		stream.close();
		return "Objeto gravado";
	}


	static Produto lerArqTxt() throws Exception{

		FileInputStream arqTxt = new FileInputStream("C:/Users/vogue_000/Desktop/dataLab/processa.txt");
		ObjectInputStream stream = new ObjectInputStream(arqTxt);
		Produto objTxt = (Produto) stream.readObject();
		stream.close();
		return objTxt;
	}

	static Produto lerArqCsv() throws Exception{

		FileInputStream arqCsv = new FileInputStream("C:/Users/vogue_000/Desktop/dataLab/processa.csv");
		ObjectInputStream stream = new ObjectInputStream(arqCsv);
		Produto objCsv = (Produto) stream.readObject();
		stream.close();
		return objCsv;
	}
}
