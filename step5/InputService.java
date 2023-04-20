package step5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class InputService {
	public TreeSet<String> getMenuKindInfo(String filePath) throws IOException {
		TreeSet<String> set=new TreeSet<String>();
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader(filePath));
			while(br.ready()) {
				String data=br.readLine();
				set.add(data);
			}
		}finally {
			if(br!=null)
				br.close();
		}
		return set;
	}

}




