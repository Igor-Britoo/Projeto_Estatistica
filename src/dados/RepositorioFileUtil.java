package dados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import beans.Pessoa;

public class RepositorioFileUtil {
    //Para o arquivo que armazena pessoas como objeto
    public static Object lerArquivoPessoas(String filename) {
        Object instanciaLocal = null;

        File in = new File(filename);
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(in));
            
            instanciaLocal = ois.readObject();
        } catch (Exception e) {
            System.out.println("Nao ha arquivo com o nome '" + filename + "' para ser processado. Um novo arquivo sera criado");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                }
            }
        }

        return instanciaLocal;
    }

    public static void salvarArquivoPessoas(Object instance, String filename) {
        if (instance == null) {
            return;
        }
        File out = new File(filename);        
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(out));
            oos.writeObject(instance);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    //Para o arquivp que armazena pessoas como string
    public static void criarArquivoStrings(File repositoriotxt, RepositorioPessoas repositorioPessoas) {
		FileWriter fw;
		BufferedWriter bw;
		try {
			fw = new FileWriter(repositoriotxt);
			bw = new BufferedWriter(fw);
			for(Pessoa p: repositorioPessoas.listar()) {
				bw.write(p.toString());
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public static String lerArquivoStrings(File repositoriotxt) {
    	FileReader fr;
		BufferedReader br;
		String texto = "";
		try {
			fr = new FileReader(repositoriotxt);
			br = new BufferedReader(fr);
			while(br.ready()) {
				texto = texto + br.readLine()+"\n";
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return texto;
    }
    
}
