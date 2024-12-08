package com.example.musicapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/files")
public class LocalFileController {

    private final String uploadDir = "../music"; // Укажите путь к директории

    public LocalFileController() {
        // Создаем директорию, если она не существует
        File directory = new File(uploadDir);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            // Получаем имя файла
            String fileName = file.getOriginalFilename();
            // Создаем файл в указанной директории
            File destinationFile = new File(uploadDir + File.separator + fileName);
            // Сохраняем файл
            file.transferTo(destinationFile);
            return ResponseEntity.ok("File uploaded successfully: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File upload failed");
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteFile(@RequestParam("fileName") String fileName) {
        File file = new File(uploadDir + File.separator + fileName);
        if (file.exists() && file.delete()) {
            return ResponseEntity.ok("File deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("File not found");
        }
    }

    @GetMapping("/list")
    public ResponseEntity<String[]> listFiles() {
        File directory = new File(uploadDir);
        String[] fileList = directory.list();
        if (fileList != null) {
            return ResponseEntity.ok(fileList);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new String[]{"Error fetching file list"});
        }
    }
}
