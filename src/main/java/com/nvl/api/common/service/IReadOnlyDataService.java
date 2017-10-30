package com.nvl.api.common.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.Resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nvl.api.common.ApiException;

public interface IReadOnlyDataService<T> {

	default T read(Class<T> dataClass, Resource resource) {
		ObjectMapper mapper = new ObjectMapper();
		T data;
		String path = "";
		try {
			path = resource.getURI().getPath();
			data = mapper.readValue(resource.getInputStream(), dataClass);
		} catch (IOException e) {
			throw new ApiException("Resource not found", e).attribute("Type", dataClass.getName())
					.attribute("Filename", path).attribute("Cause", e.getMessage());
		}
		return data;
	}

	default List<T> readAll(Class<T> dataClass, Resource... resources) {
		ObjectMapper mapper = new ObjectMapper();
		List<T> data = new ArrayList<>();
		String path = "";
		try {
			for (Resource resource : resources) {
				path = resource.getURI().getPath();
				data.add(mapper.readValue(resource.getInputStream(), dataClass));
			}
		} catch (IOException e) {
			throw new ApiException("Resource not found", e).attribute("Type", dataClass.getName())
					.attribute("Filename", path).attribute("Cause", e.getMessage());
		}
		return data;
	}
}
