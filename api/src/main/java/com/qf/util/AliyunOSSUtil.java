package com.qf.util;


import java.awt.Image;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.CreateBucketRequest;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.model.ListObjectsRequest;
import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectListing;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;

import top.snailclimb.common.constants.AliyunOSSConfigConstant;

/**
 * @Author: SnailClimb
 * @Date: 2018/12/1 16:56
 * @Description: 阿里云OSS服务相关工具类.
 * Java API文档地址：https://help.aliyun.com/document_detail/32008.html?spm=a2c4g.11186623.6.703.238374b4PsMzWf
 */
@Component
public class AliyunOSSUtil {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(AliyunOSSUtil.class);
    //private static String FILE_URL;
    private static String bucketName = AliyunOSSConfigConstant.BUCKE_NAME;
    private static String endpoint = AliyunOSSConfigConstant.END_POINT;
    private static String accessKeyId = AliyunOSSConfigConstant.AccessKey_ID;
    private static String accessKeySecret = AliyunOSSConfigConstant.AccessKey_Secret;
    private static String fileHost = AliyunOSSConfigConstant.FILE_HOST;


    /**
     * 上传文件。
     *
     * @param file 需要上传的文件路径
     * @return 如果上传的文件是图片的话，会返回图片的"URL"，如果非图片的话会返回"非图片，不可预览。文件路径为：+文件路径"
     */
    public static JSONObject upLoad(File file,String fileName,Integer adminId) {
    	String fileUrl="";
    	String FILE_URL="";
        // 默认值为：true
        boolean isImage = true;
        // 判断所要上传的图片是否是图片，图片可以预览，其他文件不提供通过URL预览
        try {
            Image image = ImageIO.read(file);
            isImage = image == null ? false : true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.info("------OSS文件上传开始--------" + file.getName());

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        String dateStr = format.format(new Date());

        // 判断文件
        if (file == null) {
            return null;
        }
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            // 判断容器是否存在,不存在就创建
            if (!ossClient.doesBucketExist(bucketName)) {
                ossClient.createBucket(bucketName);
                CreateBucketRequest createBucketRequest = new CreateBucketRequest(bucketName);
                createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
                ossClient.createBucket(createBucketRequest);
            }
            // UUID.randomUUID().toString().replace("-", "") + "-"
            // 设置文件路径和名称
            fileUrl = fileHost + "/"+ (UUID.randomUUID().toString().replace("-", "") + "-" + file.getName());
            System.out.println("fileUrl"+fileUrl);
          
            if (isImage) {//如果是图片，则图片的URL为：....
                FILE_URL = "https://" + bucketName + "." + endpoint + "/" + fileUrl;
            } else {
                FILE_URL = "非图片，不可预览。文件路径为：" + fileUrl;
            }
           System.out.println("FILE_URL"+FILE_URL);
            // 上传文件
            PutObjectResult result = ossClient.putObject(new PutObjectRequest(bucketName, fileUrl, file));
            // 设置权限(公开读)
            ossClient.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);
            if (result != null) {
                logger.info("------OSS文件上传成功------" + fileUrl);
               System.out.println("额度万粉丝对方");
            }
        } catch (OSSException oe) {
            logger.error(oe.getMessage());
        } catch (ClientException ce) {
            logger.error(ce.getErrorMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
        JSONObject outjson= new JSONObject();
        outjson.put("fileUrl", fileUrl);
        outjson.put("FILE_URL", FILE_URL);
        return outjson;
    }
   

    /**
     * 上传文件。
     *
     * @param file 需要上传的文件路径
     * @param folder oss根路径
     * @return 如果上传的文件是图片的话，会返回图片的"URL"，如果非图片的话会返回"非图片，不可预览。文件路径为：+文件路径"
     */
    public static JSONObject upLoad2(File file,String folder) {
    	String fileUrl="";
    	String FILE_URL="";
        // 默认值为：true
        boolean isImage = true;
        // 判断所要上传的图片是否是图片，图片可以预览，其他文件不提供通过URL预览
        try {
            Image image = ImageIO.read(file);
            isImage = image == null ? false : true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.info("------OSS文件上传开始--------" + file.getName());

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        String dateStr = format.format(new Date());

        // 判断文件
        if (file == null) {
            return null;
        }
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            // 判断容器是否存在,不存在就创建
            if (!ossClient.doesBucketExist(bucketName)) {
                ossClient.createBucket(bucketName);
                CreateBucketRequest createBucketRequest = new CreateBucketRequest(bucketName);
                createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
                ossClient.createBucket(createBucketRequest);
            }
            // UUID.randomUUID().toString().replace("-", "") + "-"
            // 设置文件路径和名称
            fileUrl = folder + "/"+ (UUID.randomUUID().toString().replace("-", "") + "-" + file.getName());
            System.out.println("fileUrl"+fileUrl);
          
            if (isImage) {//如果是图片，则图片的URL为：....
                FILE_URL = "https://" + bucketName + "." + endpoint + "/" + fileUrl;
            } else {
                FILE_URL = "非图片，不可预览。文件路径为：" + fileUrl;
            }
            // 上传文件
            PutObjectResult result = ossClient.putObject(new PutObjectRequest(bucketName, fileUrl, file));
            // 设置权限(公开读)
            ossClient.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);
            if (result != null) {
                logger.info("------OSS文件上传成功------" + fileUrl);
               System.out.println("额度万粉丝对方");
            }
        } catch (OSSException oe) {
            logger.error(oe.getMessage());
        } catch (ClientException ce) {
            logger.error(ce.getErrorMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
        JSONObject outjson= new JSONObject();
        outjson.put("fileUrl", fileUrl);
        outjson.put("FILE_URL", FILE_URL);
        return outjson;
    }
    
    
    /**
     * 通过文件名下载文件
     *
     * @param objectName    要下载的文件名
     * @param localFileName 本地要创建的文件名
     */
    public static void downloadFile(String objectName, String localFileName) {

        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        // 下载OSS文件到本地文件。如果指定的本地文件存在会覆盖，不存在则新建。
        ossClient.getObject(new GetObjectRequest(bucketName, objectName), new File(localFileName));
        // 关闭OSSClient。
        ossClient.shutdown();
    }

    /**
     * 列举 test 文件下所有的文件
     */
    public static void listFile() {
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        // 构造ListObjectsRequest请求。
        ListObjectsRequest listObjectsRequest = new ListObjectsRequest(bucketName);

        // 设置prefix参数来获取fun目录下的所有文件。
        listObjectsRequest.setPrefix("test/");
        // 列出文件。
        ObjectListing listing = ossClient.listObjects(listObjectsRequest);
        // 遍历所有文件。
        System.out.println("Objects:");
        for (OSSObjectSummary objectSummary : listing.getObjectSummaries()) {
            System.out.println(objectSummary.getKey());
        }
        // 遍历所有commonPrefix。
        System.out.println("CommonPrefixes:");
        for (String commonPrefix : listing.getCommonPrefixes()) {
            System.out.println(commonPrefix);
        }
        // 关闭OSSClient。
        ossClient.shutdown();
    }
    /**
     * 删除文件
     */
    public static void delFile(String objectName ) {
    	// 创建OSSClient实例。
    	
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
     // 删除文件。
        ossClient.deleteObject(bucketName, objectName);
     // 关闭OSSClient。
        ossClient.shutdown();

    }
}

