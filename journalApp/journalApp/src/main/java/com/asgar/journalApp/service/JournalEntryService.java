package com.asgar.journalApp.service;


import com.asgar.journalApp.Repository.JournalEntryRepository;
import com.asgar.journalApp.entitiy.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class JournalEntryService {


    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public  void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }


}
