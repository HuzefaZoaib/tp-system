package com.training.dao;

import java.util.ArrayList;
import java.util.List;

import com.training.model.Deal;

public class DealDao {

	private static List<Deal> DEALS = new ArrayList<Deal>();
	
	private static final DealDao INSTANCE = new DealDao();
	private static Integer SEQUENCE = 0;
	
	private DealDao() {}
	
	public static DealDao getInstance() {
		return INSTANCE;
	}
	
	public void addDeal(Deal deal) {
		deal.setId(++SEQUENCE);
		DEALS.add(deal);
	}

}
