package DataDriven;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class jxl {
	
		@Test
		public void testcase1() throws BiffException, IOException
		{
			// i am creating a variable which stores the path of my excel sheet
			File excel = new File("D:\\MOOLYA\\SELENIUM\\DDT.xls");
			Workbook wb=Workbook.getWorkbook(excel);
			//Sheet sh=wb.getSheet("Sheet1");
			Sheet st=null;
			Cell cl=null;
			int sheets=wb.getNumberOfSheets();
			for(int i=0;i<sheets;i++)
			{
				st=wb.getSheet(i);
				int rows = st.getRows();
				int col = st.getColumns();
				System.out.println(" no of rows is "+rows+ " no of columns "+col);
				for(int x=0;x<rows;x++)
				{
					for(int y=0;y<col;y++)
					{
						cl=st.getCell(y,x);
								if(cl.getContents().length()>0)
						{
						
							
							//System.out.println(cl.getContents());
						}
					}
				}
			}
		}
}