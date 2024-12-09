package com.example.expensetracker.domain.usecase.read_database

import com.example.expensetracker.data.local.entity.TransactionDto
import com.example.expensetracker.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllTransactionUseCase @Inject constructor(private val repo: TransactionRepository) {
    operator fun invoke(): Flow<List<TransactionDto>?> {
        return repo.getAllTransaction()
    }
}