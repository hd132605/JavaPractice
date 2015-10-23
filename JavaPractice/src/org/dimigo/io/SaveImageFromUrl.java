package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		final String IMAGEURL = "http://static.news.zumst.com/images/upload/2015/10/23/15/f65f8377b90f441fb9287ff9b7f3e04e.jpg";
		try {
			URL url = new URL(IMAGEURL);
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/image.jpg")) {
				
				//파일에 write하기
				byte[] buf = new byte[100];
				int result;
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
