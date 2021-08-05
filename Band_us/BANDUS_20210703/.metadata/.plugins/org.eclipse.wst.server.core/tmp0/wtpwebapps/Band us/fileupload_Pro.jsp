//fileupload_pro.jsp
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="java.io.*"%>
<%@ page import="org.apache.commons.fileupload.FileItem"%>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<html>
<head><title>업로드 정보</title></head>
<body>
<%
	// 1. multipart/form-data 여부 확인
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	if (isMultipart) {//true가 되면 실행한다.
		// 2. 메모리나 파일로 업로드 데이터를 보관하는 FileItem의 Factory 설정
		DiskFileItemFactory factory = new DiskFileItemFactory(); //파라미터를 파일 아이템 객체로 만듬 파일이름, 파일12 모두 3개를 모두

		// 3. 업로드 요청을 처리하는 ServletFileUpload 생성
		ServletFileUpload upload = new ServletFileUpload(factory); //파일 업로드를 할 수 있는 객체를 가지고 있음.
		
		// 4. 업로드 요청 파싱해서 FileItem 목록 구함
		List<FileItem> items = upload.parseRequest(request); //요청정보로 전달된 파라미터를 전달함 
//파일은 -임시 메모리에 저장함 // 모든 파라미터는 파일 아이템객체로 바뀐다 / 그것들을 모아 리스트 객체로 바꿈
//파일아이템객체가 3개가 만들어 진다 "text1"  "file1"  "file2"     list로 만들어 놓음
//임시메모리에 올라갔으니 끄면 다 사라짐 -> 내가 원하는 경로에 옮겨놓고싶다
		
		//FileItem : 
		Iterator<FileItem> iter = items.iterator();
		while (iter.hasNext()) {
			FileItem item = iter.next();

			// 5. FileItem이 폼 입력 항목인지 여부에 따라 알맞은 처리
			//일반-true / 파일 - false
			if (item.isFormField()) {
				String name = item.getFieldName();
				String value = item.getString("utf-8");
%>
요청 파라미터: <%= name %>=<%= value %> <br/>
<%
			} else {
				String name = item.getFieldName(); //파라미터이름
				String fileName = item.getName(); //원본 파일명
				String contentType = item.getContentType(); //파일타입
				boolean isInMemory = item.isInMemory(); // 기준용량보다 넘으면 내가 원하는 아니면 jvm에 임시메모리에 올려놓아라 어디에 올려놓을거니
				long sizeInBytes = item.getSize(); //크기가 얼마인지
				
				
				int lastIndex = fileName.lastIndexOf("\\");
				String real = fileName.substring(lastIndex+1);
				
		

				// path 꼭 받을것
				System.out.println(System.getProperty("user.dir") + "     " + real);
			  	File file = new File("C:\\Users\\kosmo_\\Desktop\\20210624_band us\\Band us\\WebContent\\song\\"+real); 
				item.write(file);
%>
파일 : <%= name %>, <%= fileName %>, <%= sizeInBytes %>,<%= contentType %>
<%= isInMemory ? "메모리저장" : "임시파일저장" %>
 <br/>
<%
			}
		}
	} else {
		// multipart/form 아님
%>
multipart/form 요청이 아님.
<%
	}
%>
</body>
</html>