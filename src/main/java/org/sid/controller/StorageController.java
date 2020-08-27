package org.sid.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.sid.entities.InfoFichier;
import org.sid.services.impl.FilesStorageServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class StorageController {

	private static final String URL ="http://localhost:8085/files/"; 
	/*
	 * @Autowired FileStrorageService fileStorageService;
	 */
	FilesStorageServiceImpl fileStorageService = new FilesStorageServiceImpl();


	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		String message = "";
		fileStorageService.save(file);
		try {
			message = "upload avec succes:" + file.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.OK).body(message);
		} catch (Exception e) {
			message = "Erreur lors de l'upload" + file.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);

		}

	}

	@GetMapping("/files")
	public ResponseEntity<List<InfoFichier>> getListFiles() {
		List<InfoFichier> fileInfos = fileStorageService.loadAll().map(path -> {
		      String filename = path.getFileName().toString();
			/*
			 * String url = MvcUriComponentsBuilder
			 * .fromMethodName(StorageController.class,"getListFiles" ,
			 * path.getFileName().toString()).build().toString();
			 */
		      String  url = URL + filename;
		      return new InfoFichier(filename, url);
		    }).collect(Collectors.toList());

		    return ResponseEntity.status(HttpStatus.OK).body(fileInfos);
	}
}
