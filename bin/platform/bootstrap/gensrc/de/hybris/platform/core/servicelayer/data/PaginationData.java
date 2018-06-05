/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 9:23:21 AM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.core.servicelayer.data;

import java.io.Serializable;

/**
 * POJO representation of search pagination.
 */
public  class PaginationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** The number of results per page. A page may have less results if there are less than a full page of results, only on the last page in the results.<br/><br/><i>Generated property</i> for <code>PaginationData.pageSize</code> property defined at extension <code>core</code>. */
		
	private int pageSize;

	/** The current page number. The first page is number zero (0), the second page is number one (1), and so on.<br/><br/><i>Generated property</i> for <code>PaginationData.currentPage</code> property defined at extension <code>core</code>. */
		
	private int currentPage;

	/** The total number of pages. This is the number of pages, each of pageSize, required to display the totalNumberOfResults. Output only, may not be set if needsTotal=false.<br/><br/><i>Generated property</i> for <code>PaginationData.numberOfPages</code> property defined at extension <code>core</code>. */
		
	private int numberOfPages;

	/** The total number of matched results across all pages. Output only, may not be set if needsTotal=false.<br/><br/><i>Generated property</i> for <code>PaginationData.totalNumberOfResults</code> property defined at extension <code>core</code>. */
		
	private long totalNumberOfResults;

	/** Flag for indicating if totalNumberOfResults is needed or not. Input only.<br/><br/><i>Generated property</i> for <code>PaginationData.needsTotal</code> property defined at extension <code>core</code>. */
		
	private boolean needsTotal;
	
	public PaginationData()
	{
		// default constructor
	}
	
		
	
	public void setPageSize(final int pageSize)
	{
		this.pageSize = pageSize;
	}

		
	
	public int getPageSize() 
	{
		return pageSize;
	}
	
		
	
	public void setCurrentPage(final int currentPage)
	{
		this.currentPage = currentPage;
	}

		
	
	public int getCurrentPage() 
	{
		return currentPage;
	}
	
		
	
	public void setNumberOfPages(final int numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}

		
	
	public int getNumberOfPages() 
	{
		return numberOfPages;
	}
	
		
	
	public void setTotalNumberOfResults(final long totalNumberOfResults)
	{
		this.totalNumberOfResults = totalNumberOfResults;
	}

		
	
	public long getTotalNumberOfResults() 
	{
		return totalNumberOfResults;
	}
	
		
	
	public void setNeedsTotal(final boolean needsTotal)
	{
		this.needsTotal = needsTotal;
	}

		
	
	public boolean isNeedsTotal() 
	{
		return needsTotal;
	}
	


}
