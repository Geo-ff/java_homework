package com.milotnt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 将数据库表导出为Excel文件的工具类。
 */
public class ExportToExcel {

    public static void main(String[] args) {
        // 数据库连接信息
        String jdbcUrl = "jdbc:mysql://192.168.14.128:3306/gym_management_system";
        String username = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // 分别导出各个表格到Excel文件
            exportTableToExcel(connection, "admin", "E:\\Java_project\\gym-management-system-master\\健身房管理系统信息汇总表_Admin.xlsx");
            exportTableToExcel(connection, "class_order", "E:\\Java_project\\gym-management-system-master\\健身房管理系统信息汇总表_ClassOrder.xlsx");
            exportTableToExcel(connection, "class_table", "E:\\Java_project\\gym-management-system-master\\健身房管理系统信息汇总表_ClassTable.xlsx");
            exportTableToExcel(connection, "employee", "E:\\Java_project\\gym-management-system-master\\健身房管理系统信息汇总表_Employee.xlsx");
            exportTableToExcel(connection, "equipment", "E:\\Java_project\\gym-management-system-master\\健身房管理系统信息汇总表_Equipment.xlsx");
            exportTableToExcel(connection, "member", "E:\\Java_project\\gym-management-system-master\\健身房管理系统信息汇总表_Member.xlsx");

            System.out.println("文件创建成功！");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 将数据库表导出为Excel文件。
     *
     * @param connection 数据库连接
     * @param tableName  表名
     * @param outputPath 导出文件路径
     */
    private static void exportTableToExcel(Connection connection, String tableName, String outputPath) {
        String sql = "SELECT * FROM " + tableName;

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet(tableName);

            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // 创建表头行
            Row headerRow = sheet.createRow(0);
            for (int i = 1; i <= columnCount; i++) {
                Cell cell = headerRow.createCell(i - 1);
                cell.setCellValue(metaData.getColumnName(i));
            }

            int rowNum = 1;
            // 填充数据行
            while (resultSet.next()) {
                Row dataRow = sheet.createRow(rowNum++);
                for (int i = 1; i <= columnCount; i++) {
                    Cell cell = dataRow.createCell(i - 1);
                    cell.setCellValue(resultSet.getString(i));
                }
            }

            // 写入Excel文件
            try (FileOutputStream fileOut = new FileOutputStream(outputPath)) {
                workbook.write(fileOut);
            }

            System.out.println("Exported table " + tableName + " to Excel file: " + outputPath);

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
