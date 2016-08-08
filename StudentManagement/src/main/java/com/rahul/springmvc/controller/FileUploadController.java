package com.rahul.springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileUploadController
{
	private static Logger log = Logger.getLogger(FileUploadController.class);
	
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(MultipartHttpServletRequest request, HttpServletResponse response)
	{
		Iterator<String> itr = request.getFileNames();
		MultipartFile multipartFile = request.getFile(itr.next());

		try
		{				
			OutputStream out = new FileOutputStream(new File("C:/Users/672574/Downloads/uploads/" + multipartFile.getOriginalFilename()));
			out.write(multipartFile.getBytes());
			out.close();
		} 
		catch (IOException e) {
			log.error("IOException: ", e);
		}
		
		return "File Uploaded successfully !!";
	}
}
