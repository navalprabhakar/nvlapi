package com.nvl.api.common.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.Resource;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface IReadOnlyDataService<T> {

	default T read(Resource resource, Class<T> dataClass) {
		ObjectMapper mapper = new ObjectMapper();
		T data;
		try {
			data = mapper.readValue(resource.getFile(), dataClass);
		} catch (IOException e) {
			try {
				data = dataClass.newInstance();
			} catch (InstantiationException | IllegalAccessException e1) {
				data = null;
			}
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
		} catch (IOException ex) {}
		return data;
	}
}
