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
	 * struts��װ���ļ����أ�ͨ��InputStream����ȡĿ���ļ��������������������ֵջ�л�ȡ�ģ���Action��������ԣ�
	 * ���������Ҫ����һ��inputStream,���ṩget����
	 */
	private InputStream inputStream;
	public String download2() throws UnsupportedEncodingException, IOException{
		File f=new File(PATH,fileName);
		if(!f.exists()){
			throw new RuntimeException("�ļ������ڣ�");
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
