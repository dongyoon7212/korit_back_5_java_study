package com.study.ch08.company;

public class CompanyService {
    CompanyRepository companyRepository;

    CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    boolean isFull() {
        return companyRepository.getEmptyIndex() == -1;
    }
}
