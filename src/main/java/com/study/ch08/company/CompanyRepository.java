package com.study.ch08.company;

public class CompanyRepository {
    final Company[] companies;

    CompanyRepository(Company[] companies) {
        this.companies = companies;
    }

    int getEmptyIndex() {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Company company) {
        companies[getEmptyIndex()] = company;
    }
}
