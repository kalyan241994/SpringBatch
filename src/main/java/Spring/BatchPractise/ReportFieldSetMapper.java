package Spring.BatchPractise;

import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class ReportFieldSetMapper implements FieldSetMapper<Report> {
	
	private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		// TODO Auto-generated method stub
		
		Report report = new Report();
		
		report.setId(fieldSet.readInt(0));
		report.setQty(fieldSet.readInt(2));
		report.setSales(fieldSet.readBigDecimal(1));
		report.setStaffName(fieldSet.readString(3));
		
		String date = fieldSet.readString(4);
		
		try{
			report.setDate(sd.parse(date));
		}
		catch (Exception ex){
			
			ex.printStackTrace();
		}
		return report;
	}
	
	
	
}
