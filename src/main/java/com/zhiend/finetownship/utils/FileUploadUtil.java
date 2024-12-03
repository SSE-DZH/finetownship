package com.zhiend.finetownship.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUploadUtil {

    private static final String FILE_PATH = "src/main/resources/static/";

    public static String uploadFile(MultipartFile[] files) throws IOException {
        StringBuilder fileNames = new StringBuilder();
        for (MultipartFile file : files) {
            if (file.isEmpty()) continue;
            String fileName = RandomName.getRandomName(file.getOriginalFilename());
            Files.copy(file.getInputStream(), Paths.get(FILE_PATH + fileName));
            fileNames.append(fileName).append(",");
        }
        if (fileNames.length() > 0) {
            fileNames.deleteCharAt(fileNames.length() - 1);
        }
        return fileNames.toString();
    }
}