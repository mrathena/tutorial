package com.mrathena.tutorial.springmvc4.controller;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@RequestMapping(value = "upload2", method = RequestMethod.POST)
	public @ResponseBody String upload2(MultipartFile[] files) {
		try {
			for (MultipartFile file : files) {
				FileUtils.writeByteArrayToFile(new File("d:/", file.getOriginalFilename()), file.getBytes());
			}
			return "ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

}