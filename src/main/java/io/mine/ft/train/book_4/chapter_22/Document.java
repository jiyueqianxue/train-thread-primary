package io.mine.ft.train.book_4.chapter_22;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
	
	private boolean changed = false;
	
	private List<String> content = new ArrayList<>();
	
	private final FileWriter writer;
	
	private static AutoSaveThread autoSaveThread;

	public Document(String documentPath, String documentName) throws IOException {
		this.writer = new FileWriter(new File(documentPath, documentName));
	}
	
	public static Document create(String documentPath, String documentName) throws IOException {
		
		Document document = new Document(documentPath, documentName);
		autoSaveThread = new AutoSaveThread(document);
		autoSaveThread.start();
		return document;
	}
}
