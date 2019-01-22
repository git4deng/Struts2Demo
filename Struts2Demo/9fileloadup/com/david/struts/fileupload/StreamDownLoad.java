package com.david.struts.fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class StreamDownLoad {
	private String fileName;
	private static final String PATH="F:/learn/struts2/files";
	/**
	 * struts封装的文件下载，通过InputStream来获取目标文件，而这个输入流正是在值栈中获取的，即Action对象的属性，
	 * 因此我们需要配置一个inputStream,并提供get方法
	 */
	private InputStream inputStream;
	public String download2() throws UnsupportedEncodingException, IOException{
		File f=new File(PATH,fileName);
		if(!f.exists()){
			throw new RuntimeException("文件不存在！");
		}else{
			inputStream= new FileInputStream(f);
		}
		fileName=URLEncoder.encode(fileName, "UTF-8");
		return Action.SUCCESS;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public InputStream getInputStream(){
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
}
