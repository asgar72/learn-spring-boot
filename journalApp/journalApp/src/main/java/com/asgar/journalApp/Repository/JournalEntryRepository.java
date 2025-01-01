package com.asgar.journalApp.Repository;

import com.asgar.journalApp.entitiy.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {
}

