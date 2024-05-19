package com.example.pdfupload.service;

import com.example.pdfupload.entity.PDFFile;
import com.example.pdfupload.repository.PDFFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PDFFileService {

    @Autowired
    private PDFFileRepository pdfFileRepository;

    public PDFFile saveFile(MultipartFile file) throws IOException {
        PDFFile pdfFile = new PDFFile();
        pdfFile.setName(file.getOriginalFilename());
        pdfFile.setData(file.getBytes());
        return pdfFileRepository.save(pdfFile);
    }

    public PDFFile getFile(Long id) {
        return pdfFileRepository.findById(id).orElse(null);
    }
}