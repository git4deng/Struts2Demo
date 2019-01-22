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
	//file ����ͱ����������ͬ ��input��name������ͬ
	private File file;
	//�ļ����� ע��˴����Ը�ʽ�����ǣ���name����+FileName���˴����Բ鿴Դ�룩
	private String FileFileName;
	//�ļ����ͣ�ע��˴����Ը�ʽ�����ǣ���name����+FileName
	private String FileContentType;
	//�ļ�����λ��
	private static final String PATH="F:/learn/struts2/files";
	public String upload() throws IOException{
		//���Ŀ¼�Ƿ����
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
			System.out.println("Ŀ¼�����ڣ�����һ���ļ�Ŀ¼��");
			f.mkdirs();
		}
		System.out.println("�ļ�·���������!");
	}
}
