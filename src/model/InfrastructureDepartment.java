package model;
import java.util.*;
import java.io.*;
public class InfrastructureDepartment {

	private static final String BILLBOARD_FILE_NAME = "data/billboard.bbd";
	private final static String SEPARATOR = "|";
	private List<Billboard> billboards;
	
	public InfrastructureDepartment() throws ClassNotFoundException, IOException {
		billboards= new ArrayList<Billboard>();
		loadBillboard();
	}
	
	public void addBillboard(double w, double h, boolean iu, String b ) throws IOException{
		Billboard b1 = new Billboard(w,h,iu,b);
		billboards.add(b1);
		saveBillboard();
	}
	
	//Usar en addBillboard
	private void saveBillboard() throws IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BILLBOARD_FILE_NAME));
		oos.writeObject(billboards);
		oos.close();	
	}
	
	//Usar en el constructor
	@SuppressWarnings("unchecked")
	private void loadBillboard() throws IOException, ClassNotFoundException  {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(BILLBOARD_FILE_NAME));
		billboards = (ArrayList<Billboard>)ois.readObject();
		ois.close();
		
	}
	
	public void exportDangerousBillboardReport(String fn) {}
	
	public void importData(String fn) {}
	
	@Override
	public String toString() {
		String info="Billboards: \n";
		for(int i=0;i<billboards.size();i++) {
			Billboard b= billboards.get(i);
			info+=b.getWidth()+SEPARATOR+b.getHeight()+SEPARATOR+b.isInUse()+SEPARATOR+b.getBrand();
		}
		return info;
	}
	
	
	
	
	
}
