package com.example.recapitulationapps.data

import com.example.recapitulationapps.data.datasource.DataSource

class RemoteDataSource(
    private val dataSource: DataSource,
    private val globalDataSource: GlobalDataSource
) {
}