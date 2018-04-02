package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@Controller
public class UploadController {

    @RequestMapping("upload")
    public String upload(HttpServletRequest request)
            throws IllegalStateException, IOException {
        String filePath = "";

        //将当前上下文初始化 (多部分解析器 multipartResolver)
        CommonsMultipartResolver multipartResolver =
                new CommonsMultipartResolver(request.getServletContext());
        // 检查 form 中是否有 enctype="multipart/form-data"
        if (multipartResolver.isMultipart(request)) {
            // 有文件需上传
            // 获取请求对象
            MultipartHttpServletRequest multiRequest =
                    (MultipartHttpServletRequest) request;
            // 获取文件名
            Iterator<String> it = multiRequest.getFileNames();
            while (it.hasNext()) {
                MultipartFile multipartFile = multiRequest.getFile(it.next());
                if (multipartFile != null) {
                    //System.out.println(multipartFile.getOriginalFilename());
                    // 服务器端的保存路径 tomcat/webapps/xxx/upload
                    String path = request.getServletContext().getRealPath("upload");
                    File dir = new File(path);
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }

                    // 文件存储的完整路径
                    //path = dir.getAbsolutePath() + "/" + multipartFile.getOriginalFilename();
                    //System.out.println(path);

                    // 保存到数据库的是相对路径:
                    //filePath = "upload/" + multipartFile.getOriginalFilename();

                    // 复制文件
                    //multipartFile.transferTo(new File(path));

                    // 重命名,避免文件冲突
                    // 原文件名
                    String fileName = multipartFile.getOriginalFilename();
                    // 获取原文件的后缀
                    String suffix = fileName.substring(fileName.lastIndexOf("."));
                    long systemTime = System.currentTimeMillis();

                    // 新文件名
                    filePath = "upload/" + systemTime + suffix;
                    multipartFile.transferTo(new File(dir, systemTime + suffix));
                }
            }
        }
        String content = request.getParameter("content");
        System.out.println("文件存储路径: " + filePath);
        System.out.println("内容描述: " + content);

        // 保存到数据: filePath:images/xx.jpg  content:长沙火宫殿
        return "index";
    }
}
