package br.com.marvel.commos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DataResponse<T> extends Response {

	private static final long serialVersionUID = -5547270428427207197L;

	private T data;

	public DataResponse() {}

	public DataResponse(String version) {
		this.setVersion(version);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
