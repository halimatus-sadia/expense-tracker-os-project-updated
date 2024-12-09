package com.example.expensetracker.domain.usecase.read_database

import com.example.expensetracker.data.local.entity.AccountDto
import com.example.expensetracker.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAccountUseCase @Inject constructor(private val repo: TransactionRepository) {

    operator fun invoke(account: String): Flow<AccountDto> {
        return repo.getAccount(account)
    }
}