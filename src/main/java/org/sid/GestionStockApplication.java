package org.sid;

import java.io.FileNotFoundException;
import java.text.ParseException;

import org.sid.services.impl.FilesStorageServiceImpl;
import org.sid.services.impl.IFlickrDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.flickr4java.flickr.FlickrException;

@SpringBootApplication
@EnableJpaRepositories("org.sid.dao")

public class GestionStockApplication {
	FilesStorageServiceImpl storageService = new FilesStorageServiceImpl();

	IFlickrDaoImpl iFlickDao = new IFlickrDaoImpl();

	public static void main(String[] args) throws FileNotFoundException, FlickrException, ParseException {
		SpringApplication.run(GestionStockApplication.class, args);
	}

	public void run(String... arg0) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}

}
