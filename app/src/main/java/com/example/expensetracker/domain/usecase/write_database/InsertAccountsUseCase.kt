package com.example.expensetracker.domain.usecase.write_database

import com.example.expensetracker.data.local.entity.AccountDto
import com.example.expensetracker.domain.repository.TransactionRepository
import javax.inject.Inject

class InsertAccountsUseCase @Inject constructor(private val repo: TransactionRepository) {

    suspend operator fun invoke(account: List<AccountDto>) {
        repo.insertAccount(account)
    }
}