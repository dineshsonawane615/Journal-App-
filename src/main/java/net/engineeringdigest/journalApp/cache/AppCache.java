package net.engineeringdigest.journalApp.cache;

import jakarta.annotation.PostConstruct;
import net.engineeringdigest.journalApp.Entry.ConfigJournalEntity;
import net.engineeringdigest.journalApp.Repository.ConfigJournalAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class AppCache  {

    @Autowired
    private ConfigJournalAppRepository configJournalAppRepository;

    public Map<String, String> APP_CACHE;

    @PostConstruct
    public void init() {
        List<ConfigJournalEntity> all = configJournalAppRepository.findAll();
        for (ConfigJournalEntity configJournalEntity : all) {
            APP_CACHE.put(configJournalEntity.getKey(), configJournalEntity.getValue());
        }
    }
}
