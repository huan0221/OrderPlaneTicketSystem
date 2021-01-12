package cn.edu.hcnu.ui.Mainui;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightServer;
import cn.edu.hcnu.bll.flightserverimpl.FlightServerImpl;

import java.util.Iterator;
import java.util.Scanner;
import java.util.UUID;

public class MainUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)

        {
            System.out.println("请输入相应的数字进行操作：");

            System.out.println("按1,录入航班信息");
            System.out.println("按2，航班信息显示");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预定");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");

            int choice = sc.nextInt();

            if (choice == 1) {
                String id= UUID.randomUUID().toString();
                System.out.print("请输入航班ID：");
                String flightId=sc.next();
                System.out.print("请输入飞机类型：");
                String planetype=sc.next();
                System.out.print("请输入当前座位数：");
                int dangqianSeatsNum=sc.nextInt();
                System.out.print("请输入出发机场：");
                String form=sc.next();
                System.out.print("请输入目的机场：");
                String to=sc.next();
                System.out.print("请输入起飞时间：");
                String formtime=sc.next();

                Flight flight=new Flight(flightId,planetype,dangqianSeatsNum,form,to,formtime);

                IFlightServer iFlightServer=new FlightServerImpl();
                iFlightServer.insertFlight(flight);



            }
        }
    }
    }

