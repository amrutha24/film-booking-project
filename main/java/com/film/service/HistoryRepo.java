package com.film.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.film.beans.OrderHistory;

@Repository
public interface HistoryRepo extends JpaRepository<OrderHistory, Long>
{
	@Query(value = "select * from order_history where customer_b_id=? ORDER BY h_id DESC", nativeQuery = true)
	public List<OrderHistory> getAllHistory(long id);	
}
