package com.example.demo.controller;

import cn.hutool.core.text.csv.CsvData;
import cn.hutool.core.text.csv.CsvReader;
import cn.hutool.core.text.csv.CsvRow;
import cn.hutool.core.text.csv.CsvUtil;
import cn.hutool.core.util.CharsetUtil;
import org.apache.poi.util.IOUtils;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cirilla
 * @projectName demo
 * @description:
 * @date 2019/7/15  14:02
 */
@RestController
public class FileController {

    private String path = "logs/test.csv";

    @PostMapping("/upload")
    public Boolean upload(@RequestParam("file") MultipartFile mf) throws IOException {
        if (mf.isEmpty()) {
            return false;
        }
        File file = File.createTempFile(System.currentTimeMillis() + "",".csv");
        mf.transferTo(file);

        /*InputStream inputStream = mf.getInputStream();
        byte[] bytes = IOUtils.toByteArray(inputStream);
        FileOutputStream out = new FileOutputStream(file);
        out.write(bytes);
        out.close();*/
        CsvReader reader = CsvUtil.getReader();
        CsvData read = reader.read(file, CharsetUtil.CHARSET_GBK);
        List<CsvRow> rows = read.getRows();
        rows.forEach(eo -> {
            String s4 = eo.get(0);
            System.out.println(s4);
            String s3 = eo.get(1);
            System.out.println(s3);
            String s2 = eo.get(2);
            System.out.println(s2);
//            System.out.println(rawList);

        });


        return true;
    }
}
