package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.TransactionHistory;
import cg.hntqfood_project.repository.TransactionHistoryRepository;
import cg.hntqfood_project.repository.impl.TransactionHistoryRepositoryImp;
import cg.hntqfood_project.service.ShoppingCartService;
import cg.hntqfood_project.service.TransactionHistoryService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class TransactionHistoryServiceImp implements TransactionHistoryService {
    private TransactionHistoryRepository transactionHistoryRepository;
    private ShoppingCartService shoppingCartService;

    public TransactionHistoryServiceImp() {
        transactionHistoryRepository = new TransactionHistoryRepositoryImp();
        shoppingCartService = new ShoppingCartServiceImp();
    }

    @Override
    public List<TransactionHistory> findAll(HttpServletRequest request, HttpServletResponse response) {
        List<TransactionHistory> transactionHistoryList ;
        transactionHistoryList = transactionHistoryRepository.findAll();
        return transactionHistoryList;
    }

    @Override
    public List<TransactionHistory> findByEmail(HttpServletRequest request, HttpServletResponse response) {
        List<TransactionHistory> transactionHistoryList ;
        String email = shoppingCartService.findEmailOnline(request, response);
        transactionHistoryList = transactionHistoryRepository.findByEmail(email);
        return transactionHistoryList;
    }
}
