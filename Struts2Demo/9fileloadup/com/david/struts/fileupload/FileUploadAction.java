package com.david.struts.fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	//file 必须和表单域的名称相同 即input的name属性相同
	private File file;
	//文件名： 注意此处属性格式必须是：表单name属性+FileName（此处可以查看源码）
	private String FileFileName;
	//文件类型：注意此处属性格式必须是：表单name属性+FileName
	private String FileContentType;
	//文件保存位置
	private static final String PATH="F:/learn/struts2/files";
	public String upload() throws IOException{
		//检查目录是否存在
		createDirs(PATH);
		InputStream is=new FileInputStream(file);
		OutputStream os=new FileOutputStream(new File(PATH,FileFileName));
		byte[] buffer=new byte[200];
		int len=0;
		while ((len=is.read(buffer))!=-1) {
			os.write(buffer, 0, len);
		}
		is.close();
		os.close();
		return Action.SUCCESS;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return FileFileName;
	}

	public void setFileFileName(String fileFileName) {
		FileFileName = fileFileName;
	}

	public String getFileContentType() {
		return FileContentType;
	}

	public void setFileContentType(String fileContentType) {
		FileContentType = fileContentType;
	}
	public  void createDirs(String path) {
		File f=new File(path);
		if(!f.exists()){
			System.out.println("目录不存在，创建一个文件目录！");
			f.mkdirs();
		}
		System.out.println("文件路径创建完成!");
	}
}
