package song;

import java.io.File;

public abstract class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	      String path = System.getProperty("user.dir");
	  	
	  	path = path+"\\WebContent\\song\\0002_ADMIN_TEST";
	  	
	  	File Folder = new File(path);

	  	// 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
	  	if (!Folder.exists()) {
	  		try{
	  		    Folder.mkdir(); //폴더 생성합니다.
	  		    System.out.println("폴더가 생성되었습니다.");
	  	        } 
	  	        catch(Exception e){
	  		    e.getStackTrace();
	  		}        
	           }else {
	  		System.out.println("이미 폴더가 생성되어 있습니다.");
	  	}

	}
	
	

}
