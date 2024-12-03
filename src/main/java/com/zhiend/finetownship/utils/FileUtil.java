package com.zhiend.finetownship.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

    private static final String FILE_PATH = "src/main/resources/static/";

    public static String uploadFile(MultipartFile[] files) throws IOException {
        StringBuilder fileNames = new StringBuilder();
        for (MultipartFile file : files) {
            if (file.isEmpty()) continue;
            String fileName = RandomUtils.getRandomFileName(file.getOriginalFilename());
            Files.copy(file.getInputStream(), Paths.get(FILE_PATH + fileName));
            fileNames.append(fileName).append(",");
        }
        if (fileNames.length() > 0) {
            fileNames.deleteCharAt(fileNames.length() - 1);
        }
        return fileNames.toString();
    }

    /**
     * 删除文件列表中的文件
     * @param fileList 逗号分隔的文件名字符串
     * @throws IOException 如果文件删除失败
     */
    public static void deleteFiles(String fileList) throws IOException {
        if (fileList == null || fileList.isEmpty()) {
            return;
        }
        // 分割文件名字符串
        String[] fileNames = fileList.split(",");
        for (String fileName : fileNames) {
            if (fileName.trim().isEmpty()) {
                continue;
            }
            // 构建文件的完整路径
            Path path = Paths.get(FILE_PATH + fileName.trim());
            // 删除文件,如果文件不存在，则不用管
            Files.deleteIfExists(path);
        }
    }
}