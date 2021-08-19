package com.zeneto.bookstoremanager.author.service;

import com.zeneto.bookstoremanager.author.builder.AuthorDTOBuilder;
import com.zeneto.bookstoremanager.author.dto.AuthorDTO;
import com.zeneto.bookstoremanager.author.mapper.AuthorMapper;
import com.zeneto.bookstoremanager.author.repository.AuthorRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceTeste {

    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    @Mock
    private AuthorRepository authorRepository;

    @InjectMocks
    private AuthorService authorService;

    private AuthorDTOBuilder authorDTOBuilder;

    @BeforeEach
    void setUp() {
        authorDTOBuilder = AuthorDTOBuilder.builder().build();
        AuthorDTO authorDTO = authorDTOBuilder.buildAuthorDTO();


    }
}
