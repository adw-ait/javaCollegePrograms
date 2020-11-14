package mongoDemo;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.FindIterable;
import java.util.Iterator;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
public class CreatingCollections {

    public static void main( String args[] ) {

        connectToDB c = new connectToDB();

//        Accessing the database
        MongoDatabase database = c.mongo.getDatabase("Student");
        //Creating a collection
//        database.createCollection("personInfo");
//        System.out.println("Collection created successfully");

        // Retrieving a collection
        MongoCollection<Document> collection = database.getCollection("personInfo");
        System.out.println("Collection selected");
//
////        inserting some documents
//
//
//        Document document1 = new Document("Name", "Chinmay")
//                .append("City", "Mumbai")
//                .append("Phone", "8746124574")
//                .append("Roll no", "2019450058")
//                .append("Interests","Anime");
//
//        Document document2 = new Document("Name", "Advait")
//                .append("City", "Wardha")
//                .append("Phone", "8465741254")
//                .append("Roll no", "2019450060");
//
//        Document document3 = new Document("Name", "Sanket")
//                .append("City", "Mumbai")
//                .append("Phone", "8746124574")
//                .append("Roll no", "2019450044")
//                .append("Good At","Web development");
//
////        Inserting document into the collection
//        collection.insertOne(document1);
//        System.out.println("Document inserted successfully");
//
//        collection.insertOne(document2);
//        System.out.println("Document inserted successfully");
//
//        collection.insertOne(document3);
//        System.out.println("Document inserted successfully");
//
//         //show documents
//        FindIterable<Document> iterDoc = collection.find();
//        int i = 1;
//        // Getting the iterator
//        Iterator it = iterDoc.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//            i++;
//        }

//        update document
//        collection.updateOne(Filters.eq("Name", "Chinmay"), Updates.set("Roll no", 2019450057));
//        System.out.println("Document update successfully...");
//
////        delete document
        collection.deleteOne(Filters.eq("Name", "Chinmay"));
        System.out.println("Document deleted successfully...");
//
////        dropping a collection
//        collection.drop();
//        System.out.println("Collection dropped successfully...");
    }
}