/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.external;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nvl.api.common.rest.ApiRestTemplate;

/**
 * The Class ExternalService.
 */
@Service
public class ExternalService implements IExternalService {

	@Autowired
	private ApiRestTemplate restClient;

	@Override
	public String getQuoteOfDay(Integer day, Integer month) {
		return restClient.get(
				NumbersApiExternalResource.THISDAY_DAY_MONTH.uri(pathParamsQuoteOfDay(day, month), Optional.empty()),
				String.class).getData();
	}

	private Optional<Map<String, ?>> pathParamsQuoteOfDay(Integer aDay, Integer aMonth) {
		Map<String, Integer> pathParams = new HashMap<>();
		pathParams.put("day", aDay);
		pathParams.put("month", aMonth);
		return Optional.of(pathParams);
	}
}
