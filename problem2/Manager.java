package problem2;

import java.util.List;
import java.util.ArrayList;

public class Manager {
    List<Document> documents;

    public Manager() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        this.documents.add(document);
    }

    public boolean deleteDoc(String docID) {
        Document docs = this.documents.stream().filter(doc -> doc.getDocID().equals(docID)).findFirst().orElse(null);
        if (docs == null) {
            return false;
        }
        this.documents.remove(docs);
        return true;
    }

    public void showInfor() {
        this.documents.forEach(documents -> System.out.println(documents.toString()));
    }

    public void searchByBook() {
        this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByMagazine() {
        this.documents.stream().filter(doc -> doc instanceof Magazine).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByNewspaper() {
        this.documents.stream().filter(doc -> doc instanceof Newspaper).forEach(doc -> System.out.println(doc.toString()));
    }
}
