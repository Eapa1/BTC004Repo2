package com.bit.test;

import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.google.gson.stream.JsonReader;

public class json {
	
	String articleDetailPageURl = null;
	String articleTitle = null;
	String date = null;
	String body = null;
	String source = null;
	String title = null;

	
	
	@Test
	public void m1()
	{
		JSONObject obj = null;
		 JSONArray jsonarray = (JSONArray) obj.get("Articles");
		// JSONArray jsonarray = new JSONArray(str);


		    for(int i=0; i<jsonarray.length(); i++){
		        obj = jsonarray.getJSONObject(i);
		        String url=	(String)(obj.get("URL"));
	            String Title=	(String)(obj.get("Title"));
System.out.println(url);
		        //same way follow yr code
		    }   
	}
//	public void checkOpenedArticleDetailPage() {	
//	
//	try {
//		
//			int pageUrl=5;
//			jsonObject =JsonReader.ReadJsonFile("ArticleFrontend.json");
//			// Step 1
//			
//			
//
//            
// 
//            JSONObject jsonObject = (JSONObject) obj;
// 
//           
//            JSONArray companyList = (JSONArray) jsonObject.get("Articles");
// 
//           
//           
//            Iterator<Object> iterator = companyList.iterator();
//            while (iterator.hasNext()) {
//            String url=	(String)(jsonObject.get("URL"));
//            String Title=	(String)(jsonObject.get("Title"));
//                if(iterator.next().equals(url)
//                		{
//                //	articleDetailPage = applib.openArticleDetailPage(url, Title);
//
//        			// // Step 2
//        			articleDetailPage.validateArticleBlock();
//        			System.out.println("block");
//        			System.out.println("step2");
//        			// // Step 3
//        			articleDetailPage.validateArticleBlockTitle(articleTitle);
//        			System.out.println("step3");
//        			// Step 4
//        			articleDetailPage.validateByline(source);
//        			System.out.println("step4");
//        			// Step 5
//        			articleDetailPage.validatePublishDate(date);
//
//        			System.out.println("step5");
//        			// Step 6
//        			articleDetailPage.verifySocialIcons();
//        			System.out.println("step6");
//        			// Step 7
//        			articleDetailPage.validateArticleBody(body);
//        			// Step 8
//        			articleDetailPage.verifyAuthorImage();
//                		}
//                		}
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			jarray = new JSONArray(jsonObject.get("Articles"));
//			for(int i=0;i<jarray.length();i++)
//			{
//				String)(jsonObject.get(i));
//			
//			}
//			}
//			List<String> l=new ArrayList<String>();
//			l.add((String)(jsonObject.get("articleWithAuthorPhoto")))
//			l.add((String)(jsonObject.get(""articleWithMediaGallery")));
//				for(int i=0;i<l.length();i++)
//				{
//					jarray = new JSONArray(jsonObject.get(l[i]).toString());
//					System.out.println("article Page");
//					for(int i = 0; i!=pageUrl; i++) {
//						 urls =jarray.getString(i);
//						System.out.println("url in loop"+url);
//						Reporter.log("Url: " + url);
//				}
//			 
//			
//	
//		}
//		}
}
