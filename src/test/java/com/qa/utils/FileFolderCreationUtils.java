package com.qa.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileFolderCreationUtils {
	public static File folderCreation(String folderName)
	{
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("dd-MMM-yyyy");
		//MM/dd/yyyy
		String date = ft.format(dNow).toString();
		String baseFolder = System.getProperty("user.dir")+"\\TestResultsScreenSots\\"+folderName;
		File bs = new File (baseFolder);
		if(!bs.exists())
		{
			bs.mkdir();
		}
		String subFolder = baseFolder+"\\"+date;
		File sb = new File(subFolder);
		if(!sb.exists())
		{
			sb.mkdir();
		}
		return sb;
		}

}
