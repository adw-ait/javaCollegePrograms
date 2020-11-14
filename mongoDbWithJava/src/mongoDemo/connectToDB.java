package mongoDemo;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
public class connectToDB {
    MongoClient mongo;
    MongoCredential credential;
    connectToDB(){
        mongo = new MongoClient( "localhost" , 27017 );

        credential = MongoCredential.createCredential("sampleUser", "Student", "password".toCharArray());
        System.out.println("Connected to the database");
    }
}