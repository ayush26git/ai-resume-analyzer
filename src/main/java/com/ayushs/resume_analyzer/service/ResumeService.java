package com.ayushs.resume_analyzer.service;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ResumeService {

    public String extractText(MultipartFile file) throws Exception {

        PDDocument document = Loader.loadPDF(file.getBytes());

        PDFTextStripper pdfTextStripper = new PDFTextStripper();

        String result = pdfTextStripper.getText(document);

        document.close();

        return result;
    }
}
