package cg.hntqfood_project.service;

import cg.hntqfood_project.model.entity.TransactionHistory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface TransactionHistoryService {
    List<TransactionHistory> findAll(HttpServletRequest request, HttpServletResponse response);
    List<TransactionHistory> findByEmail(HttpServletRequest request, HttpServletResponse response);
}
