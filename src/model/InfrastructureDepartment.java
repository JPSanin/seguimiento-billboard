package model;
import java.util.*;

public class InfrastructureDepartment {

	private static final String BILLBOARD_FILE_NAME = "data/billboard.bbd";
	private ArrayList<Billboard> billboards;
	
	public InfrastructureDepartment() {
		billboards= new ArrayList<Billboard>();
		loadBillboard();
	}
	
	public void addBillboard(double w, double h, boolean iu, String b ) {
		saveBillboard();
	}
	
	//Usar en addBillboard
	private void saveBillboard(){}
	
	//Usar en el constructor
	private void loadBillboard() {}
	
	public void exportDangerousBillboardReport(String fn) {}
	
	public void importData(String fn) {}
	
	@Override
	public String toString() {
		String info="";
		return info;
	}
	
	
	
	
	
}
