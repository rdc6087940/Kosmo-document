package song;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class SongDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public SongDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/BANDUS";
			String dbID = "root";
			String dbPassword = "1234";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		}catch (Exception e) {
			// TODO: handle exception
		}	
	}

	public String getDate() {
		String SQL = "SELECT NOW()";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	public int getNext() {
		String SQL = "SELECT song_no FROM SONG ORDER BY song_no DESC";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1)+1;
			}
			return 1;	// 첫번째 게시물인 경우

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public String post(String song_name, String artist_name, String album_name, String song_comment) {
		
		String path = System.getProperty("user.dir");
		
		// 작업 폴더 생성
		
		String rel_path = "\\WebContent\\song\\"+ String.format("%04d",getNext()) + artist_name + " - " + song_name;
		
		path = path+rel_path;	
		System.out.println("SongDAO post 에서 path : path");
		
		
		String SQL = "INSERT INTO SONG VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, getNext());
			System.out.println("데이터베이스 1번 : " + getNext());
			
			pstmt.setString(2, song_name);
			System.out.println("데이터베이스 2번 : " + song_name);
			
			pstmt.setString(3, getDate());
			System.out.println("데이터베이스 3번 : " + getDate());
			
			pstmt.setString(4, getDate());
			System.out.println("데이터베이스 4번 : " + artist_name);
			
			pstmt.setString(5, rel_path);
			System.out.println("데이터베이스 5번 : " + rel_path);
			
			pstmt.setString(6, album_name);
			System.out.println("데이터베이스 6번 : " + album_name);
			
			pstmt.setString(7, song_comment);
			System.out.println("데이터베이스 7번 : " + song_comment);
			
			pstmt.setInt(8, 0);
			System.out.println("데이터베이스 8번 : " + "0");
			
			pstmt.setDouble(9, 0.0);
			System.out.println("데이터베이스 9번 : " + "0.0");
			
			pstmt.setString(10, rel_path);
			System.out.println("데이터베이스 10번 : " + rel_path);

			pstmt.executeUpdate();
			
			
			// 저장 폴더 생성 ////////////////////////////////////
			File Folder = new File(path);
			// 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
			if (!Folder.exists()) {
				try{
				    Folder.mkdir(); //폴더 생성합니다.
				    System.out.println("폴더가 생성되었습니다. 경로 : " + path);
			        } 
			        catch(Exception e){
				    e.getStackTrace();
				}        
		         }else {
				System.out.println("이미 폴더가 생성되어 있습니다.");
			}
			///////////////////////////////////////////////////
			
			return path;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Error";
		
		
		
	}


}
