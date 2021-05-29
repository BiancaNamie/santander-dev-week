package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
       val cliente = Cliente("usuário")
       val cartao = Cartao("3124 5434 1323 3443")
        return Conta(
           "275369-5",
           "2344-3",
           "R$: 1235,76",
            "R$: 2533,58",
           cliente,
           cartao
       )
    }
}