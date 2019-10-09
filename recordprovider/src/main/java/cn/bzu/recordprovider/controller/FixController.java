package cn.bzu.recordprovider.controller;


import cn.bzu.recordprovider.mapper.FixMapper;
import cn.bzu.recordprovider.pojo.Fix;
import cn.bzu.recordprovider.service.FixService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2019-10-07
 */
@RestController
public class FixController {
    
    
    @Resource
    FixMapper fixMapper;
    @GetMapping(value = "/excel" )
    public void getExcel (HttpServletResponse response) throws Exception {
        System.out.println("开始报表");

        List<Fix> fixes = fixMapper.selectFixs();

        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet =wb.createSheet("fix");
        HSSFRow row = null;

        row = sheet.createRow(0);
        
        row.setHeight((short)(22.50*20));
        row.createCell(0).setCellValue("计划id");
        row.createCell(1).setCellValue("维修人");
        row.createCell(2).setCellValue("维修时间");
        row.createCell(3).setCellValue("维修地点");
        row.createCell(4).setCellValue("维修信息");
        row.createCell(5).setCellValue("是否完成");

        for(int i = 0;i < fixes.size();i++){
            row = sheet.createRow(i+1);
            Fix fix = fixes.get(i);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(fix.getFixDate());
            row.createCell(0).setCellValue(fix.getFixId());
            row.createCell(1).setCellValue(fix.getFixPeo());
            row.createCell(2).setCellValue(date);
            row.createCell(3).setCellValue(fix.getFixRoom());
            row.createCell(4).setCellValue(fix.getFixInfo());
            row.createCell(5).setCellValue(fix.getIfFinish() == 0 ? "未完成" : "完成");

        }         //默认行高
        sheet.setDefaultRowHeight((short)(16.5*25));        //列宽自适应
        for(int i=0;i<=13;i++){
            sheet.autoSizeColumn(i);
        }

        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        OutputStream os = response.getOutputStream();
        wb.write(os);
        os.flush();
        os.close();

    }

}

