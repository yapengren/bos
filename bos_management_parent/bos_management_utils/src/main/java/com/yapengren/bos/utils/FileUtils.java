package com.yapengren.bos.utils;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import sun.misc.BASE64Encoder;

public class FileUtils {
    /**
     * 下载文件时，针对不同浏览器，进行附件名的编码
     *
     * @param filename
     * @param request
     * @return
     * @throws IOException
     */
    public static String encodeDownloadFilename(String filename, HttpServletRequest request) throws IOException {
        String agent = request.getHeader("User-Agent");

        // 火狐浏览器
        if (agent.contains("Firefox")) {
            filename = "=?UTF-8?B?"
                    + new BASE64Encoder().encode(filename.getBytes("utf-8"))
                    + "?=";
            filename = filename.replaceAll("\r\n", "");
        } else { // IE及其他浏览器
            filename = URLEncoder.encode(filename, "utf-8");
            filename = filename.replace("+", " ");
        }
        return filename;
    }
}
