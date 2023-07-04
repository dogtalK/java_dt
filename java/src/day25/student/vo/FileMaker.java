package day25.student.vo;

import java.io.File;
import java.io.IOException;

public class FileMaker {
	private File file;
	
	public FileMaker(java.io.File file) {
		this.setFile(file);
	}
	public FileMaker() {
		// TODO Auto-generated constructor stub
	}
	
	public void File(Student tmp) {
		File file = new File("StudentList.txt");
		try {
			if(file.exists() && file.getName().contains(".")){
				file.createNewFile();
				System.out.println("create File");
			}
		}catch(IOException e) {
			System.out.println();
		
		}
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}

}
