package excell;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class POIExcell {
	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Users\\Dimitrije\\Desktop\\data.xls");
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wbe = new HSSFWorkbook(fis);
		HSSFSheet sheet1 = wbe.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total row count is " + (rowcount + 1));
		for (int i = 0; i <= rowcount; i++) {
			HSSFRow r = sheet1.getRow(i);
			if (r != null) {
				String data0 = r.getCell(0).getStringCellValue();
				System.out.println("Podaci iz reda " + i + " is " + data0);
			} else {
				System.out.println("<Empty row>");
			}
		}
		wbe.close();
	}

}