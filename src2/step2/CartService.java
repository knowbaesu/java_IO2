package src2.step2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CartService {
	private String savePath;
	public CartService(String savePath) {
		super();
		this.savePath = savePath;
	}
	public void cartSerial(ArrayList<Product> list) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream(savePath));
			oos.writeObject(list);
		}finally {
			if(oos!=null)
				oos.close();
		}
	}
    @SuppressWarnings("unchecked")
	public ArrayList<Product> cartDeSerial() throws FileNotFoundException, IOException, ClassNotFoundException {
    	ObjectInputStream ois=null;
    	ArrayList<Product> list=null;
    	try {
    		ois=new ObjectInputStream(new FileInputStream(savePath));
    		list=(ArrayList<Product>) ois.readObject();
    	}finally {
			if(ois!=null)
				ois.close();
		}
		return list;
	}
}














