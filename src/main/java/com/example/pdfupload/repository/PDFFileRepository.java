package com.example.pdfupload.repository;

import com.example.pdfupload.entity.PDFFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PDFFileRepository extends JpaRepository<PDFFile, Long> {
}