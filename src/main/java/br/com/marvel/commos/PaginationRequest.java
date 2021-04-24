package br.com.marvel.commos;

import java.io.Serializable;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PaginationRequest implements Serializable {

	private static final long serialVersionUID = 6349640742026607058L;

	private Pageable page;
	private Boolean ascendingOrder;

	public PaginationRequest(Integer page, Integer pageSize) {
		if (page != null && pageSize != null) {
			this.page = PageRequest.of(page, pageSize);
		} else {
			this.page = PageRequest.of(0, Integer.MAX_VALUE);
		}
	}

	public Pageable getPage() {
		return page;
	}

	public void setPage(Pageable page) {
		this.page = page;
	}

	public Boolean getAscendingOrder() {
		return ascendingOrder;
	}

	public void setAscendingOrder(Boolean ascendingOrder) {
		this.ascendingOrder = ascendingOrder;
	}
}
