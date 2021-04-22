package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class FileController {
    @RequestMapping(value = "teacher/fileUpload",method=RequestMethod.GET)
    public String pageForFileUpload(){
//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("lesson/fileUpload");
        return "lesson/fileUpload";
    }

    @RequestMapping(value = "teacher/lesson/fileUpload",method= RequestMethod.POST)
    public String singleFileUpload(@RequestParam(name="file") MultipartFile file, HttpServletRequest request){
        if(file == null){
            request.setAttribute("msg","请选择上传文件");
            return "result";
        }
        if(file.isEmpty()){
            request.setAttribute("msg","上传文件内容为空！");
            return "result";
        }
        try {
//        存放文件的文件夹
            String  filePath=request.getSession().getServletContext().getRealPath("/upload");
            File root =new File(filePath);
            if(!root.exists()){
                root.mkdir();
            }
//        设置文件名称
            String fileName=file.getOriginalFilename();
            fileName=System.currentTimeMillis()+fileName.substring((fileName.lastIndexOf(".")));
//        文件的拷贝
            file.transferTo(new File(root,fileName));
            request.setAttribute("msg","文件上传成功");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("msg","文件上传失败");
        }

        return "result";

    }


}