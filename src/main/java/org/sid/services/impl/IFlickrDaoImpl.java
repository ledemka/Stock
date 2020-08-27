package org.sid.services.impl;

import java.io.InputStream;

import javax.swing.JOptionPane;

import org.scribe.model.Token;
import org.scribe.model.Verifier;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;

public class IFlickrDaoImpl {

	private Flickr flickr;
	
	private UploadMetaData uploadMetaData = new UploadMetaData();
	
	private String apiKey = "cbc745d6f7aaf76092f4d45821b0e351";
	
	private String sharedSecret = "41244853431c282f";
	
	public void connect() {
		flickr = new Flickr(apiKey,sharedSecret,new REST());
		Auth auth = new Auth();
		auth.setPermission(Permission.READ);
		auth.setToken("cbc745d6f7aaf76092f4d45821b0e351");
		auth.setTokenSecret("41244853431c282f");
		RequestContext requestContext = RequestContext.getRequestContext();
		requestContext.setAuth(auth);
		flickr.setAuth(auth);
		System.out.println("COnnection");
	}

	public String savePhoto(InputStream stream, String fileName) throws FlickrException {
		connect();
		uploadMetaData.setTitle(fileName);
			String photoId = flickr.getUploader().upload(stream,uploadMetaData);
		
		String a = flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
		return a;
	
	}
	
	public void auth() {
		flickr = new Flickr(apiKey,sharedSecret,new REST());
		AuthInterface authInterface = flickr.getAuthInterface();
		Token  token = authInterface.getRequestToken();
		System.out.println("token"+ token);
		
		String url = authInterface.getAuthorizationUrl(token, Permission.DELETE);
		System.out.println("autorisation");
		System.out.println(url);
		System.out.println("coller le token donné");


		String tokenKey = JOptionPane.showInputDialog(null);
		Token requestToken = authInterface.getAccessToken(token,new Verifier(tokenKey));

	}
}
