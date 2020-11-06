package com.andy.demo.controller;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 * @author: weipeng
 * @create: 2020-11-06 10:50
 * @description:
 */
@RestController
@RequestMapping("/excel")
public class ExcelController {

    @GetMapping("/exportExcel")
    public void addAccount(HttpServletResponse response) throws IOException {
        ServletOutputStream out = response.getOutputStream();
        List<UserCheck> list = CollUtil.newArrayList();
        list.add(new UserCheck("2020-10-10", "jack", 10, "2000"));
        list.add(new UserCheck("2020-10-11", "lucas", 10, "2000"));
        list.add(new UserCheck("2020-10-10", "jefrri", 10, "2000"));
        list.add(new UserCheck("2020-10-11", "jenie", 10, "2000"));

        // 通过工具类创建writer，默认创建xls格式
        ExcelWriter writer = ExcelUtil.getWriter(true);
        // 一次性写出内容，使用默认样式，强制输出标题
        writer.merge(3, "财务审单绩效报表");
        writer.addHeaderAlias("date", "日期");
        writer.addHeaderAlias("name", "人员姓名");
        writer.addHeaderAlias("num", "已付款订单数量");
        writer.addHeaderAlias("money", "付款金额(¥)");

        // writer格式
        CellStyle cellStyle = writer.getCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        Font cellFont = writer.createFont();
        cellFont.setFontHeightInPoints((short) 15);
        cellStyle.setFont(cellFont);

        //单元格   居左 不加粗
        CellStyle style1 = writer.getWorkbook().createCellStyle();
        style1.setAlignment(HorizontalAlignment.LEFT);
        Font font1 = writer.getWorkbook().createFont();
        font1.setFontHeightInPoints((short) 15);
        style1.setFont(font1);

        //单元格   居左 加粗
        CellStyle style2 = writer.getWorkbook().createCellStyle();
        style2.setBorderTop(BorderStyle.THIN);
        style1.setAlignment(HorizontalAlignment.LEFT);
        Font font2 = writer.getWorkbook().createFont();
        font2.setBold(true);
        font2.setFontHeightInPoints((short) 15);
        style2.setFont(font2);


        writer.merge(3, "统计周期:2020年10月1日-2020年10月31日",false);
        writer.setStyle(style1,"A2");

        writer.merge(3, "明细",false);
        writer.setStyle(style2,"A3,B3,C3,D3");
        //out为OutputStream，需要写出到的目标流
        CellStyle headStyle = writer.getHeadCellStyle();
        Font font = writer.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 16);
        headStyle.setFont(font);
        Sheet sheet = writer.getSheet();
        sheet.setColumnWidth(0,3600);
        sheet.setColumnWidth(1,4200);
        sheet.setColumnWidth(2,5300);
        sheet.setColumnWidth(3,5300);
        writer.write(list, true);

        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        String name ="财务审单绩效报表";
        name = URLEncoder.encode(name, String.valueOf(StandardCharsets.UTF_8));
        //test.xls是弹出下载对话框的文件名，不能为中文，中文请自行编码
        response.setHeader("Content-Disposition", "attachment;filename="+name+".xlsx");
        writer.flush(out, true);
        // 关闭writer，释放内存
        writer.close();
        //此处记得关闭输出Servlet流
        IoUtil.close(out);
    }
}
