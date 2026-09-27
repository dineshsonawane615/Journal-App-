//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.Entry.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController {
//
//    private Map<Long, JournalEntry> journalEntrymap = new HashMap<>();
//
//    @GetMapping
//    public ArrayList<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntrymap.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        journalEntrymap.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable long myId){
//        return journalEntrymap.get(myId);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry DeleteJournalEntryById(@PathVariable long myId){
//        return journalEntrymap.remove(myId);
//    }
//
//    @PutMapping("id/{id}")
//    public JournalEntry updateJournalById(@PathVariable long id,@RequestBody JournalEntry myEntry){
//        return journalEntrymap.put(id,myEn