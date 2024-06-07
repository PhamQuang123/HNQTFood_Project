package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.TransactionHistory;

import java.util.List;

public interface TransactionHistoryRepository {
    List<TransactionHistory> findAll();
    List<TransactionHistory> findByEmail();
}
