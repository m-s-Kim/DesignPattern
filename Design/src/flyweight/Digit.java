package flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Digit {
	private ArrayList<String> data = new ArrayList<String>();
	String line = "";
	public Digit(String fileName) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
//			for(int i=0 ;(line = br.readLine())!=null;i++) {
			for(int i=0 ;i< 8; i++) {
				data.add(br.readLine());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			}catch( IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void print(int x, int y) {
		for(int i=0 ;i< 8; i++) {
			String li = data.get(i);
			System.out.println(String.format("%c[%d;%df]",0x18,y+i,x));
			
		}
	}
	
	
	
	
	
	
	
}
