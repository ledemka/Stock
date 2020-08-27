package org.sid.dao;

import java.io.InputStream;

import com.flickr4java.flickr.FlickrException;

public interface IFlickrDao{

	public String savePhoto(InputStream stream,String fileName) throws FlickrException;
}
