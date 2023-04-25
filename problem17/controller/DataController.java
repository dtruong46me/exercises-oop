package problem17.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
// import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
// import java.io.Reader;
import java.util.Scanner;

import problem17.model.Book;
import problem17.model.Reader;
import problem17.model.ReaderManagement;

public class DataController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;


    public void openFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void openFileToRead(String fileName) {
        try {
            scanner = new Scanner(Paths.get(fileName), "UTF-8");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    void closeFileAfterRead(String fileName) {
        try {
            scanner.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void writeBookToFile(Book book, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(book.getBookID()+"|"+book.getBookName()+"|"+
                            book.getAuthor()+"|"+book.getAuthor()+"|"+book.getQuantity());
        closeFileAfterWrite(fileName);
    }

    void writeReaderToFile(Reader reader, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(reader.getReaderID()+"|"+reader.getFullName()+"|"+
                            reader.getAddress()+"|"+reader.getPhoneNumber());
        closeFileAfterWrite(fileName);
    }

    void writeBRMToFile(ReaderManagement brm, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(brm.getReader().getReaderID()+"|"+brm.getBook().getBookID()+"|"+
                            brm.getNumOfBorrow()+"|"+brm.getStatus());
        closeFileAfterWrite(fileName);
    }

    void closeFileAfterWrite(String fileName) {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Reader> readReaderFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<Reader> readers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            Reader reader = createReadersFromData(data);
            readers.add(reader);
        }

        closeFileAfterRead(fileName);
        return readers;
    }

    public Reader createReadersFromData(String data) {
        String[] datas = data.split("\\|");

        Reader reader = new Reader(Integer.parseInt(datas[0]), datas[1], datas[2], datas[3]);
        return reader;
    }

    public ArrayList<Book> ReadBooksFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<Book> books = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            Book book = createBookFromData(data);
            books.add(book);
        }

        closeFileAfterRead(fileName);
        return books;
    }

    public Book createBookFromData(String data) {
        String[] datas = data.split("\\|");
        Book book = new Book(Integer.parseInt(datas[0]), datas[1], datas[2], datas[3],
                    Integer.parseInt(datas[4]), Integer.parseInt(datas[5]));

        return book;
    }

    public ArrayList<ReaderManagement> readBRMsFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<ReaderManagement> brms = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            ReaderManagement brm = createBRMFromData(data);
            brms.add(brm);
        }

        closeFileAfterRead(fileName);
        return brms;
    }

    public ReaderManagement createBRMFromData(String data) {
        String[] datas = data.split("\\|");
        ReaderManagement brm = new ReaderManagement(new Book(Integer.parseInt(datas[1])),
                        new Reader(Integer.parseInt(datas[0])),
                        Integer.parseInt(datas[2]),datas[3],0);
        return brm;
    }

}
