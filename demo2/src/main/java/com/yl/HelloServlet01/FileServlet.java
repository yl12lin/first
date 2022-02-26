package com.yl.HelloServlet01;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取文件的地址
        String realPath = "D:\\java-workplace\\demo\\demo2\\src\\main\\resources\\img.png";
        System.out.println("图片的地址为：" + realPath);
        //2.获取文件名字
        String fileName = realPath.substring(realPath.lastIndexOf("\\")+1);
        //3.设置想办法让浏览器支持下载
        resp.setHeader("Content-disposition","attachment;filename"+fileName);
        //4.获取下载文件的一个输入流
        FileInputStream IN = new FileInputStream(realPath);
        //5.创建缓冲区
        int len;
        byte[] buffer = new byte[1024];
        //6.获取OutputStream对象
        ServletOutputStream out = resp.getOutputStream();
        //7.将FileInputStream对象写入buffer缓冲区，使用OutputStream将buffer写到客服端
        while ((len=IN.read(buffer))>0){
            out.write(buffer,0,len);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
