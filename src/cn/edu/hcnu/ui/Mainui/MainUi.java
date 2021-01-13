package cn.edu.hcnu.ui.Mainui;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightServer;
import cn.edu.hcnu.bll.flightserverimpl.FlightServerImpl;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUi {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入相应的数字进行操作：");

            System.out.println("按1,录入航班信息");
            System.out.println("按2，航班信息显示");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预定");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");

            int choice = sc.nextInt();

            if (choice == 1) {
                String id = UUID.randomUUID().toString().replace("-", "");
                System.out.print("请输入航班ID：");
                String flightId = sc.next();
                System.out.print("请输入飞机类型：");
                String planetype = sc.next();
                System.out.print("请输入当前座位数：");
                int dangqianSeatsNum = sc.nextInt();
                System.out.print("请输入出发机场：");
                String form = sc.next();
                System.out.print("请输入目的机场：");
                String to = sc.next();
                System.out.print("请输入起飞时间：");
                String formtime = sc.next();

                Flight flight = new Flight(id, flightId, planetype, dangqianSeatsNum, form, to, formtime);

                IFlightServer iFlightServer = new FlightServerImpl();
                //iFlightServer.insertFlight(flight);
                try {
                    iFlightServer.insertFlight(flight);
                } catch (SQLException e) {
                    String errorMessage = e.getMessage();
                    if (errorMessage.startsWith("ORA-12899")) {
                        //ORA-12899: value too large for column "OPTS"."FLIGHT"."ID" (actual: 32, maximum: 30)
                        // 按指定模式在字符串查找
                        String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                        // 创建 Pattern 对象
                        Pattern r = Pattern.compile(pattern);
                        // 现在创建 matcher 对象
                        Matcher m = r.matcher(errorMessage);
                        if (m.find()) {
                            String tableName = m.group(4);
                            String columnName = m.group(5);
                            System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查");
                        } else {
                            System.out.println("NO MATCH");
                        }
                    }
                }
            }
            else if(choice==2){
                //IFlightServer iFlightServer=new FlightServerImpl();
                IFlightServer iFlightServer = new FlightServerImpl();
                try{
                    Set<Flight> allFlights=iFlightServer.getAllFlights();
                    /*
                    Set的遍历需要用到迭代器
                     */
                    for(Flight flight:allFlights){
                        System.out.println(flight);
                    }
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}


