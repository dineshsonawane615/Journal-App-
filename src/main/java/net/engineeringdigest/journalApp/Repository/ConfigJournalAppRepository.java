package net.engineeringdigest.journalApp.Repository;

import net.engineeringdigest.journalApp.Entry.ConfigJournalEntity;
import net.engineeringdigest.journalApp.Entry.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalEntity, ObjectId> {

}
