package com.databaes.civilens.scheme.service;

import com.databaes.civilens.scheme.model.Scheme;
import com.databaes.civilens.scheme.repository.SchemeRepository;
import org.springframework.stereotype.Service;

@Service
public class SchemeServiceImpl implements SchemeService {

    private final SchemeRepository schemeRepository;

    public SchemeServiceImpl(SchemeRepository schemeRepository) {
        this.schemeRepository = schemeRepository;
    }

    @Override
    public void createScheme(Scheme scheme) {
        schemeRepository.save(scheme);
    }
}
