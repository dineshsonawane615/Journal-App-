package net.engineeringdigest.journalApp.Repository;

import net.engineeringdigest.journalApp.Entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class UserRepositoryImpl     {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> getUserSA(){
        Query query = new Query();
        query.addCriteria(Criteria.where("email").regex("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"));
        query.addCriteria(Criteria.where("sentimentAnalysis").is(true));

//        Criteria criteria = new Criteria();
//        query.addCriteria(criteria.orOperator(
//                Criteria.where("email").exists(true),
//                Criteria.where("email").ne(null).ne(""),
//                Criteria.where("sentimentAnalysis").is(true)));

//        query.addCriteria(Criteria.where("userName").is("Ram"));
//        query.addCriteria(Criteria.where("age").gte(20));
        List<User> users = mongoTemplate.find(query, User.class);
        return users;
    }

}
