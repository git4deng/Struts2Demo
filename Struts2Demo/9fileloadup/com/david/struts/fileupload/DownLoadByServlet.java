package com.david.struts.fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class DownLoadByServlet {
	private String fileName;
	private static final String PATH="F:/learn/struts2/files";
	public String download() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		String filename = request.getParameter("fileName");
		File file=new File(PATH,filename);
		
		response.setContentLength((int)file.length());
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename="+filename);
		
		byte[] buffer=new byte[400];
		int len=0;
		InputStream is=new FileInputStream(file);
		 ServletOutputStream os = response.getOutputStream();
		 while((len=is.read(buffer))!=-1){
			 os.write(buffer,0,len);
		 }
		 os.close();
		 is.close();
		//обть
		return null;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
