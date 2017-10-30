package com.nvl.api.common.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.Resource;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nvl.api.common.ApiException;

public interface IReadOnlyDataService<T> {

	default T read(Resource resource, Class<T> dataClass) {
		ObjectMapper mapper = new ObjectMapper();
		T data;
		String path = "";
		try {
			path = resource.getURI().getPath();
			data = mapper.readValue(resource.getFile(), dataClass);
		} catch (IOException e) {
			throw new ApiException("Resource not found", e).attribute("Type", dataClass.getName())
					.attribute("Filename", path).attribute("Cause", e.getMessage());
		}
		return data;
	}

	default List<T> readAll(Resource resource, Class<T> dataClass) {
		ObjectMapper mapper = new ObjectMapper();
		List<T> data = new ArrayList<T>();
		try {
			if (resource.getFile().isDirectory()) {
				File folders = resource.getFile();
				for (File aFile : folders.listFiles()) {
					T datum;
					try {
						datum = mapper.readValue(aFile, dataClass);
					} catch (JsonParseException | JsonMappingException e) {
						datum = null;
					}
					data.add(datum);
				}
			}
		} catch (IOException ex) {
		}
		return data;
	}
}
